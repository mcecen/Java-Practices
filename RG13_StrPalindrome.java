package Practice_Mentoring;

import java.util.Scanner;

public class RG13_StrPalindrome {
    public static void main(String[] args) {

        /*13----
    Bir palindrom, madam veya racecar veya 10801 sayısı gibi
    ileriye doğru geriye doğru okuyan bir kelime, sayı, kelime öbeği veya diğer karakter dizisidir.

    Girilecek kelimenin palindrom olup olmadığını doğrulayacak bir Java Kodu yazın.

    Test Data:
    madam

    Beklenen Çıktı:
    True
    */

        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen kelime giriniz: ");
        String str = sc.nextLine();
        String tersMetin = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            tersMetin += str.charAt(i);
        }

        if (tersMetin.equals(str)) {
            System.out.println("Kelime palindrome");
        }
        else {
            System.out.println("kelime palindrome değil");
        }
    }
 }