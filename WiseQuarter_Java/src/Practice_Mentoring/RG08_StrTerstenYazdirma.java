package Practice_Mentoring;

import java.util.Scanner;

public class RG08_StrTerstenYazdirma {

    public static void main(String[] args) {

     /*8----
     Girilen String değerde tersten yazan Java kodunu yazınız.

    Test Data:
    java
    avaj
    */

        Scanner scanner = new Scanner(System.in);
        System.out.println("String giriniz: ");
        String str = scanner.nextLine();

        String tersMetin ="";

        for (int i = str.length() - 1; i>=0; i--)

            //System.out.println(str.charAt(i));

            tersMetin += str.charAt(i);

        System.out.println("Girilen string değerinin tersi: " + tersMetin);
    }
}
