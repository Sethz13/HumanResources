package com;

import com.PersonelModulu.PersonelBilgileri;
import com.PersonelModulu.PersonelIslemleri;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.*;

public class Menu {
    public void mainMenu() {

        out.println(" ****************************\n " +
                    "İzin ve Personel İşlemleri\n" +
                    " **************************** \n");

        Scanner islemsc = new Scanner(in);
        out.println("Hangi işlemi yapmak istiyorsunuz?\n\n" +
                "1. İzin İşlemleri\n" +
                "2. Personel İşlemleri\n" +
                "3. Çıkış\n");
        String islemSonucu1 = islemsc.next();

        if(islemSonucu1.equals("1")) {
            Scanner izinsc = new Scanner(in);
            out.println("\n             İzin İşlemleri            \n\n" +
                        "Almak istediğiniz izin türünü seçiniz :\n" +
                        " 1. Yıllık İzin\n" +
                        " 2. Hasta İzni\n" +
                        " 3. Doğum İzni\n" +
                        " 4. Cenaze İzni\n" +
                        " 5. Ebeveynlik İzni\n");
            String izinSonucu1 = izinsc.next();
            if(izinSonucu1.equals("1")) {
                out.println("Yıllık izni seçtiniz");
            } else if (izinSonucu1.equals("2")) {
                out.println(("Hasta iznini seçtiniz"));
            } else if (izinSonucu1.equals("3")) {
                out.println(("Doğum iznini seçtiniz"));
            } else if (izinSonucu1.equals("4")) {
                out.println(("Cenaze iznini seçtiniz"));
            } else if (izinSonucu1.equals("5")) {
                out.println(("Ebeveyn iznini seçtiniz"));
            } else {
                out.println("Lütfen geçerli bir değer giriniz");
            }
        } else if(islemSonucu1.equals("2")) {
            Scanner personelIslemi = new Scanner(in);
            out.println(("Personel İşlemleri\n" +
                    "1. Personel Listesini Görüntüle\n" +
                    "2. Personel Ekle\n" +
                    "3. Personel Ara\n" +
                    "4. Personel Düzenle\n" +
                    "5. Personel Kaldır\n"));
            String personelIslem1 = personelIslemi.next();
            if(personelIslem1.equals("1")) {
                out.println("Personel Listesini Görüntülemeyi Seçtiniz");
                com.PersonelModulu.PersonelIslemleri personelListeleme = new PersonelIslemleri();
                personelListeleme.personelIzinListesiniGoruntuleme();
                mainMenu();
            } else if (personelIslem1.equals("2")) {
                out.println("Personel Eklemeyi seçtiniz");
                com.PersonelModulu.PersonelIslemleri personelEkleme = new PersonelIslemleri();
                personelEkleme.personelEkleme(islemsc);
                out.println("Personel eklendi, ana menuye yönlendiriliyor");
                mainMenu();
            } else if (personelIslem1.equals("3")) {
                out.println("Personel aramayı seçtiniz");
                mainMenu();
            } else if (personelIslem1.equals("4")) {
                out.println("Personel Düzenlemeyi seçtiniz");
                com.PersonelModulu.PersonelIslemleri personelGuncelleme = new PersonelIslemleri();
                personelGuncelleme.personelGuncelleme(islemsc);
                mainMenu();
            } else if (personelIslem1.equals("5")) {
                out.println("Personel Kaldırmayı Seçtiniz");
                com.PersonelModulu.PersonelIslemleri personelKaldırma = new PersonelIslemleri();
                personelKaldırma.personelSilme(islemsc);
                mainMenu();
            }
        } else if(islemSonucu1.equals("3")) {
            out.println("Çıkış yapılıyor");
            exit(0);
        } else {
            //warning();
        }
    }
}
