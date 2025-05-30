package com.example.studenti.model;

public class Predmet {
    private int id;
    private String naziv;
    private int espb;
    private String profesor;

    public Predmet() {
    }

    public Predmet(int id, String naziv, int espb, String profesor) {
        this.id = id;
        this.naziv = naziv;
        this.espb = espb;
        this.profesor = profesor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getEspb() {
        return espb;
    }

    public void setEspb(int espb) {
        this.espb = espb;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }
}
