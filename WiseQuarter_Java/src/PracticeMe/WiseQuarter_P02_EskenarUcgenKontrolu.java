package PracticeMe;

import java.util.Scanner;

public class WiseQuarter_P02_EskenarUcgenKontrolu {

    public static void main(String[] args) {

        /*
            Soru: Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
            “Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.
         */

        Scanner input = new Scanner(System.in);
        System.out.print("1. kenar uzunlugunu giriniz: ");
        int kenar = input.nextInt();

        System.out.print("2. kenar uzunlugunu giriniz: ");
        int kenar2 = input.nextInt();

        System.out.print("3. kenar uzunlugunu giriniz: ");
        int kenar3 = input.nextInt();

        if (kenar == kenar2 && kenar == kenar3) {
            System.out.println("Eskenar ucgen");
        }

        if (!(kenar != kenar2 && kenar == kenar3)) {
            System.out.println("Eskenar ucgen degil");
        }

    }
}
