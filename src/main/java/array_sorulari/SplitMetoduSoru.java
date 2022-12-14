package array_sorulari;

public class SplitMetoduSoru {

    public static void main(String[] args) {
        // Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
        // Cumle: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.

        //1.yol
        String str = "Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";

        str = str.replace(" ", ""); // str = "Verilenbircumledekibosluklarhariccharactersayisinibulunuz."

        String harf[] = str.split("");
        System.out.println(harf.length);

        //2.yol
        //Bosluk sayisi kelime sayisindan bir azdir
        //Bosluk sayisi = Kelime sayisi - 1
        String str1 = "Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";

        String kelime[] = str1.split(" ");
        int boslukSayisi = kelime.length - 1;
        System.out.println(boslukSayisi);

        String character[] = str1.split("");
        System.out.println(character.length - boslukSayisi);
    }
}
