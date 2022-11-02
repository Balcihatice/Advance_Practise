package practiceAdvanced.practise04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manav_IkinciYol {

    static int toplamFiyat = 0;
    public static void main(String[] args) {
        musteriSecimi();
        kasa();
    }

    public static void musteriSecimi() {
        List<String> urunListesi = new ArrayList<>();
        urunListesi.add("Elma");//5
        urunListesi.add("Armut");//10
        urunListesi.add("Uzum");//15
        urunListesi.add("Karpuz");//20
        urunListesi.add("Limon");//25
        String tercih1 = "";
        String kilo1 = "";
        String sepet = "";
        int fiyat = 0;
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("Bir urun seciniz: Elma icin 0, Armut icin 1, Uzum icin 2, Karpuz icin 3, Limon icin 4..");
            int tercih = scan.nextInt();
            tercih1 += urunListesi.get(tercih) + " ";
            switch (tercih) {
                case 0:
                    fiyat = 5;
                    break;
                case 1:
                    fiyat = 10;
                    break;
                case 2:
                    fiyat = 15;
                    break;
                case 3:
                    fiyat = 20;
                    break;
                case 4:
                    fiyat = 25;
                    break;
                default:
                    System.out.println("Lutfen gecerli bir urun numarasi giriniz.");
            }

            System.out.println("Kac kilo istiyorsunuz: ");
            int kilo = scan.nextInt();
            kilo1 = String.valueOf(kilo) + " kilo ";
            toplamFiyat += fiyat*kilo;
            sepet += kilo1 + urunListesi.get(tercih)+"\n";

            System.out.println("Baska bir urun almak istiyor musunuz? Istiyorsaniz Y, istemiyorsaniz N tuslayiniz.");
            char baskaIstiyorMu = scan.next().charAt(0);
            if(baskaIstiyorMu=='N') {
                System.out.println(sepet);
                break;
            }
        }while(true);
        System.out.println("Odenmesi gereken tutar: " + toplamFiyat + "TL");
    }

    public static void kasa() {
        int kasayaGirenPara = toplamFiyat;
        System.out.println("KASA: " + kasayaGirenPara + " TL");
    }
}
