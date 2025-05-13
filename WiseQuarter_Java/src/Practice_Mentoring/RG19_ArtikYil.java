package Practice_Mentoring;

import java.util.Scanner;

public class RG19_ArtikYil {
    public static void main(String[] args) {

         /*19----
    Kullanıcı tarafından girilen bir yılın  artık yıl olup
    olmadığını kontrol etmek için bir Java Methodu yazınız.

    Test Data:
    2017

    Beklenen Çıktı:
    false
    */
    Scanner sc = new Scanner(System.in);
    int yil = sc.nextInt();

    if(yil%400==0 || (yil%100!=0 && yil%4==0)) System.out.println("Girilen yil artıktır");
    else System.out.println("Girilen yil artık değildir");
    }
}
