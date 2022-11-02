package practiceAdvanced.practise06;

public class Q04_Kutuphane {

    //Kütüphaneye eklemek istediğiniz kitapları, adı, yazar adı, sayfa sayısı,
    // seri numarası ile yazdıran bir kod yazınız.

    public static void main(String[] args) {

        Kitap kitap = new Kitap("Calikusu", "Resat Nuri Guntekin", 700);
        kitap.kitapBilgileri();

        System.out.println("-----<<>>-----");

        Kitap kitap2 = new Kitap("Vadideki Zambak", "Honore de Balzac", 500);
        kitap2.kitapBilgileri();

        System.out.println("-----<<>>-----");

        new Kitap("1984", "George Orwell", 352).kitapBilgileri();


    }

}
