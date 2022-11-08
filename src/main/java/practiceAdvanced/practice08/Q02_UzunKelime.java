package practiceAdvanced.practice08;

import java.util.*;

public class Q02_UzunKelime {
    /*
          Kullanıcıdan alınan cümledeki en uzun kelimeyi(kelimeleri) return eden bir method oluşturunuz.
         */

    public static void main(String[] args) {

        System.out.println(enUzunKelime());

    }

    public static List<String> enUzunKelime( ) { //Kullanicidan str aldigimiz icin Parametre girmedik

        Scanner input = new Scanner(System.in);
        System.out.println("Kelime girin");

        String str = input.nextLine();

        String[] arr = str.split(" ");
        int max = 0;

        for (String w : arr) {

            if (w.length()> max){

                max = w.length();
            }

        }
        List<String> enUzunKelimeler = new ArrayList<>();
        for (String w:arr) {
            if (w.length()==max){
                enUzunKelimeler.add(w);
            }
        }

        return enUzunKelimeler;
    }




}
