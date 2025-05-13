package Practice_Mentoring;

import java.util.Scanner;

public class RG03_5lerinCarpimTablosu {

    public static void main(String[] args) {

          /*3----
    Belirlenen sayının 1 den 10 a kadar çarpım sonuçlarını yapan Java programını yazınız.

    Örnek Sonuç:
    5 x 1 = 5
    5 x 2 = 10
    5 x 3 = 15
    5 x 4 = 20
    5 x 5 = 25
    5 x 6 = 30
    5 x 7 = 35
    5 x 8 = 40
    5 x 9 = 45
    5 x 10 = 50
    */


     Scanner scanner = new Scanner(System.in);
     System.out.println("Lütfen sayi giriniz: ");
     int sayi = scanner.nextInt();

        System.out.println(sayi + "x" + 1 + "=" + sayi*1+"\n" +
                           sayi + "x" + 2 + "=" + sayi*2+"\n" +
                           sayi + "x" + 3 + "=" + sayi*3+"\n" +
                           sayi + "x" + 4 + "=" + sayi*4+"\n" +
                           sayi + "x" + 5 + "=" + sayi*5+"\n" +
                           sayi + "x" + 6 + "=" + sayi*6+"\n" +
                           sayi + "x" + 7 + "=" + sayi*7+"\n" +
                           sayi + "x" + 8 + "=" + sayi*8+"\n" +
                           sayi + "x" + 9 + "=" + sayi*9+"\n" +
                           sayi + "x" + 10 + "=" + sayi*10+"\n"
                          );

        int sayac=1;
        while(sayac<=10)
        {
            System.out.println(sayi + "x" + sayac + "=" + sayi*sayac);
            sayac++;
        }
    }
}
