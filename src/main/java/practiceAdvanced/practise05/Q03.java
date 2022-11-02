package practiceAdvanced.practise05;

public class Q03 {
    public static void main(String[] args) {

       Hacim hacim = new Hacim();
       hacim.hacimHesapla(5);
       hacim.hacimHesapla(5,6);
       hacim.hacimHesapla(5,6,1);

       int alan = hacim.kareninAlanHesapla(5);
       System.out.println("alan = " + alan); // alan+50 diyebiliriz artik


    }
}
