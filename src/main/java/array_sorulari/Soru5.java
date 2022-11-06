package array_sorulari;

import java.util.Scanner;

public class Soru5 {

    //  // Kullan�c�dan 25.01.2000 format�nda tarih alaca��z ve bu tarihi yaz�ya �eviren java kodu yazal�m
    //yirmibes ocakikibin
    //"ocak", "subat", "mart", "nisan", "mayis", "haziran", "temmuz", "agustos","eylul", "ekim", "kasim", "aralik"
    //"bir", "iki", "uc", "dort", "bes", "alti", "yedi", "sekiz", "dokuz"
    //"on", "yirmi", "otuz", "kirk", "elli", "altmis", "yetmis", "seksen", "doksan"
    //"yuz", "ikiyuz", "ucyuz", "dortyuz", "besyuz", "altiyuz", "yediyuz","sekizyuz", "dokuzyuz"
    //"bin", "ikibin", "ucbin", "dortbin", "besbin", "altibin", "yedibin","sekizbin", "dokuzbin"
    public static void main(String[] args) {


    Scanner input = new Scanner(System.in);
		System.out.println("01.01.2000 format�nda tarih giriniz.");
    String tarih = input.nextLine();//25.10.1995

    int on =new Integer(tarih.substring(0,1));//2
    int bir =new Integer(tarih.substring(1,2));//5
    int ay =new Integer(tarih.substring(3,5));//10
    int yilbinler=new Integer(tarih.substring(6,7));//1
    int yilyuzler=new Integer(tarih.substring(7,8));//9
    int yilonlar=new Integer(tarih.substring(8,9));//9
    int yilbirler=new Integer(tarih.substring(9,10));//5

    String [] aylar = {"","ocak", "subat", "mart", "nisan", "mayis", "haziran",
            "temmuz", "agustos","eylul", "ekim", "kasim", "aralik"};
    String [] birler = {"","bir", "iki", "uc", "dort", "bes", "alti", "yedi", "sekiz", "dokuz"};
    String [] onlar = {"","on", "yirmi", "otuz", "kirk", "elli", "altmis", "yetmis", "seksen", "doksan"};
    String [] yuzler = {"","yuz", "ikiyuz", "ucyuz", "dortyuz", "besyuz", "altiyuz", "yediyuz","sekizyuz", "dokuzyuz"};
    String [] binler = {"","bin", "ikibin", "ucbin", "dortbin", "besbin", "altibin", "yedibin","sekizbin", "dokuzbin"};

		System.out.println("Girilen tarihin yazi ile yazilmasi: "+onlar[on] + birler[bir]+" " +aylar[ay]+" " +
    binler[yilbinler]+ yuzler[yilyuzler]+onlar[yilonlar] + birler[yilbirler]);

}
}
