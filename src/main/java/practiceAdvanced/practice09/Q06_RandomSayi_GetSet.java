package practiceAdvanced.practice09;

import java.util.ArrayList;
import java.util.List;

public class Q06_RandomSayi_GetSet {
    /*
       Create a method to add 10 random integers from 0 to 20 into a List. Convert even numbers to 111.
       Bir List içerisine 0'dan 20'ye rastgele 10 tam sayi atayan ve atanan çift sayıları "ciftSayi" String değerine
       dönüştüren bir kod yazınız. Eğer çift sayi içermezse "Cift Sayi Yoktur" yazdırın.
      Örn:[19, 11, 10, 19, 4, 6, 15, 18, 1, 14]
          [19, 11, CiftSayi, 19, CiftSayi, CiftSayi, 15, CiftSayi, 1, CiftSayi]
      */

    public static void main(String[] args) {

        //List`i Object data type`inda yaparsak sayi da koyariz,String de koyariz

            rasgeleSayiEkle();

    }

    public static void rasgeleSayiEkle() {

        List<Object> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {

            list.add((int) (Math.random() * 21));

        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {

            if ((int) (list.get(i)) % 2 == 0) {

                list.set(i, "CiftSayi");

            }
        }
        System.out.println(list);

        if (!list.contains("CiftSayi")) {

            System.out.println("Cift Sayi Yoktur");
        }
    }
}
