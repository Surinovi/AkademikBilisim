package com.ab2018.akademikbilisim;

/**
 * Created by neval on 30/01/2018.
 */

public class Kisi {
    private String tckn;
    private String isim;
    private String soyisim;
    private String email;
    private String parola;
    private String meslek;
    private String cinsiyet;
    private String dogumtarihi;
    private String adres;
    private String egitim;

    public Kisi(String tckn, String isim, String soyisim, String email, String parola, String meslek, String cinsiyet, String dogumtarihi, String adres, String egitim) {
        this.tckn = tckn;
        this.isim = isim;
        this.soyisim = soyisim;
        this.email = email;
        this.parola = parola;
        this.meslek = meslek;
        this.cinsiyet = cinsiyet;
        this.dogumtarihi = dogumtarihi;
        this.adres = adres;
        this.egitim = egitim;
    }

    public String getTckn() {
        return tckn;
    }

    public void setTckn(String tckn) {
        this.tckn = tckn;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public String getMeslek() {
        return meslek;
    }

    public void setMeslek(String meslek) {
        this.meslek = meslek;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public String getDogumtarihi() {
        return dogumtarihi;
    }

    public void setDogumtarihi(String dogumtarihi) {
        this.dogumtarihi = dogumtarihi;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getEgitim() {
        return egitim;
    }

    public void setEgitim(String egitim) {
        this.egitim = egitim;
    }
}
