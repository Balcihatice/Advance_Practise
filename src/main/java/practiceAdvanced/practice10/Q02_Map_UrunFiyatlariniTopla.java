package practiceAdvanced.practice10;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Q02_Map_UrunFiyatlariniTopla {
  /*
    Bir map içerisinde verilen fiyatların toplamını bulan bir kod yazınız.(for each loop kullanınız)
    Örn: {Kemer=19.99, Gömlek=29.99, Ayakkabı=89.99, Kazak=24.99, Kravat=19.99} ==> Toplam: 184.95
  */

    public static void main(String[] args) {

        HashMap<String, Double> urunFiyati = new HashMap<>();

        urunFiyati.put("Kemer", 19.99);
        urunFiyati.put("Gömlek", 29.99);
        urunFiyati.put("Ayakkabı", 89.99);
        urunFiyati.put("Kazak", 24.99);
        urunFiyati.put("Kravat", 19.99);

        System.out.println(fiyatToplami(urunFiyati));

    }

    public static double fiyatToplami(Map<String, Double> map) {

        System.out.println("Urunler ve Fiyatlari: " + map);//{Kemer=19.99, Kazak=24.99, Kravat=19.99, Gömlek=29.99, Ayakkabı=89.99}

        Collection<Double> fiyatlar = map.values();
        System.out.println("Fiyatlar :" +fiyatlar);//[19.99, 24.99, 19.99, 29.99, 89.99]

        double toplam = 0;

        for (double w : map.values()) {
            toplam += w;
        }

        return toplam;

    }

}
