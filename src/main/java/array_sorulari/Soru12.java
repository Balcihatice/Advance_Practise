package array_sorulari;

public class Soru12 {

    /*
        check your array's first and last elements are same
        (dizinizin ilk ve son elemanlarının atyn olup olmadığını kontrol edin)
        int []arr={2,6,4,8,2,6,2};
         */
    public static void main(String[] args) {


        int[] arr = {2, 6, 4, 8, 2, 6, 2};


        arr[0] = 2;
        arr[arr.length - 1] = 2;
        boolean ayniMi = false;

        if (arr[0] == arr[arr.length - 1])
            ayniMi = true;

        else
            ayniMi = false;


        System.out.println("ilk ve son eleman ayni mi :" + ayniMi);
    }

}
