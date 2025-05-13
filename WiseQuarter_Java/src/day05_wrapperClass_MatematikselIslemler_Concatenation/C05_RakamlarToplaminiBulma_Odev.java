package day05_wrapperClass_MatematikselIslemler_Concatenation;

import java.util.Scanner;

public class C05_RakamlarToplaminiBulma_Odev {

    public static void main(String[] args) {

        // Kullanicidan 3 basamakli pozitif bir tamsayi alip
        // girilen sayinin rakamlar toplamini asagidaki sekilde yazdirin
        //  "Girilen 245 sayisinin rakamlar toplami : 11"

        Scanner scanner = new Scanner(System.in);
        int rakam;
        int rakamlarToplami = 0;

        System.out.print("Uc basamakli bir sayi giriniz: ");
        int sayi = scanner.nextInt();
        int sayiİlkDeger = sayi;

        rakam = sayi%10;
        rakamlarToplami = rakamlarToplami + rakam;
        sayi = sayi /10; //sayi 2 basamakli oldu

        rakam = sayi%10;
        rakamlarToplami = rakamlarToplami + rakam;
        sayi = sayi /10; //sayi tek basamakli oldu

        rakamlarToplami = rakamlarToplami + sayi;

        System.out.println("Girilen uc basamakli " + sayiİlkDeger + "'nın rakamları toplami: " + rakamlarToplami);

    }
}
