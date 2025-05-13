package Practice_Mentoring;

import java.util.Scanner;

public class RG06_SesliSessizHarfBulma {

    public static void main(String[] args) {

    /*6----
    Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
    değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
    1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)

    Sesli harfler: a,e,i,o,u

    Test Data:
    a

    Beklenen Çıktı:
    a harfi sesli harfdir.

    Test Data:
    d

    Beklenen Çıktı:
    d harfi sesiz harftir.

    Test Data:
    we  yada %

    Beklenen Çıktı:
    Yanlis karakter girdiniz!

    */
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen harf giriniz");
        char ch = sc.next().charAt(0);

        if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='ı' || ch=='ö' || ch=='ü')
        {
            System.out.println("Girilen " + ch + " harfi sesli harftir");
        }
        else
        {
            System.out.println("Girilen " + ch + " harfi sessiz harftir");
        }
    }
}
