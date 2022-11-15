package practiceAdvanced.practice10;
/*
      İki farklı Array'de aynı indekste barındırırılan ad ve soyadları örnekteki gibi yazdıran bir kod yazınız.
          input : {"John", "Mark", "Ali"}; {"Doe", "Twain", "Can"};
          output : {John=Doe, Mark=Twain, Ali=Can};
       */

import java.util.HashMap;
import java.util.Map;

public class Q05_MapAdSoyad {

    public static void main(String[] args) {

        String[] ad  = {"John", "Mark", "Ali"};
        String[] soyAd  = {"Doe", "Twain", "Can"};

        Map<String, String> adsoyad = new HashMap<>();

        for (int i = 0; i < ad.length; i++) {
            adsoyad.put(ad[i],soyAd[i]);
        }
        System.out.println("AdSoyad :" + adsoyad);
    }
}
