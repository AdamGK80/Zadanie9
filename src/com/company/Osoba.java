package com.company;

import java.io.Serializable;

public class Osoba implements Serializable {

    String imie;
    String nazwisko;
    int rokUrodzenia;

    public Osoba(String imie, String nazwisko, int rokUrodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
    }

    public String toString() {
        return imie + " " + nazwisko + " ur. " + rokUrodzenia;
    }
}
