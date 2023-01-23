package com.example.trialproject.trials;

import java.util.Scanner;

public class alisverisMain {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Manava Hoşgeldiniz\n :)" + "Ürün kg Fiyatları :\n" + "Salatalık  : 3.14 Tl\n" + "Elma       : 4.11 Tl\n" + "Kabak      : 2.22 Tl\n" + "Domates    : 0.95 Tl\n" + "Patlıcan   : 7.00 Tl");
        System.out.println("ALMAK İSTEDİĞİNİZ TUTARLARI GİRİNİZ");

        System.out.println("Salatalık Kaç Kilo :");
        int salataKilo = scan.nextInt();

        System.out.println("Elma Kaç Kilo :");
        int elmaKilo = scan.nextInt();

        System.out.println("Kabak Kaç Kilo :");
        int kabakKilo = scan.nextInt();

        System.out.println("Domates  Kaç Kilo :");
        int domatesKilo = scan.nextInt();

        System.out.println("Patlıcan  Kaç Kilo :");
        int patlıcanKilo = scan.nextInt();

     double salataFiyat=salataKilo*3.14;
     double elmaFiyat=elmaKilo*4.11;
     double kabakFiyat=kabakKilo*2.22;
     double domatesFiyat=domatesKilo*0.95;
     double patlıcanFiyat=patlıcanKilo*7.00;

     double toplamTutar=salataFiyat+elmaFiyat+kabakFiyat+domatesFiyat+patlıcanFiyat;
        System.out.println("Toplam Alışveriş Tutarı :"+toplamTutar);




    }


}
