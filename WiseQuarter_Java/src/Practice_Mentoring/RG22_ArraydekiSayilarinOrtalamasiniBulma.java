package Practice_Mentoring;

public class RG22_ArraydekiSayilarinOrtalamasiniBulma {
    public static void main(String[] args) {
         /*22----
    Arraydeki sayıların ortalamasını hesaplayan Java Kodunu yazınız.

    Array =  [20, 30, 25, 35, -16, 60, -100 ]

    Beklenen Çıktı:
    Array Sayılarının ortalaması: 7.0
    */
        int[] liste = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int toplam = 0;
        for (int i = 0; i < liste.length ; i++) {
            toplam += liste[i];

        }
        System.out.println(toplam/ liste.length);
    }
}
