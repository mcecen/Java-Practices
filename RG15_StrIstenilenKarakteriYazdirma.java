package Practice_Mentoring;

import java.util.Scanner;

public class RG15_StrIstenilenKarakteriYazdirma {
    public static void main(String[] args) {

        /*15----
    Grilen String değer içinde istenen sıradaki karakteri bulan Java kodunu yazınız.

    Test Data:
    Java is fun


    Beklenen Çıktı
    0. pozisyondaki karakter : J

    5. pozisyondaki karakter : i
    */

    Scanner sc = new Scanner(System.in);
    System.out.print("Lütfen kelime giriniz: ");
    String str = sc.nextLine();
    System.out.print("Lütfen sıra numarası giriniz: ");
    int sayi = sc.nextInt();

    System.out.println("Girilen kelimenin "+sayi+" sırasındaki karakteri: " +str.charAt(sayi-1));


    }
}
