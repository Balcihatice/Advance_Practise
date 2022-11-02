package practiceAdvanced.practise04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
 /* TASK :
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.

        Ipucu:
        Class icinde 3 method olacak
         * main() isimli bir method
         * musteriSecimi() isimli bir method
         * kasa() isimli bir method
         * */


public class Manav {

    static List<String> urunListesi = new ArrayList<>(Arrays.asList("Patates - urun kodu 1",
            "Kivi  - urun kodu:2", "Limon - urun kodu:3", "Biber - urun kodu 4", "Patlican - urun kodu5"));

    static List<Double> urunFiyatlari = new ArrayList<>(Arrays.asList(5.0, 7.5, 1.3, 8.7, 9.2));

    static double toplamOdenecekTutar;

    static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {

        System.out.println(urunListesi);
        musteriSecimi();
    }

    private static void musteriSecimi() {
        System.out.println("Hangi urunu secmek istersiniz");
        int secim = scan.nextInt();

        System.out.println("Sectiginiz urunden kac kilo alacaksiniz");

        double kilo = scan.nextDouble();

        double urunTutari = urunFiyatlari.get(secim - 1); //get() indexten bulacagimiz icin (-1) yazdik

        double urunToplamTutar = kilo * urunTutari;

        toplamOdenecekTutar += urunToplamTutar;

        System.out.println("Devam edecekseniz 1, kasa icin 2 seciniz");

        int karar = scan.nextInt();

        if (karar == 1) {
            musteriSecimi();
        } else {
            kasa();
        }
    }

    private static void kasa() {
        System.out.println("Alisverisinizin toplam tutari: " + toplamOdenecekTutar);
    }

}
