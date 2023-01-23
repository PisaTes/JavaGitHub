package com.example.trialproject.trials;

import java.util.Scanner;

public class trialsOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Mini Teste Hoşgeldiniz.");
        String adSorma = "ADINIZ-SOYADINIZ :";
        String question1 = "Türkiyenin başkenti neresidir?";
        String question2 = "Türkiyenin en büyük gölü hangisidir?";
        String question4 = "Ayasofya Camii hangi ilimizdedir?";
        int dogruSayisi = 0;
        int yanlisSayisi = 0;
        System.out.println("/*" + adSorma);
        String gelenAd = scan.nextLine();
        System.out.println("1) " + question1);
        String gelenCevap1 = scan.next();
        System.out.println("2) " + question2);
        String gelenCevap2 = scan.next();
        System.out.println("3) Vanın plaka kodu kaçtır?");
        int gelenCevap3 = scan.nextInt();
        System.out.println("4) " + question4 + "\n" + "A: VAN\n" + "B: Kocaeli\n" + "C: Diyarbakır\n" + "D: İstanbul");
        String gelenCevap4 = scan.next();
        System.out.println("Türkiyedeki il sayısı kaçtır?");
        int gelenCevap5 = scan.nextInt();
        System.out.println("Aşağıdaki işlemin cevabını yazınız :\n"+"3+9= ?");
        int gelenCevap6 = scan.nextInt();

        if (gelenAd == gelenAd) {
            System.out.println("AD-SOYAD :" + gelenAd + "\n" + "-----------\n" + "Yanlış Cevaplarınızın Doğruları :");
        }
        if (gelenCevap1.equalsIgnoreCase("Ankara")) {
            dogruSayisi++;
        } else {
            yanlisSayisi++;
            System.out.println("Türkiyenin başkenti Ankaradır");
        }
        if (gelenCevap2.equalsIgnoreCase("Van")) {
            dogruSayisi++;
        } else {
            yanlisSayisi++;
            System.out.println("Türiyenin en büyük gölü Van'dır");
        }
        if (gelenCevap3 == 65) {
            dogruSayisi++;
        } else {
            System.out.println("Vanın plaka kodu 65' tir");
            yanlisSayisi++;
        }

        if (gelenCevap4.equalsIgnoreCase("D")) {
            dogruSayisi++;
        } else {
            yanlisSayisi++;
            System.out.println("Doğru Cevap D Şıkkıdır.\n" + "Yani Ayasofya İstanbul ilimizdedir. ");
        }

        switch (gelenCevap5) {
            case 81:
                dogruSayisi++;
                break;
            default:
                yanlisSayisi++;
                System.out.println("Türkiyedeki il sayısı 81'dir.");
        }
        switch (gelenCevap6) {
            case 12 :
                dogruSayisi++;
                break;
            default:
                yanlisSayisi++;
                System.out.println("Matematik hesaplamalarında hatanız mevcuttur.\n" + "***Doğru İşlemin Cevabı : 12");
        }
        System.out.println("*************");
        System.out.println("Doğru Sayınız : " + dogruSayisi);
        System.out.println("Yanlış Sayınız : " + yanlisSayisi);

    }
}





