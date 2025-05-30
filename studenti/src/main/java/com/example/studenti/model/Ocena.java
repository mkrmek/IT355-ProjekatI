package com.example.studenti.model;

import java.time.LocalDate;

public class Ocena {
    private int id;
    private String student;
    private String predmet;
    private int ocena;
    private LocalDate datum;

    public Ocena() {
    }

    public Ocena(int id, String student, String predmet, int ocena, LocalDate datum) {
        this.id = id;
        this.student = student;
        this.predmet = predmet;
        this.ocena = ocena;
        this.datum = datum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }
}
