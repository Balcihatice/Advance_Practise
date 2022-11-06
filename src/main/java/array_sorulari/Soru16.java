package array_sorulari;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Soru16 {

    public static void main(String[] args) {

        /* write a Java program to removes a specific element from an array and put the
         * remaining elements in a new array and prints the new array
         *( bir diziden belirli bir elemani kaldirmak için bir Java programi yazin ve
         *yeni dizide kalan elemanları ve yeni diziyi yazdirin)
         * Input :{1,2,3,4,5,6} element:6
         * Output : [1,2,3,4,5]
         */

        int [] input = 	{1,2,3,4,5,6};

        int kaldirilan = 6;


        List<Integer> outputList = new ArrayList<>();

        for (int each :input) {
            if (each !=kaldirilan)
                outputList.add(each);
        }
        System.out.println(outputList); //[1, 2, 3, 4, 5]

        int output[] = new	int[outputList.size()];

        for (int i = 0; i < output.length; i++) {
            output[i]=outputList.get(i);
        }

        System.out.println(Arrays.toString(output)); //[1, 2, 3, 4, 5]


    }


}
