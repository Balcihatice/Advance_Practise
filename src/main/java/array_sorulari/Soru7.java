package array_sorulari;

public class Soru7 {

    /*
     * Bir array'deki en buyuk ve en kucuk sayiyi iki ayri methodda Arrays.sort() methodu
     * kullanmadan method olusturucak sekilde yapiniz
     */
    public static void main(String[] args) {
        int arr[] = {5, 20, 18, -2, -30, 156};
        int arr2[] = {5, 20, 18, -2, -30, 156, 12893, 23};
        enKucuk(arr);
        System.out.println();
        enBuyuk(arr2);
    }

    public static void enKucuk(int arr[]) {
        int temp = Integer.MAX_VALUE; //2147483647
        //{5, 20, 18, -2, -30, 156}
        for(int each:arr) {
            if(each<temp) {
                temp = each;

            } 			// int Min value = -2147483648
        }
        System.out.print(temp + " ");
    }


    public static void enBuyuk(int arr[]) {
        int temp = Integer.MIN_VALUE;
        int temp2 = arr[0];

        for(int each:arr) {
            if(each>temp) {
                temp = each;

            }
        }
        System.out.print(temp + " ");
    }



}
