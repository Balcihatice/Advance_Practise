package practiceAdvanced.practise05;

import java.time.LocalDate;

public class Market {
    String urunAdi;
    double urunFiyati;
    String sonKullanmaTarihi;

    Market(String urunIsmi, double fiyat, int aySonra) {

        urunAdi = urunIsmi;

        urunFiyati = fiyat;

        sonKullanmaTarihi = LocalDate.now().plusMonths(aySonra).toString();

    }

    Market(String urunIsmi, double fiyat) {

        urunAdi = urunIsmi;
        urunFiyati = fiyat;
        sonKullanmaTarihi = "Bu urunun son kullanma tarihi yoktur";

    }
}
