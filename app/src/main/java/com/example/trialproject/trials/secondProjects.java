package com.example.trialproject.trials;

import java.util.Scanner;

public class secondProjects {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("^^SİSTEMLER SINIFINA HOŞGELDİNİZ^^");
        System.out.println("1. sistem(asal sayımı değil mi kontrol eden sistem)");
        System.out.println("2. sistem (kullanıcının ismini kullanıcının istediği kadar tekrar eden sistem)");
        System.out.println("3. sistem(kullanıcının yazdığı harfin ince seslimi  yoksa kalın seslimi  olduğunu kontrol edip söyleyen sistem)");
        System.out.println("4. sistem(parçadaki istediğin kısmı iki sayı arasındaki kısmı kesip verir)");
        System.out.println("5. sistem(herhangi bir cümle yazılacak. kullanıcı bu cümleye konsoldan yazdığı\n" +
                "          cümleyi bizim yazdığımız cümlenin hemen yanına eklicek\n");

        int tercih = scan.nextInt();
        if (tercih == 1) {
            System.out.println("Asal Sayı Sistemine Hoşgeldin\n" + "Lütfen Sayı Giriniz...");
            int gelenAsalSayiDegeri = scan.nextInt();
            int number = gelenAsalSayiDegeri;
            boolean isPrime = true;

            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.println("sayı asaldır.");
            } else {
                System.out.println("sayı asal değildir");
            }

        }
        if (tercih == 2) {

            System.out.println("İsim Tekrarlama Sistemine Hoşgeldiniz\n" + "ADINIZI GİRİNİZ :");
            String gelenAd = scan.next();
            System.out.println("TEKRARLANMA MİKTARI GİRİNİZ:");
            int sayi = scan.nextInt();

            while (sayi > 0) {

                System.out.println("AD :" + gelenAd);
                sayi -= 1;
            }
        }
        if (tercih == 3) {
            System.out.println("Sesli/Sessiz Harf Sistemine Hoşgeldiniz\n" + "Lütfen Harf Giriniz...");
            String gelenHarf = scan.next();
            switch (gelenHarf) {

                case "a":
                case "ı":
                case "o":
                case "u":
                    System.out.println("HARF KALIN SESLİDİR.");
                    break;
                default:
                case "e":
                case "i":
                case "ö":
                case "ü":
                    System.out.println("HARF İNCE SESLİDİR. ");
                    break;
            }
        }
        if (tercih == 4) {
            System.out.println("Parça kesme sistemine hoşgeldiniz.");
            String mesaj = "İman insanı insan eder.";
            System.out.println(mesaj);
            System.out.println("sayı giriniz ve sayınıza karşılık gelen harfi görün.");
            int gelenSayi = scan.nextInt();
            System.out.println(mesaj.charAt(gelenSayi));
        }
        if (tercih == 5) {
            System.out.println("İsim ekleme sistemine hoşgeldiniz");
            String mesaj5 = "Adınız :";
            System.out.println(mesaj5);
            System.out.println("adınızı giriniz");
            String gelenCumle = scan.next();
            System.out.println(mesaj5.concat(gelenCumle));
        }


    }
}
