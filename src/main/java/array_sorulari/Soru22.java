package array_sorulari;

public class Soru22 {

    public static void main(String[] args) {
        /*
         * write a method that accepts an integer array as input and prints the minimum
         * and the maximum numbers from given array
         * (Bir tamsayi dizisini girdi olarak kabul eden ve verilen diziden minimum ve
         * maksimum sayilari yazdiran bir method yazin)
         * Input : {3,2,5,4,1,6}
         * Output : min: 1 max : 6
         */


        int input[]={3,2,5,4,1,6};
        findmaxAndMin(input);

    }
    public static void findmaxAndMin(int input[]) {

        int max= input[0];
        int min = input[0];

        for (int i = 0; i < input.length; i++) {

            if (input[i]>max) {
                max=input[i];
            } if (input[i]<min) {
                min=input[i];
            }

        }

        System.out.println("Min value in the array : " + min
                +"\nMax value in the array : " + max);

    }
}
