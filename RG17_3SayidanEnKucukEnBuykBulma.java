package Practice_Mentoring;

import java.util.Scanner;

public class RG17_3SayidanEnKucukEnBuykBulma {
    public static void main(String[] args) {
          /*17---
    Üç sayı arasındaki en küçük sayıyı bulmak için bir Java METHOD yazın.

    Test data:
    12,24,34

    Beklenen Çıktı:
    12
    */
    Scanner sc = new Scanner(System.in);
    System.out.print("İlk sayiyi giriniz: ");
    int sayi = sc.nextInt();
    System.out.print("İkinci sayiyi giriniz: ");
    int sayi2 = sc.nextInt();
    System.out.print("üçüncü sayiyi giriniz: ");
    int sayi3 = sc.nextInt();

    int kucukSayi = enKucuk(sayi,sayi2,sayi3);
    System.out.println("En küçük sayi: "+ kucukSayi);

    RG17_3SayidanEnKucukEnBuykBulma dnm = new RG17_3SayidanEnKucukEnBuykBulma();
    int kucukSayi2=dnm.enKucuk2(sayi,sayi2,sayi3);
    System.out.println("En küçük sayi: "+ kucukSayi2);
    }

    public static int enKucuk(int sayi, int sayi2, int sayi3){

        int enKucuk = 0;

        if(sayi<sayi2) enKucuk = sayi;
        else if(sayi2<sayi) enKucuk = sayi2;
        else if(sayi3<sayi) enKucuk = sayi3;

        return enKucuk;
    }
    public int enKucuk2(int sayi, int sayi2, int sayi3){

        int enKucuk = 0;

        if(sayi<sayi2) enKucuk = sayi;
        else if(sayi2<sayi) enKucuk = sayi2;
        else if(sayi3<sayi) enKucuk = sayi3;

        return enKucuk;
    }
}