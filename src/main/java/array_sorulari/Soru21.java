package array_sorulari;

import java.util.ArrayList;
import java.util.List;

public class Soru21 {

    public static void main(String[] args) {
        /*
         * write a return method that can prints an array in Ascending order without using
         * the sort method of the Arrays class
         * (Array clasindaki sort methodu kullanmadan artan düzende donduren bir methodla  arrayi yazin )
         * Input : {6,2,4,3,1,5}
         * Output :{1,2,3,4,5,6}
         */

        int input[]= {6,2,4,3,1,5} ;
        sortWithoutSortMethod(input );

    }
    public static void sortWithoutSortMethod(int input[] ) {

        List<Integer> inputList = new ArrayList<>();

        for(int each:input) {
            inputList.add(each);
        }

        List<Integer> outputList = new ArrayList<>();

        while(inputList.size()>0) { //arrayde elamn var iken

            int min=Integer.MAX_VALUE; // min max olsun

            for (int i = 0; i < inputList.size(); i++) { //input listdeki elemanlara bak,
                // aldigin eleman min den küçükse o yeni min olsun

                if (inputList.get(i)<min) {
                    min=inputList.get(i);
                }
            }

            outputList.add(min); // min outliste ekle
            inputList.remove(inputList.indexOf(min));// inputlist den baktigin elemani kaldir
            // tekrar dongude basa git
        }

        System.out.println("output :" + outputList);

    }
}
