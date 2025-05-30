package com.example.studenti.model;

import java.time.LocalDate;

public class PrijavaIspita {
    private int id;
    private String student;
    private String predmet;
    private LocalDate datumPrijave;

    public PrijavaIspita() {
    }

    public PrijavaIspita(int id, String student, String predmet, LocalDate datumPrijave) {
        this.id = id;
        this.student = student;
        this.predmet = predmet;
        this.datumPrijave = datumPrijave;
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

    public LocalDate getDatumPrijave() {
        return datumPrijave;
    }

    public void setDatumPrijave(LocalDate datumPrijave) {
        this.datumPrijave = datumPrijave;
    }
}
