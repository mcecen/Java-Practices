package Practice_Mentoring;

import java.util.Scanner;

public class RG11_StrSonKarakterSilme {

    public static void main(String[] args) {

    /*11----
    Kullanıcıdan alınan Stringin son karakteirini silip ekrana yazan Java kodunu yazınız.

    Test Data:
    good

    Beklenen Çıktı:
    goo
	*/

    Scanner sc = new Scanner(System.in);
    System.out.print("Lütfen kelime giriniz: ");
    String str = sc.nextLine();

    System.out.println(str.substring(0,str.length()-1));

    }
}
