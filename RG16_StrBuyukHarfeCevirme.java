package Practice_Mentoring;

import java.util.Locale;
import java.util.Scanner;

public class RG16_StrBuyukHarfeCevirme {
    public static void main(String[] args) {

          /*16----
    Girilen stringdeki tüm karakterleri büyük harfe dönüştürmek için bir Java programı yazın.

    Test Data:
    java is fun

    Beklenen Çıktı:
    JAVA IS FUN
    */

    Scanner sc = new Scanner(System.in);
    System.out.print("Lütfen kelime giriniz: ");
    String str = sc.nextLine();

    System.out.println(str.toUpperCase(Locale.forLanguageTag("Tr")));
    }
}
