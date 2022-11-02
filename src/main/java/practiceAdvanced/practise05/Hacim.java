package practiceAdvanced.practise05;

public class Hacim {
    //Kup kare diktortgen ve prizmann hacmi hesaplayan bir method olusturunuz
    //(Method overloadin kullaniniz)


    public  void hacimHesapla(int a){
        System.out.println("Kupun Hacmi:" + a*a*a);
    }

    public  void hacimHesapla( int a, int b){
        System.out.println("Kare prizmanin hacmi: " +a*a*b);
    }

    public  void hacimHesapla(int a, int b, int c){
        System.out.println("Dikdortgen prizmanin hacmi: " +a*b*c);
    }
    public int kareninAlanHesapla(int a){
        return a*a;
    }
}
