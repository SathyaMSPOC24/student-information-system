package com.example.studentinformation;

import com.example.studentinformation.model.StudentVehicleInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/")
    public String hello(){
        return studentService.service();
    }

    @PostMapping("/saveStudent")
    public String saveStudent(@RequestBody StudentInfo studentInfo) {
        studentService.saveStudent(studentInfo);
        return "saved successfully";
    }

    @GetMapping("/getAll")
    public List<StudentInfo> getAll(){
        return studentService.getStudentsInfo();
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<StudentInfo> getStudentInfo(@PathVariable Integer id){
        Optional<StudentInfo> studentInfoOptional = studentService.getById(id);
        if(studentInfoOptional.isPresent()) {
            return new ResponseEntity<>(studentInfoOptional.get(), HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }

    @GetMapping("/student/{id}")
    public List<StudentVehicleInfo> getStudentVehicleName(@PathVariable  Integer id){
        String url = "http://localhost:8081/student/";
        RestTemplate restTemplate = new RestTemplate();
        StudentVehicleInfo[] studentInfo= restTemplate.getForEntity(url+id, StudentVehicleInfo[].class).getBody();
        List<StudentVehicleInfo> resultList= Arrays.asList(studentInfo);
        return resultList;

    }


}
