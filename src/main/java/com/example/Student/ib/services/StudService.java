package com.example.Student.ib.services;

import com.example.Student.ib.modals.Card;
import com.example.Student.ib.modals.CardStatus;
import com.example.Student.ib.modals.Student;
import com.example.Student.ib.repository.StuRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudService {
    @Autowired
    StuRepos stuRepos;


    public String addStudent(Student student) {
        Card card = new Card();
        card.setCardStatus(CardStatus.Activated);
        card.setDue(4500);
        student.setCard(card);
        card.setSvn(student);
        stuRepos.save(student);
        return "Student Added";
    }
//    public void addStudent(Student student) {
//        stuRepos.save(student);
//    }

    public Student getStu(int id) {
        Student student = stuRepos.findById(id).get();
        return student;
    }

    public void update(int id, String name) {

        Student student = stuRepos.findById(id).get();
        student.setName(name);
        stuRepos.save(student);
    }

    public Student delete(int id) {
        stuRepos.deleteById(id);
        return new Student();
    }

//    public void delete(int id) {
//        stuRepos.deleteById(id);
//    }
}
