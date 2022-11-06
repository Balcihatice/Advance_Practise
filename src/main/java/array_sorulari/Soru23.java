package array_sorulari;

import java.util.ArrayList;
import java.util.List;

public class Soru23 {

    public static void main(String[] args) {
        /* write a return method that accepts 2 integer Arrays as parameters
         * And adds 2 array into a new Array and prints it.
         *(Parametre olarak 2 tamsayi diziyi kabul eden ve
         *iki diziyide yeni bir diziye ekleyen ve onu yazdiran bir method yazin)
         * Input1={0,1,2,3,4,5}       Input2={6,7,8,9,10}
         * Output={0,1,2,3,4,5,6,7,8,9,10}
         *
         */
        int input1[]={0,1,2,3,4,5};
        int input2[]={6,7,8,9,10};

        addArrays(input1,input2);

    }
    public static void addArrays(int[] input1, int[] input2) {

        List<Integer> addArrayList = new ArrayList<>();

        for (int each : input1) { // input1 elemanlari addArrayList e eklendi
            addArrayList.add(each);
        }
        for (int each : input2) { //  input2 elemanlari addArrayList e eklendi
            addArrayList.add(each);
        }
        System.out.println(addArrayList);  //[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

    }
}
