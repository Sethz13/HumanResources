package com.IzinModulu;

import com.PersonelModulu.PersonelBilgileri;
import com.PersonelModulu.PersonelIslemleri;

import java.text.ParseException;
import java.util.Scanner;

public class IzinIslemleri {

    /*public void PersonelIzinAlimi() throws ParseException {

        IzinIslmeleri islemler = new Islemler();
        System.out.println("***********");
        System.out.println("Lütfen aşağıdaki izin türlerinden birini seçin: ");
        System.out.println("1 - Yıllık İzin");
        System.out.println("2 - Hastalık İzni");
        System.out.println("3 - Diğer İzinler");
        System.out.println("0 - ANA MENÜ");
        Scanner scanner=new Scanner(System.in);
        int personeldeger = Integer.parseInt(scanner.nextLine());
        if (personeldeger==1){
            System.out.println("Lütfen bir personel kimlik numarası girin: ");
            String kno=scanner.nextLine();
            int index0 = -1;

            for (int i= 0; i<personelclass.personels.size(); i++){
                if (personelclass.personels.get(i).getKimlik().equals(kno)) {
                    index0 = i;
                    break;
                }
            }
            if (index0 != -1) {
                int izinhak=personelclass.personels.get(index0).getYilIzGun();
                System.out.println("Personele ait maksimum yıllık izin hakkı: "+ izinhak );
                if (izinhak!=0){
                    System.out.println("Lütfen izin başlangıç tarihini giriniz: ");
                    String ibas=scanner.nextLine();
                    System.out.println("Lütfen izin bitiş tarihini giriniz:");
                    String ibit=scanner.nextLine();
                    System.out.println("Lütfen izin adresinizi il bazında giriniz: ");
                    String gIl= scanner.nextLine().toUpperCase();
                    int gunsayi= tarihHesaplaAraliktan(ibas,ibit);
                    if (gunsayi<=izinhak){
                        int geciciizinhak=izinhak-gunsayi;
                        personelclass.personels.get(index0).setYilIzGun(geciciizinhak);
                        personelclass.personels.get(index0).setIzinTuru("YILLIK İZİN");
                        String izintur= personelclass.personels.get(index0).getIzinTuru();
                        System.out.println("İzin talebiniz başarıyla alınmıştır. İzin çıktınız hazırlanıyor....");
                        System.out.println();
                        System.out.println("*******************");
                        System.out.println("*           İ Z İ N   B İ L G İ L E R İ           *");
                        System.out.println("*******************");
                        System.out.println("Şirket bilgisi: "+personelclass.personels.get(index0).getSirketAdi().toUpperCase());
                        System.out.println();
                        System.out.println("ADI SOYADI: "+ personelclass.personels.get(index0).getAd_soyad());
                        System.out.println();
                        System.out.println("TC Kimlik No: "+personelclass.personels.get(index0).getKimlik()+"               "+"Çalışılan Bölüm: "+personelclass.personels.get(index0).getBolum());
                        System.out.println();
                        System.out.println("Talep Edilen İzin Türü: "+izintur);
                        System.out.println();
                        System.out.println("İzin başlangıç tarihi: "+ibas+"       "+"İzin bitiş tarihi: "+ibit);
                        System.out.println();
                        System.out.println("İşe başlama tarihi: "+personelclass.personels.get(index0).getIseBaslama()+"          "+"İzin Süresi: "+gunsayi+" gün");
                        System.out.println();
                        System.out.println("İzin adresi: "+gIl);
                        System.out.println();
                        System.out.println("İzin talep tarihi: "+bugununtarihis);
                        System.out.println();
                        System.out.println("*******************");

                        System.out.println("İşleminiz gerçekleşmiştir. \nAna menüye dönmek için herhangi bir karaktere basabilirsiniz.");
                        String herhangibirdeger= scanner.nextLine();
                        anaMenu();
                    }
                    else{
                        System.out.println("Tarih aralığında belirtilen gün sayısı, izin günü sayısını aşmaktadır. Lütfen tekrar deneyin.");
                        PersonelIzinAlimi();
                    }

                }
                else{
                    System.out.println("Personele ait mevcut izin hakkı bulunmamaktadır. Ana menüye yönlendirilme yapılacaktır.");
                    islemler.anaMenu();
                }

            }
            else{
                System.out.println("Belirtilen kimlik numarasına ait personel bulunamadı.");
                System.exit(0);

            }
        }
        else if (personeldeger==2){
            System.out.println("Lütfen bir personel kimlik numarası girin: ");
            String kno=scanner.nextLine();
            int index0 = -1;

            for (int i= 0; i<personelclass.personels.size(); i++){
                if (personelclass.personels.get(i).getKimlik().equals(kno)) {
                    index0 = i;
                    break;
                }
            }
            if (index0 != -1) {
                int izinhak=personelclass.personels.get(index0).getHastaIzinGun();
                System.out.println("Personele ait maksimum hastalık izin hakkı: "+ izinhak );
                if (izinhak!=0){
                    System.out.println("Lütfen izin başlangıç tarihini giriniz: ");
                    String ibas=scanner.nextLine();
                    System.out.println("Lütfen izin bitiş tarihini giriniz:");
                    String ibit=scanner.nextLine();
                    System.out.println("Lütfen izin adresinizi il bazında giriniz: ");
                    String gIl= scanner.nextLine().toUpperCase();
                    int gunsayi= tarihHesaplaAraliktan(ibas,ibit);
                    if (gunsayi<=izinhak){
                        int geciciizinhak=izinhak-gunsayi;
                        personelclass.personels.get(index0).setHastaIzinGun(geciciizinhak);
                        personelclass.personels.get(index0).setIzinTuru("HASTALIK İZNİ");
                        String izintur= personelclass.personels.get(index0).getIzinTuru();
                        System.out.println("İzin talebiniz başarıyla alınmıştır. İzin çıktınız hazırlanıyor....");
                        System.out.println();
                        System.out.println("*******************");
                        System.out.println("*           İ Z İ N   B İ L G İ L E R İ           *");
                        System.out.println("*******************");
                        System.out.println("Şirket bilgisi: "+personelclass.personels.get(index0).getSirketAdi());
                        System.out.println();
                        System.out.println("ADI SOYADI: "+ personelclass.personels.get(index0).getAd_soyad());
                        System.out.println();
                        System.out.println("TC Kimlik No: "+personelclass.personels.get(index0).getKimlik()+"               "+"Çalışılan Bölüm: "+personelclass.personels.get(index0).getBolum());
                        System.out.println();
                        System.out.println("Talep Edilen İzin Türü: "+izintur);
                        System.out.println();
                        System.out.println("İzin başlangıç tarihi: "+ibas+"       "+"İzin bitiş tarihi: "+ibit);
                        System.out.println();
                        System.out.println("İşe başlama tarihi: "+personelclass.personels.get(index0).getIseBaslama()+"          "+"İzin Süresi: "+gunsayi+" gün");
                        System.out.println();
                        System.out.println("İzin adresi: "+gIl);
                        System.out.println();
                        System.out.println("İzin talep tarihi: "+bugununtarihis);
                        System.out.println();
                        System.out.println("*******************");

                        System.out.println("İşleminiz gerçekleşmiştir. \nAna menüye dönmek için herhangi bir karaktere basabilirsiniz.");
                        String herhangibirdeger= scanner.nextLine();
                        anaMenu();
                    }
                    else{
                        System.out.println("Tarih aralığında belirtilen gün sayısı, izin günü sayısını aşmaktadır. Lütfen tekrar deneyin.");
                        PersonelIzinAlimi();
                    }

                }
                else{
                    System.out.println("Personele ait mevcut izin hakkı bulunmamaktadır. Ana menüye yönlendirilme yapılacaktır.");
                    islemler.anaMenu();
                }

            }
            else{
                System.out.println("Belirtilen kimlik numarasına ait personel bulunamadı.");
                System.exit(0);

            }
        }
        else if (personeldeger==3) {
            System.out.println("Lütfen bir personel kimlik numarası girin: ");
            String kno=scanner.nextLine();
            int index0 = -1;

            for (int i= 0; i<personelclass.personels.size(); i++){
                if (personelclass.personels.get(i).getKimlik().equals(kno)) {
                    index0 = i;
                    break;
                }
            }
            if (index0 != -1) {

                System.out.println("Diğer izin, tüm personellere ait belli sınır içermeyen izin türüdür.");
                System.out.println();
                System.out.println("Lütfen izin başlangıç tarihini giriniz: ");
                String ibas=scanner.nextLine();
                System.out.println("Lütfen izin bitiş tarihini giriniz:");
                String ibit=scanner.nextLine();
                System.out.println("Lütfen izin adresinizi il bazında giriniz: ");
                String gIl= scanner.nextLine().toUpperCase();
                int gunsayi= tarihHesaplaAraliktan(ibas,ibit);
                personelclass.personels.get(index0).setIzinTuru("DİĞER İZİN");
                String izintur= personelclass.personels.get(index0).getIzinTuru();
                System.out.println("İzin talebiniz başarıyla alınmıştır. İzin çıktınız hazırlanıyor....");
                System.out.println();
                System.out.println("*******************");
                System.out.println("*           İ Z İ N   B İ L G İ L E R İ           *");
                System.out.println("*******************");
                System.out.println("Şirket bilgisi: "+personelclass.personels.get(index0).getSirketAdi().toUpperCase());
                System.out.println();
                System.out.println("ADI SOYADI: "+ personelclass.personels.get(index0).getAd_soyad());
                System.out.println();
                System.out.println("TC Kimlik No: "+personelclass.personels.get(index0).getKimlik()+"               "+"Çalışılan Bölüm: "+personelclass.personels.get(index0).getBolum());
                System.out.println();
                System.out.println("Talep Edilen İzin Türü: "+izintur);
                System.out.println();
                System.out.println("İzin başlangıç tarihi: "+ibas+"       "+"İzin bitiş tarihi: "+ibit);
                System.out.println();
                System.out.println("İşe başlama tarihi: "+personelclass.personels.get(index0).getIseBaslama()+"          "+"İzin Süresi: "+gunsayi+" gün");
                System.out.println();
                System.out.println("İzin adresi: "+gIl);
                System.out.println();
                System.out.println("İzin talep tarihi: "+bugununtarihis);
                System.out.println();
                System.out.println("*******************");

                System.out.println("İşleminiz gerçekleşmiştir. \nAna menüye dönmek için herhangi bir karaktere basabilirsiniz.");
                String herhangibirdeger= scanner.nextLine();
                String herhangibirdeger2= scanner.nextLine();
                anaMenu();
            }
            else{
                System.out.println("Belirtilen kimlik numarasına ait personel bulunamadı.");
                System.exit(0);

            }
        }
        else if (personeldeger==0) {
            islemler.anaMenu();
        }
        else {
            System.out.println("Yanlış seçim. Lütfen tekrar deneyin.");
            PersonelIzinAlimi();
        }

    };*/










