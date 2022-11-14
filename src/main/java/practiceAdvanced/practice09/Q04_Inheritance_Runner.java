package practiceAdvanced.practice09;

public class Q04_Inheritance_Runner {
    public static void main(String[] args) {


        B obj1 = new B();
        System.out.println(obj1.i);


        obj1.i = 0;
        System.out.println(obj1.i);

        A objA = new A();
        System.out.println(objA.i);

        //obj Constructora gideceginde classin data type bakarak secer
        //object variable ve metoda giderken constructor`in data type`in a gore gider

        A obj2 = new B();

        obj2.yazdir();

        System.out.println(obj2.j);


    }

}
