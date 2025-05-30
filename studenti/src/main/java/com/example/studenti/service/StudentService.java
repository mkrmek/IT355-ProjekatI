package com.example.studenti.service;

import com.example.studenti.model.Student;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StudentService {
    private final Map<Integer, Student> studenti = new HashMap<>();
    private int trenutniId = 1;

    public List<Student> sviStudenti() {
        return new ArrayList<>(studenti.values());
    }

    public void dodajStudenta(Student student) {
        student.setId(trenutniId++);
        studenti.put(student.getId(), student);
    }

    public Student nadjiStudenta(int id) {
        return studenti.get(id);
    }

    public void izmeniStudenta(Student student) {
        studenti.put(student.getId(), student);
    }

    public void obrisiStudenta(int id) {
        studenti.remove(id);
    }
}
