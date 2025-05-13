package Practice_Mentoring;

import java.util.Scanner;

public class RG01_BasamakDegerleriToplami {

    public static void main(String[] args) {

        /*1---
    Sayinin Sayi degerlerinin toplamasini yapan Java kodu yaziniz.

    Test Data
    34
    Beklenen Cikti
    7
    */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        int toplam = 0;
        while (sayi != 0) {
            toplam += sayi % 10; // Son basamağı al ve topla
            sayi /= 10; // Son basamağı çıkar
        }
        System.out.println("Basamak toplamı: " + toplam);

    }
}



