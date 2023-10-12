package com.example.Student.ib.repository;

import com.example.Student.ib.modals.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StuRepos extends JpaRepository<Student,Integer> {

}
