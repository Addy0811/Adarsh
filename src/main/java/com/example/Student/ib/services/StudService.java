package com.example.Student.ib.services;

import com.example.Student.ib.modals.Student;
import com.example.Student.ib.repository.StuRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudService {
    @Autowired
    StuRepos stuRepos;

    public void addStudent(Student student) {
        stuRepos.save(student);
    }

    public Student getStu(int id) {
        Student student = stuRepos.findById(id).get();
        return student;
    }

    public void update(int id, String name) {

        Student student = stuRepos.findById(id).get();
        student.setName(name);
        stuRepos.save(student);
    }

    public void delete(int id) {
        stuRepos.deleteById(id);
    }
}
