package array_sorulari;

public class Soru14 {
    public static void main(String[] args) {
    /*
     * write a method that accepts a 2 dimensional array and finds the max value
     * (2 boyutlu bir diziyi kabul eden ve maksimum degeri bulan bir method yazin )
     * Input : {{1,2,3},{4,5},{6,7,8}}
     * Output : 8
     */

    int Input [][]= {{1,2,3},{4,5},{6,7,8}};
    /*
     * 1,2,3 -> 0. kat
     * 4,5   -> 1. kat
     * 6,7,8 -> 2. kat
     *
     */



		System.out.println("iki katli array in max elemani : " + maxdegeribul(Input)); //8


}

    public static int maxdegeribul(int[][] input) {
        int max =input [0][0];

        for (int kat = 0; kat < input.length; kat++) {
            for (int daire= 0; daire < input[kat].length; daire++) {
                if (input [kat][daire]> max) {
                    max =input [kat][daire];
                }
            }
        }
        return max;
    }

}
