package com.ab2018.akademikbilisim;

/**
 * Created by neval on 30/01/2018.
 */

public class Ogrenci extends Kisi{

    private String image;
    private String detay;
    private String bolum;
    private int anket;

    public Ogrenci(String tckn, String isim, String soyisim, String email, String parola, String meslek, String cinsiyet, String dogumtarihi, String adres, String egitim, String image, String detay, String bolum, int anket) {
        super(tckn, isim, soyisim, email, parola, meslek, cinsiyet, dogumtarihi, adres, egitim);
        this.image = image;
        this.detay = detay;
        this.bolum = bolum;
        this.anket = anket;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDetay() {
        return detay;
    }

    public void setDetay(String detay) {
        this.detay = detay;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public int getAnket() {
        return anket;
    }

    public void setAnket(int anket) {
        this.anket = anket;
    }
}
