package practiceAdvanced.practice09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q02_MarketGunlukGelir {
    /*
               Günlük gelir market programı yazınız.
         -Tüm günlerin gelirlerini gösteren bir method,
         -Haftalık gelir ortalamasını gösteren bir method,
         -Hangi günlerin ortalama gelirden fazla geliri olduğunu gösteren bir method,
         -Hangi günlerin ortalama gelirden az geliri olduğunu gösteren bir method,
         */

    static List<String> gunler = new ArrayList<>(Arrays.asList("Pazartesi", "Sali", "Carsamba", "Persembe", "Cuma", "Cumartesi", "Pazar"));//asList() : list olarak al listin icine koy

    static List<Double> gunlukGelirler = new ArrayList<>();
    static double toplamGelir = 0;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int gun = 0;

        while (gun < 7) {

            System.out.println(gunler.get(gun) + " gelirini giriniz");

            double gununGeliri = input.nextDouble();

            gunlukGelirler.add(gununGeliri);

            toplamGelir += gununGeliri;

            gun++;


        }
        System.out.println(gunlukGelirler);
        System.out.println("Gelir Ortalamasi :" + gelirOrtalamasi());
    }

    static double gelirOrtalamasi() {
        return toplamGelir / 7;
    }
}
