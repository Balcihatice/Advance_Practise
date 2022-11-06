package array_sorulari;

public class Soru1 {

    /*
       Write a java program to count occurrences of each character in String in java. If the String is
       "Java Hungry" then the answer should be

        kullanıcıdan alınan bir  String'deki herbir  karakterin adedini bir array içinde yazdıran bir java programı yazın.
        String  "Java Hungry" ise cevap şöyle olmalıdır:
        { =1, a=2, r=1, u=1, v=1, g=1, H=1, y=1, J=1, n=1}
   */
    public static void main(String[] args) {
        String str = "Java Hungry";

        int count[] = new int[256];

        // int len = str.length();

        // Initialize count array index :Count dizi indeksini başlat
        for (int i = 0; i < str.length(); i++)
            count[str.charAt(i)]++;

        // Create an array of given String size:Verilen Dize boyutunda bir dizi oluşturun
        char ch[] = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {

                // If any matches found:Herhangi bir eşleşme bulunursa
                if (str.charAt(i) == ch[j])
                    find++;
            }

            if (find == 1)
                System.out.println( str.charAt(i) + " = " + count[str.charAt(i)]);
        }

    }
}
