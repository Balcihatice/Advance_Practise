package practiceAdvanced.practise05;

public class Q04_Varargs_HesapMakinesi {
    /*
    //Temel 4 matematik işlemi yapan bir kod yazınız.
     */

    public static void main(String[] args) {

        HesapMakinesi hm = new HesapMakinesi();

        hm.toplama(6, 4, 7, 8, 9, 3, 2, 4, 56);
        hm.cikarma(89, 65);
        hm.carpma(3, 5, 2,4,6);
        hm.bolme(90, 3);
    }
}
