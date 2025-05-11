package Practice_Mentoring;

import java.util.Scanner;

public class RG18_SesliHarfSayanCode {
    public static void main(String[] args) {

           /*18----
    Girilen Stringdeki tüm sesli harfleri saymak için bir Java Methodu yazınız.

    Test Data:
    java is fun

    Beklenen Çıktı:

    Stringdeki sesli harf sayısı: 4
    */
    Scanner sc = new Scanner(System.in);
    System.out.print("Kelime giriniz: ");
    String kelime = sc.nextLine();

    sesliHarfSayisiBulma(kelime);
    }

    public static void sesliHarfSayisiBulma(String str) {
        int sayac=0;
        for (int i = 0; i < str.length(); i++) {
        char c = str.toLowerCase().charAt(i);
        if(c=='a' || c=='e'|| c=='i'|| c=='o'|| c=='u')sayac++;
        }
        System.out.println(sayac);
    }
}