    /*public static void yillikIzinKullandir(String izinTuru , String kimlikNo, String izinAdresi, String izinBaslangicTarihi, String izinBitisTarihi ){
        int index=-1;
        PersonelBilgileri personel = null;

        for (int i=0; i<personel.personelIzinListesi.size(); i++){
            //personel = personelIzinListesi.get(i);
            if (personel.personelIzinListesi.get(i).getKimlikNo().equals(kimlikNo)){
                index = i;
                break;
            }
        }

        if(index==-1){
            System.err.println("Geçersiz");
            return;
        }

        int toplamIzinGunSayisi = Hesaplamalar.istenenIzinHesaplama(izinBaslangicTarihi,izinBitisTarihi);
        int haftaIciIzinGunSayisi= Hesaplamalar.ikiTarihArasiniHesaplama(izinBaslangicTarihi,izinBitisTarihi);
        int haftaSonuIzinGunSayisi = toplamIzinGunSayisi-haftaIciIzinGunSayisi;
        System.out.println("toplam izin gün sayisi : "+ toplamIzinGunSayisi+", hafta içi izin gün sayisi: "+haftaIciIzinGunSayisi+", hafta sonu izin gün sayisi : "+haftaSonuIzinGunSayisi+" , kalan izin gün sayisi : "+personel.getKalanIzin());

        if(haftaIciIzinGunSayisi>personel.getKalanIzin()){
            System.err.println("KulLanilacak izin gün sayisi kalan izin gün sayisindan büyük olamaz!");
            return;
        }
        personel.setKalanIzin(personel.setKalanIzin();-haftaIciIzinGunSayisi);
        personel.setKullandigiIzin(personel.getKullandigiIzin()+haftaIciIzinGunSayisi);

        //
        PersonelIslemleri personelIzin = new PersonelIslemleri(personel.getKimlikNo(),"Yillik",izinAdresi,izinBaslangicTarihi,izinBitisTarihi,izinBitisTarihi,""+haftaIciIzinGunSayisi,haftaSonuIzinGunSayisi,"0");
        personel.eklePersonelIzin(personelIzin);
        personelListesi.set(index,personel);

        System.out.println("izin kaydi başariyla eklendi.\n");
    }


    public static void hastaIzniKullandir(String izinTuru , String TCno, String izinKulanacakAdres, String izinBaslangicTarihi, String izinBitisTarihi ){

        // personel listesi gezdik
        int index=-1;
        PersonelBilgileri personel = null;

        for (int i=0; i<personelIzinListesi.size(); i++){
            personel = personelListesi.get(i);
            if (personel.getKimlikNo().equals(TCno)){
                index = i;
                break;
            }
        }

        if(index==-1){
            System.err.println("girdiniz tc numrasi personel listesinde bulunamadi. izin kulanabilmek için lütfen geçerli tc numrasi giriniz");
            return;
        }
        int toplamIzinGunSayisi = Hesaplamalar.izinhesaplama(izinBaslangicTarihi,izinBitisTarihi);
        int haftaIciIzinGunSayisi= Hesaplamalar.getWorkingDays(izinBaslangicTarihi,izinBitisTarihi);
        int haftaSonuIzinGunSayisi = toplamIzinGunSayisi-haftaIciIzinGunSayisi;
        System.out.println("toplam izin gün sayisi : "+ toplamIzinGunSayisi+", hafta içi izin gün sayisi: "+haftaIciIzinGunSayisi+", hafta sonu izin gün sayisi : "+haftaSonuIzinGunSayisi+" , kalan izin gün sayisi : "+personel.getKalanizinGunSayisi());
        //
        PersonelIzin personelIzin = new PersonelIzin(personel.getTCnumarasi(),"Hasta",izinKulanacakAdres,izinBaslangicTarihi,izinBitisTarihi,izinBitisTarihi,""+haftaIciIzinGunSayisi,haftaSonuIzinGunSayisi,"0");
        personel.eklePersonelIzin(personelIzin);
        personelListesi.set(index,personel);

        System.out.println("izin kaydi başariyla eklendi.\n");
    }

    public static void dogumIzniKullandir(String izinTuru , String TCno, String izinKulanacakAdres, String izinBaslangicTarihi, String izinBitisTarihi ){

        // personel listesini gezdik
        int index=-1;
        Personel personel = null;

        for (int i=0; i<personelListesi.size(); i++){
            personel = personelListesi.get(i);
            if (personel.getTCnumarasi().equals(TCno)){
                index = i;
                break;
            }
        }

        if(index==-1){
            System.err.println("girdiniz tc numrasi personel listesinde bulunamadi. izin kulanabilmek için lütfen geçerli tc numrasi giriniz");
            return;
        }//toplam izin gün sayisina bakiyor
        int toplamIzinGunSayisi = IzinLibrary.izinhesaplama(izinBaslangicTarihi,izinBitisTarihi);
        int haftaIciIzinGunSayisi= IzinLibrary.getWorkingDays(izinBaslangicTarihi,izinBitisTarihi);
        int haftaSonuIzinGunSayisi = toplamIzinGunSayisi-haftaIciIzinGunSayisi;
        System.out.println("toplam izin gün sayisi : "+ toplamIzinGunSayisi+", hafta içi izin gün sayisi: "+haftaIciIzinGunSayisi+", hafta sonu izin gün sayisi : "+haftaSonuIzinGunSayisi+" , kalan izin gün sayisi : "+personel.getKalanizinGunSayisi());

        //
        PersonelIzin personelIzin = new PersonelIzin(personel.getTCnumarasi(),"Dogum",izinKulanacakAdres,izinBaslangicTarihi,izinBitisTarihi,izinBitisTarihi,""+haftaIciIzinGunSayisi,haftaSonuIzinGunSayisi,"0");
        personel.eklePersonelIzin(personelIzin);
        personelListesi.set(index,personel);

        System.out.println("izin kaydi başariyla eklendi.\n");
    }


    // hasta izni yiillik izin gibi değildir mazaret izni olduğu için yiillik izinden düşmez
    public static void cenazeIzni(String izinTuru , String TCno, String izinKulanacakAdres, String izinBaslangicTarihi, String izinBitisTarihi ){

        // personel listesi gezdik
        int index=-1;
        Personel personel = null;

        for (int i=0; i<personelListesi.size(); i++){
            personel = personelListesi.get(i);
            if (personel.getTCnumarasi().equals(TCno)){
                index = i;
                break;
            }
        }

        if(index==-1){
            System.err.println("girdiniz TC numrasi personel listesinde bulunamadi. izin kulanabilmek için lütfen geçerli TC numrasi giriniz");
            return;
        }
        int toplamIzinGunSayisi = IzinLibrary.izinhesaplama(izinBaslangicTarihi,izinBitisTarihi);
        int haftaIciIzinGunSayisi= IzinLibrary.getWorkingDays(izinBaslangicTarihi,izinBitisTarihi);
        int haftaSonuIzinGunSayisi = toplamIzinGunSayisi-haftaIciIzinGunSayisi;
        System.out.println("toplam izin gün sayisi : "+ toplamIzinGunSayisi+", hafta içi izin gün sayisi: "+haftaIciIzinGunSayisi+", hafta sonu izin gün sayisi : "+haftaSonuIzinGunSayisi+" , kalan izin gün sayisi : "+personel.getKalanizinGunSayisi());
        //
        PersonelIzin personelIzin = new PersonelIzin(personel.getTCnumarasi(),"Cenaze",izinKulanacakAdres,izinBaslangicTarihi,izinBitisTarihi,izinBitisTarihi,""+haftaIciIzinGunSayisi,haftaSonuIzinGunSayisi,"0");
        personel.eklePersonelIzin(personelIzin);
        personelListesi.set(index,personel);

        System.out.println("izin kaydi başariyla eklendi.\n");
    }*/

}
