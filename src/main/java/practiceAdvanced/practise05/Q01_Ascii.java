package practiceAdvanced.practise05;

import java.util.Scanner;

public class Q01_Ascii {

    //Kullanıcıdan aldığınız iki karakterin arasında bulunan tüm karakterleri yazdıran bir kod yazınız.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("iki karakter gir");

        char ch1 = input.next().charAt(0);
        char ch2 = input.next().charAt(0);

        int ilk = Math.min(ch1,ch2);
        int ikinci = Math.max(ch1,ch2);

        for (int i = ilk+1; i < ikinci; i++) {
            System.out.print((char)i + " ");
        }


        // 2. yol
        char i = 'a';
        char k = 'e';

        while (i < k) {
            System.out.print(i + " ");
            i++;

        }
    }
}
