package com.IzinModulu;

public class IzinBilgileri {


    private String kimlikNo;

    private String izinTuru;

    private String izinAdresi;

    private String izinBaslangicTarihi;

    private String izinBitisTarihi;

    private String iseBaslamaTarihi; //neden burada

    private String kullandigiIzinGunu;

    private String yillikHariciKullandigiIzin;

    private int tatileDenkGelenIzin;


    public IzinBilgileri(String kimlikNo, String izinTuru, String izinAdresi, String izinBaslangicTarihi, String izinBitisTarihi, String iseBaslamaTarihi, String kullandigiIzinGunu, String yillikHariciKullandigiIzin, int tatileDenkGelenIzin) {
        this.kimlikNo = kimlikNo;
        this.izinTuru = izinTuru;
        this.izinAdresi = izinAdresi;
        this.izinBaslangicTarihi = izinBaslangicTarihi;
        this.izinBitisTarihi = izinBitisTarihi;
        this.iseBaslamaTarihi = iseBaslamaTarihi;
        this.kullandigiIzinGunu = kullandigiIzinGunu;
        this.yillikHariciKullandigiIzin = yillikHariciKullandigiIzin;
        this.tatileDenkGelenIzin = tatileDenkGelenIzin;
    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public String getIzinTuru() {
        return izinTuru;
    }

    public void setIzinTuru(String izinTuru) {
        this.izinTuru = izinTuru;
    }

    public String getIzinAdresi() {
        return izinAdresi;
    }

    public void setIzinAdresi(String izinAdresi) {
        this.izinAdresi = izinAdresi;
    }

    public String getIzinBaslangicTarihi() {
        return izinBaslangicTarihi;
    }

    public void setIzinBaslangicTarihi(String izinBaslangicTarihi) {
        this.izinBaslangicTarihi = izinBaslangicTarihi;
    }

    public String getIzinBitisTarihi() {
        return izinBitisTarihi;
    }

    public void setIzinBitisTarihi(String izinBitisTarihi) {
        this.izinBitisTarihi = izinBitisTarihi;
    }

    public String getIseBaslamaTarihi() {
        return iseBaslamaTarihi;
    }

    public void setIseBaslamaTarihi(String iseBaslamaTarihi) {
        this.iseBaslamaTarihi = iseBaslamaTarihi;
    }

    public String getKullandigiIzinGunu() {
        return kullandigiIzinGunu;
    }

    public void setKullandigiIzinGunu(String kullandigiIzinGunu) {
        this.kullandigiIzinGunu = kullandigiIzinGunu;
    }

    public String getYillikHariciKullandigiIzin() {
        return yillikHariciKullandigiIzin;
    }

    public void setYillikHariciKullandigiIzin(String yillikHariciKullandigiIzin) {
        this.yillikHariciKullandigiIzin = yillikHariciKullandigiIzin;
    }

    public int getTatileDenkGelenIzin() {
        return tatileDenkGelenIzin;
    }

    public void setTatileDenkGelenIzin(int tatileDenkGelenIzin) {
        this.tatileDenkGelenIzin = tatileDenkGelenIzin;
    }
}
