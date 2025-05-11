package Practice_Mentoring;

import java.util.Scanner;

public class RG10_KelimeBulma {
    public static void main(String[] args) {

        /*10-----
    Kullanıcıdan alınan String kümesi içerisinde aranan String i bulan Java Kodunu yazınız.

    Test Data:
    Java is easy

    Aranan String: is

    Bektenen Çıktı:
    True

    Aranan String: and

    Beklenen Çıktı:False

    */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kelime Giriniz: ");
        String str1 = scanner.nextLine();

        System.out.println("Aranacak kelimeyi giriniz:");
        String arananString1 = scanner.nextLine();

        if (str1.indexOf(arananString1) != -1) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        System.out.println(str1.contains(arananString1));
        System.out.println(str1.indexOf(arananString1));
    }
}