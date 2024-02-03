package com.example.studentinformation;

import com.example.studentinformation.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepo  studentRepo;
    public String service(){
        return "Service Called";
    }



    public void saveStudent(StudentInfo studentInfo) {
        studentRepo.save(studentInfo);
    }

    public List<StudentInfo> getStudentsInfo(){

        return  studentRepo.findAll();
    }

    public Optional<StudentInfo> getById(Integer studentId){
        return  studentRepo.findById(studentId);
    }
}
