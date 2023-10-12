package com.example.Student.ib.controller;

import com.example.Student.ib.modals.Student;
import com.example.Student.ib.repository.StuRepos;
import com.example.Student.ib.services.StudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudService studService;
    @PostMapping("/add")
    public void addStudent(@RequestBody Student student){
       studService.addStudent(student);

    }
    @DeleteMapping("/del/{id}")
    public void delete(@PathVariable int id){
        studService.delete(id);
    }

    @GetMapping("/get/{id}")
    public Student get(@PathVariable("id") int id){
        return studService.getStu(id);
    }

    @PutMapping("/update")
    public void update(@RequestParam int id, @RequestParam String name){
        studService.update(id,name);
    }
}
