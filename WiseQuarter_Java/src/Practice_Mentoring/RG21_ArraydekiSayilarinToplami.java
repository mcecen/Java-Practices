package Practice_Mentoring;

public class RG21_ArraydekiSayilarinToplami {
    public static void main(String[] args) {
        /*21----
    Array deki sayıları tolpayan Java kodunu yazınız.

    array  [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

    Beklenen Çıktı:
    Array toplamı: 55
    */
        int[] liste = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int toplam = 0;
        for (int i = 0; i < liste.length ; i++) {
            toplam += liste[i];

        }
        System.out.println(toplam);
    }
}
