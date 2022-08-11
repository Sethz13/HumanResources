package com.PersonelModulu;

import com.IzinModulu.Hesaplamalar;
import com.IzinModulu.IzinBilgileri;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonelIslemleri {

    public static List<PersonelBilgileri> personelIzinListesi = new ArrayList<PersonelBilgileri>(); //private idi

    public static void personelEkleme(Scanner sc){
        System.out.println("İsminizi ve Soyisminizi Giriniz");
        String rastgele1 = sc.nextLine();
        String adSoyad = sc.nextLine();

        System.out.println("T.C. Kimlik Numaranızı Giriniz");
        String kimlikNo = sc.nextLine();

        System.out.println("Doğum Tarihinizi Giriniz");
        String dogumTarihi = sc.nextLine();

        System.out.println("İşe Başladığınız Tarihi Giriniz");
        String iseGirisTarihi = sc.nextLine();

        System.out.println("İzni Hakettiğiniz Tarihi Giriniz");
        String izinHakEtmeTarihi = sc.nextLine();

        System.out.println("Departmanınızı Giriniz");
        String departman = sc.nextLine();

        System.out.println("Toplam Çalıştığınız Gün Sayısını Giriniz");
        String calistigiGun = sc.nextLine();

        System.out.println("Hak Ettiğiniz Toplam İzin Günü Sayısını Giriniz");
        String hakEttigiIzin = sc.nextLine();

        System.out.println("Kullandığınız İzin Günleri Sayısını Giriniz");
        String kullandigiIzin = sc.nextLine();

        System.out.println("Kalan İzin Günü Sayısını Giriniz");
        String kalanIzin = sc.nextLine();

        PersonelBilgileri personelEklenen = new PersonelBilgileri(adSoyad, kimlikNo, dogumTarihi, iseGirisTarihi, izinHakEtmeTarihi, departman, Integer.parseInt(calistigiGun), Integer.parseInt(hakEttigiIzin), Integer.parseInt(kullandigiIzin), Integer.parseInt(kalanIzin));
        personelIzinListesi.add(personelEklenen);
    }

    public static void personelIzinleriniListeleme(String kimlikNo){
        int index=-1;
        PersonelBilgileri personelListelenen = null;

        for (int i=0; i<personelIzinListesi.size(); i++){
            personelListelenen = personelIzinListesi.get(i);
            if (personelListelenen.getKimlikNo().equals(kimlikNo)){
                index = i;
                break;
            }
        }

        if(index==-1){
            System.err.println("Girdiğiniz T.C. numarasına ait personel bulunamadı.");
            return;
        }
        List<IzinBilgileri> personelIzinListesi= personelListelenen.getPersonelIzinListesi();
        if(personelIzinListesi.size()==0){
            System.out.println(kimlikNo+" Tc numaralı personelin izin kaydı bulunmakmaktadır");
            return;
        }

        for(IzinBilgileri personelIzin : personelIzinListesi){
            System.out.print("izin türü : "+personelIzin.getIzinTuru()+" , ");
            System.out.print("Adi soyadi: "+personelListelenen.getAdSoyad()+" , ");
            System.out.print("TC no: "+personelListelenen.getKimlikNo()+" , ");
            System.out.print("izin Adresi : "+personelIzin.getIzinAdresi()+" , ");
            System.out.print("Dogum tarihi: "+personelListelenen.getDogumTarihi()+" , ");
            System.out.print("işe giriş tarihi : "+personelListelenen.getIseGirisTarihi()+" , ");
            System.out.print("yillik izin hak ediş tarihi : "+personelListelenen.getIzinHakEtmeTarihi()+" , ");
            System.out.print("Bügünün tarihi: "+ Hesaplamalar.RealtimeHesaplama()+" , ");
            System.out.print("çalişma gün sayisi: "+personelListelenen.getCalistigiGun()+" , ");
            System.out.print("Hak ettiği gün sayisi : "+personelListelenen.getHakEttigiIzin()+" , ");
            System.out.print("Bügüne kadar kulanılan izin  : "+personelListelenen.getKullandigiIzin()+" , ");
            System.out.print("kalan izin gün sayi: "+personelListelenen.getKalanIzin()+" , ");
            System.out.print("çalişan bölüm : "+personelListelenen.getDepartman()+" , ");
            System.out.print("izin başlangiç tarihi : "+personelIzin.getIzinBaslangicTarihi()+" , ");
            System.out.print("izin bitiş tarihi : "+personelIzin.getIzinBitisTarihi()+" , ");
            System.out.print("işe başlama tarihi : "+personelIzin.getIseBaslamaTarihi()+" , ");
            System.out.print("kullanilan izin gün : "+personelIzin.getKullandigiIzinGunu()+" , ");
            System.out.print("resmi / haftalik tatil güne denk gelen izin gün sayisi : "+personelIzin.getTatileDenkGelenIzin()+" , ");
            System.out.print("yillik izin dişinda kullanilan izin gün sayisi : "+personelIzin.getYillikHariciKullandigiIzin()+" ");

            System.out.println();
        }
    }

    public static void display(List<PersonelBilgileri> arr) {

        System.out.println("*************************************************");
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " \n");

        }

        System.out.println();
    }


    public static void personelIzinListesiniGoruntuleme() {
        display(personelIzinListesi);

        System.out.println("çalıştı");
    }

    public static void personelGuncelleme(Scanner sc){

        System.out.println("çalıştı 2");

        System.out.println("İsminizi ve Soyisminizi Giriniz");
        String rastgele = sc.nextLine();
        String adSoyad = sc.nextLine();

        System.out.println("T.C. Kimlik Numaranızı Giriniz");
        String kimlikNo = sc.nextLine();

        System.out.println("Doğum Tarihinizi Giriniz");
        String dogumTarihi = sc.nextLine();

        System.out.println("İşe Başladığınız Tarihi Giriniz");
        String iseGirisTarihi = sc.nextLine();

        System.out.println("İzni Hakettiğiniz Tarihi Giriniz");
        String izinHakEtmeTarihi = sc.nextLine();

        System.out.println("Departmanınızı Giriniz");
        String departman = sc.nextLine();

        System.out.println("Toplam Çalıştığınız Gün Sayısını Giriniz");
        String calistigiGun = sc.nextLine();

        System.out.println("Hak Ettiğiniz Toplam İzin Günü Sayısını Giriniz");
        String hakEttigiIzin = sc.nextLine();

        System.out.println("Kullandığınız İzin Günleri Sayısını Giriniz");
        String kullandigiIzin = sc.nextLine();

        System.out.println("Kalan İzin Günü Sayısını Giriniz");
        String kalanIzin = sc.nextLine();

        int index = -1;

        for (int i=0; i<personelIzinListesi.size(); i++){
            if(personelIzinListesi.get(i).getKimlikNo().equals(kimlikNo)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            PersonelBilgileri personelGuncellenen = personelIzinListesi.get(index);
            personelGuncellenen.setAdSoyad(adSoyad);
            personelGuncellenen.setDogumTarihi(dogumTarihi);
            personelGuncellenen.setIseGirisTarihi(iseGirisTarihi);
            personelGuncellenen.setIzinHakEtmeTarihi(izinHakEtmeTarihi);
            personelGuncellenen.setDepartman(departman);
            personelGuncellenen.setCalistigiGun(Integer.parseInt(calistigiGun));
            personelGuncellenen.setHakEttigiIzin(Integer.parseInt(hakEttigiIzin));
            personelGuncellenen.setKullandigiIzin(Integer.parseInt(kullandigiIzin));
            personelGuncellenen.setKalanIzin(Integer.parseInt(kalanIzin));

            personelIzinListesi.set(index, personelGuncellenen);
        }

    }

    public static void personelSilme(Scanner sc) {
        System.out.println("Silmek istediğiniz personelin T.C. numarasını giriniz");
        String rastgele3 = sc.nextLine();
        String kimlikNo = sc.nextLine();


        int index = -1;

        for (int i=0; i<personelIzinListesi.size(); i++){
            if (personelIzinListesi.get(i).getKimlikNo().equals(kimlikNo)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            personelIzinListesi.remove(index);
        }
    }
}
