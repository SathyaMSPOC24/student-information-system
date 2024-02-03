package com.example.studentinformation.repo;

import com.example.studentinformation.StudentInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<StudentInfo,Integer> {



}
