package com.example.studentinformation;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentInfo {
    @GeneratedValue
    @Id
    private int id;
    private String studentName;
    private String fatherName;
    private String phoneNumber;
    private String email;
    private String gender;
    private String dob;
    private String address;
    private String bloodGroup;
    private String department;
    private String course;

}
