package com.ab2018.akademikbilisim;

/**
 * Created by neval on 30/01/2018.
 */

public class Egitmen extends Kisi{

    private String kurs;

    public Egitmen(String tckn, String isim, String soyisim, String email, String parola, String meslek, String cinsiyet, String dogumtarihi, String adres, String egitim, String kurs) {
        super(tckn, isim, soyisim, email, parola, meslek, cinsiyet, dogumtarihi, adres, egitim);
        this.kurs = kurs;
    }

    public String getKurs() {
        return kurs;
    }

    public void setKurs(String kurs) {
        this.kurs = kurs;
    }
}
