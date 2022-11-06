package array_sorulari;

import java.util.Arrays;

public class Soru24 {

    public static void main(String[] args) {
        /*
         * Congratulations kelimesini Array yontemlirini kullanarak asagidaki outputu
         * alin.
         *
         * [C, o, n, g, r, a, t, u, l, a, t, i, o, n, s] [s, n, o, i, t, a, l, u, t, a,
         * r, g, n, o, C] snoitalutargnoC Cingritilitiins // o ,a ve u harfini i ye
         * donusturun
         */
        String str = "Congratulations";
        String[] arr = str.split("");
        System.out.println(Arrays.toString(arr)); // [C, o, n, g, r, a, t, u, l, a, t, i, o, n, s]
        // Stringin diziye cevrilmis orjinal hali
        System.out.println();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i].equals("o") || arr[i].equals("a") || arr[i].equals("u"))
                arr[i] = "i";
            String yeni = arr[i].replaceAll(",", "");
            System.out.print(yeni);
        }
        System.out.println();



    }
}
