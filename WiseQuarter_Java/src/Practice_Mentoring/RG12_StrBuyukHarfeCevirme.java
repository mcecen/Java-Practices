package Practice_Mentoring;

import java.util.Locale;
import java.util.Scanner;

public class RG12_StrBuyukHarfeCevirme {
    public static void main(String[] args) {
        /*12----
    Kullanıcının girdiği String değerlerini büyük harfe çeviren Java kodunu yazınız.

    Test Data:
    Java is fun

    Beklenen Sonuç:
    JAVA IS FUN
    */
    Scanner sc = new Scanner(System.in);
    System.out.print("Lütfen kelime giriniz: ");
    String str = sc.nextLine();

    System.out.println(str.toUpperCase(Locale.forLanguageTag("Tr")));
    }
}
