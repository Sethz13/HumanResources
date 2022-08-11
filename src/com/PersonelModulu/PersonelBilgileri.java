package com.PersonelModulu;

import com.IzinModulu.IzinBilgileri;

import java.util.ArrayList;
import java.util.List;

public class PersonelBilgileri {

    private String adSoyad;

    private String kimlikNo;

    private String dogumTarihi;

    private String iseGirisTarihi;

    private String izinHakEtmeTarihi;

    private String departman;

    private int calistigiGun;

    private int hakEttigiIzin;

    private int kullandigiIzin;

    private int kalanIzin;

    public List<IzinBilgileri> personelIzinListesi;


    public PersonelBilgileri(String adSoyad, String kimlikNo, String dogumTarihi, String iseGirisTarihi, String izinHakEtmeTarihi, String departman,  int calistigiGun, int hakEttigiIzin, int kullandigiIzin, int kalanIzin) {
        this.adSoyad = adSoyad;
        this.kimlikNo = kimlikNo;
        this.dogumTarihi = dogumTarihi;
        this.iseGirisTarihi = iseGirisTarihi;
        this.izinHakEtmeTarihi = izinHakEtmeTarihi;
        this.departman = departman;
        this.calistigiGun = calistigiGun;
        this.hakEttigiIzin = hakEttigiIzin;
        this.kullandigiIzin = kullandigiIzin;
        this.kalanIzin = kalanIzin;

        personelIzinListesi = new ArrayList<IzinBilgileri>();
    }

    /*public void eklePersonelIzin(PersonelIslemleri personelIzin){
        this.personelIzinListesi.add(personelIzin);
    }

    public List<PersonelIslemleri> getPersonelIzinList() {
        return personelIzinListesi;
    }*/
    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public String getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    public String getIseGirisTarihi() {
        return iseGirisTarihi;
    }

    public void setIseGirisTarihi(String iseGirisTarihi) {
        this.iseGirisTarihi = iseGirisTarihi;
    }

    public String getIzinHakEtmeTarihi() {
        return izinHakEtmeTarihi;
    }

    public void setIzinHakEtmeTarihi(String izinHakEtmeTarihi) {
        this.izinHakEtmeTarihi = izinHakEtmeTarihi;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public int getCalistigiGun() {
        return calistigiGun;
    }

    public void setCalistigiGun(int calistigiGun) {
        this.calistigiGun = calistigiGun;
    }

    public int getHakEttigiIzin() {
        return hakEttigiIzin;
    }

    public void setHakEttigiIzin(int hakEttigiIzin) {
        this.hakEttigiIzin = hakEttigiIzin;
    }

    public int getKullandigiIzin() {
        return kullandigiIzin;
    }

    public void setKullandigiIzin(int kullandigiIzin) {
        this.kullandigiIzin = kullandigiIzin;
    }

    public int getKalanIzin() {
        return kalanIzin;
    }

    public void setKalanIzin(int kalanIzin) {
        this.kalanIzin = kalanIzin;
    }

    public List<IzinBilgileri> getPersonelIzinListesi() {
        return personelIzinListesi;
    }

    public void setPersonelIzinListesi(List<IzinBilgileri> personelIzinListesi) {
        this.personelIzinListesi = personelIzinListesi;
    }

    @Override
    public String toString() {
        return "PersonelBilgileri{" +
                "adSoyad='" + adSoyad + '\'' +
                ", kimlikNo='" + kimlikNo + '\'' +
                ", dogumTarihi='" + dogumTarihi + '\'' +
                ", iseGirisTarihi='" + iseGirisTarihi + '\'' +
                ", izinHakEtmeTarihi='" + izinHakEtmeTarihi + '\'' +
                ", departman='" + departman + '\'' +
                ", calistigiGun=" + calistigiGun +
                ", hakEttigiIzin=" + hakEttigiIzin +
                ", kullandigiIzin=" + kullandigiIzin +
                ", kalanIzin=" + kalanIzin +
                ", personelIzinListesi=" + personelIzinListesi +
                '}';
    }
}
