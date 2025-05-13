package PracticeMe;

import java.util.Scanner;

public class WiseQuarter_P03_SinifGecme {

    public static void main(String[] args) {
        /*
            Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den
            kucukse “Maalesef kaldin” yazdirin.

         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen not giriniz: ");
        int not = scanner.nextInt();

        if (not >= 50) {
            System.out.println("Sinifi Gectin");
        }

        if (not <= 50) {
            System.out.println("Maalesef kaldin");
        }
    }
}
