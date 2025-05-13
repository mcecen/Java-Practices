package Practice_Mentoring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RG24_ArraydeIstenenDegeriBulma {
    public static void main(String[] args) {

           /*24----
    Yazılan değerin array içerisinde arayan Java Kodu yazınız.

    Array: [1551,1223,1443,1267,1789,1023,2020]


    Aranan Değer:2020
    Beklenen Çıktı:True

    Aranan Değer:2010
    Beklenen Çıktı :False
    */

        List<Integer> liste = new ArrayList<>();
        liste.add(1551);
        liste.add(1223);
        liste.add(1443);
        liste.add(1267);
        liste.add(1789);
        liste.add(1023);
        liste.add(2020);

        int aranan=1551;
        System.out.println("Aranan "+aranan+" sayisi liste içinde var mı: "+ liste.contains(aranan));
    }
}
