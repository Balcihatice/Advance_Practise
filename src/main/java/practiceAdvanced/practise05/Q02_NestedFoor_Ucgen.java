package practiceAdvanced.practise05;

import java.util.Scanner;

public class Q02_NestedFoor_Ucgen {
    /*
            *
           * *
          * * *
         * * * *
        * * * * *     satirdan yildiz kadar eksik space
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir satir gir");
        int satir = input.nextInt();

        for (int i = 0; i < satir; i++) { //satir kontolu
            for (int bosluk = satir-i ; bosluk >1 ; bosluk--) {// en son satirda space yok 1 de durduk
                System.out.print(" ");
            }
            for (int yildiz = 0; yildiz <= i; yildiz++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
