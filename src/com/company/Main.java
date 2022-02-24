package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        pierwszyPrzyklad();
        zadanie();



    }

    /* Zadania:
     * 1. Utworz liste ArrayList<Osoba>.
     * 2. Dodaj do niej dwa obiekty klasy Osoba.
     * 3. Otworz kolejny plik do zapisu i zapisz do niego obiekt klasy ArrayList<Osoba>.
     * 4. Wczytaj obiekt klasy ArrayList<Osoba> z drugiego pliku.
     * 5. Wyswietl go na ekranie.
     */
    public static void pierwszyPrzyklad() throws IOException, ClassNotFoundException {
        Osoba o1 = new Osoba("Adam", "Mickiewicz", 1798);
        Osoba o2 = new Osoba("Juliusz", "Slowacki", 1809);


        FileOutputStream fos = new FileOutputStream("plik.ser");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);

        oos.writeObject(o1);
        oos.writeObject(o2);

        oos.close();

        FileInputStream fis = new FileInputStream("plik.ser");
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);

        while(bis.available() > 0) {
            Osoba o = (Osoba) ois.readObject();
            System.out.println(o);
        }

        ois.close();
    }

    public static void zadanie() throws IOException, ClassNotFoundException {
        Osoba o1 = new Osoba("Adam", "Mickiewicz", 1798);
        Osoba o2 = new Osoba("Juliusz", "Slowacki", 1809);

        ArrayList<Osoba> list = new ArrayList<>(Arrays.asList(o1,o2)); // przypisanie od razu na liste
        // dodanie na liste to:
        //list.add(o1);

        FileOutputStream fos = new FileOutputStream("plikZadania.ser");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);

        oos.writeObject(list);

        oos.close();

        FileInputStream fis = new FileInputStream("plikZadania.ser");
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);

        while(bis.available() > 0) {
            ArrayList o = (ArrayList) ois.readObject();
            System.out.println(o);
        }

        ois.close();

    }
}
