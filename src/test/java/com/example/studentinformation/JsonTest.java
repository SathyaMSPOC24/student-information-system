package com.example.studentinformation;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonTest {
    public static void main(String arg[]) throws Exception{
        StudentInfo studentInfo = new StudentInfo();
        studentInfo.setStudentName("Sruthi");
        studentInfo.setAddress("kolathuir");
        studentInfo.setFatherName("Srinivasan");

        ObjectMapper objectMapper = new ObjectMapper();
        System.out.println(" Json String "+objectMapper.writeValueAsString(studentInfo));

    }
}
