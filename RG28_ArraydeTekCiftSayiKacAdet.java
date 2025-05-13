package Practice_Mentoring;

public class RG28_ArraydeTekCiftSayiKacAdet {
    public static void main(String[] args) {
        /*28----
    Array içerisindeki tek ve çift sayıların
    kaçar tane olduğunu bulan Java Kodu yazınız.

    Array: [1,2,3,4,5,6,7,8,9]

    Beklenen Çıktı:

    Tek Sayilar: 5
    Cift Sayilar: 4
    */
        int [] liste = {1,2,3,4,5,6,7,8,9};

        int tekSayisi = 0;
        int ciftSayisi = 0;

        for (int i = 0; i < liste.length; i++) {

            if (i%2==0) ciftSayisi++;
            else tekSayisi++;

        }
        System.out.println("Çift sayi sayisi: "+ ciftSayisi);
        System.out.println("tek sayi sayisi: "+tekSayisi);
    }
    }

