package Practice_Mentoring;

import java.util.Scanner;

public class RG09_StrConcat {
    
    public static void main(String[] args) {

    /*9----
    2 farklı String'i  ucuca ekleyen Java Kodunu yazınız.

    Test Data:
    str1: Java is
    str2: fun

    Beklenen Çıktı:
    java is fun

    */
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Stringi giriniz: ");
        String str = scanner.nextLine();

        System.out.println("2. Stringi giriniz: ");
        String str1 = scanner.nextLine();

        System.out.println("Stringlerin birleşmiş hali: " +str+" "+str1);

        System.out.println("Stringlerin birleşmiş hali: " +str.concat(" ").concat(str1));
    }
}
