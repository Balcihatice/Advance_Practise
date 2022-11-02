package practiceAdvanced.practice02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
   kullanıcının girdigi bir array'in en buyuk elemani ile
   en kucuk elemanının  farkını bulan bir method create ediniz.

 */
public class AarrayOlustur {

    public static void main(String[] args) {
arrayOlustur();
    }


    private static void arrayOlustur() {
        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen array uzunlugunu giriniz");

        int lenght = input.nextInt();

        int[] arr = new int[lenght];
        for (int i = 0; i < lenght; i++) {
            System.out.println("Array`in " + (i + 1) + " inci elemanini giriniz");
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Fark :" +(arr[lenght-1]- arr[0]));
    }

}
