package com.IzinModulu;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Hesaplamalar {

    public static String RealtimeHesaplama(){
        DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        String realDate = dateFormat.format(date);
        return realDate;
    }

    public static int istenenIzinHesaplama(String izninIlkGunu, String izninSonGunu){
        SimpleDateFormat simpledateformat = new SimpleDateFormat("dd/mm/yyyy");
        try {
            Date dateIzninIlkGunu = simpledateformat.parse(izninIlkGunu);
            Date dateIzninSonGunu = simpledateformat.parse(izninSonGunu);
            long difference_In_Time = dateIzninSonGunu.getTime() - dateIzninIlkGunu.getTime();

            long difference_In_Days = (difference_In_Time / (1000 * 60 * 60 * 24)) % 365;
            return(int) difference_In_Days;
        }
        catch (ParseException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int suankiTarihiHesaplama(String getIseBaslama) throws ParseException {


        //iki tarih arasındaki farkı hesaplıyoruz.

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Date iseBaslama = sdf.parse(getIseBaslama);
        Date son = new Date();
        Date suanTarih = sdf.parse(sdf.format(son));
        long diffInMillies = Math.abs(suanTarih.getTime() - iseBaslama.getTime());
        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
        int diffi= (int)diff;
        return diffi;
    }
    public int ikiTarihArasiniHesaplama(String getilktarih,String getsontarih) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Date iseBaslama = sdf.parse(getilktarih);
        Date suanTarih = sdf.parse(getsontarih);
        long diffInMillies = Math.abs(suanTarih.getTime() - iseBaslama.getTime());
        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
        int diffi= (int)diff;
        return diffi;
    }

    //public static int

}
