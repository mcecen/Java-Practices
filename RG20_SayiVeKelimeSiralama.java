package Practice_Mentoring;

import java.util.Arrays;

public class RG20_SayiVeKelimeSiralama {
    public static void main(String[] args) {

        /*20----
    Karışık verilen sayıları  ve kelimeleri  sıralayan   Java kodunun yazınız.
    not: Test datadaki değerleri kullanınız.


    Test Data:
    [1232, 1134,2345,1022]
    [Java, Python, PHP, C#, C Programming, C++]

    Beklenen Çıktı:
    [1022,1134,1232,2345]
    [C Programming, C#, C++, Java, PHP, Python]
    */

    //String[] liste = {"C++","C Programming","C#","Python", "Java","PHP"};
    sirala();
    }
    public static void sirala() {

        int[] liste = {1232, 1134, 2345, 1022};
        Arrays.sort(liste);
        System.out.println(Arrays.toString(liste));
    }
}
