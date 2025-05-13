package PracticeMe;

import java.util.Scanner;

public class WiseQuarter_P01_Bolunebilme {

    public static void main(String[] args) {

        /*
           Soru - Kullanicidan bir sayi alin, sayi 3 ile bolunuyorsa ”Uc ile bolunebilen
           sayi”, 5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen pozitif tamsayi giriniz: ");
        int tamsayi = scan.nextInt();

        if (tamsayi % 5 == 0) {

            System.out.println("Sayi 5'e tam bölünüyor. Sayi 5'in tamkati");
        }

        if (tamsayi % 3 == 0) {

            System.out.println("Sayi 3'e tam bölünüyor. Sayi 3'un tamkati");
        }
    }
}
