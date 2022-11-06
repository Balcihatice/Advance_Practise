package practiceAdvanced.practice07;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Q01_Inheritance_HacimHesaplama {

    //Kare prizma, silindir ve koninin hacmini hesaplayan bir kod yazınız.
    // (Inheritance kullanınız)


    public static void main(String[] args) {


        KarePrizma karePrizma = new KarePrizma();

        double karePrizmaHacmi = karePrizma.hacimHesapla(5, 5);
        System.out.println(karePrizmaHacmi);


        Koni koni = new Koni();
        double koniHacmi = koni.hacimHesapla(3, 5);
        NumberFormat obj = new DecimalFormat(".00");
        System.out.println(obj.format(koniHacmi));


        Silindir silindir = new Silindir();
        System.out.println(silindir.hacimHesapla(2, 6));


    }
}