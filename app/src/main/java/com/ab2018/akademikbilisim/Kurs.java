package com.ab2018.akademikbilisim;

import java.util.ArrayList;

/**
 * Created by neval on 30/01/2018.
 */

public class Kurs {

    private int id;
    private String name;
    private ArrayList<String> sorular;
    private String detay;

    public Kurs(int id, String name, ArrayList<String> sorular, String detay) {
        this.id = id;
        this.name = name;
        this.sorular = sorular;
        this.detay = detay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getSorular() {
        return sorular;
    }

    public void setSorular(ArrayList<String> sorular) {
        this.sorular = sorular;
    }

    public String getDetay() {
        return detay;
    }

    public void setDetay(String detay) {
        this.detay = detay;
    }
}
