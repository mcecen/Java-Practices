package Practice_Mentoring;

public class RG25_ArraydeKacinciElemanOldugunuBulma {
    public static void main(String[] args) {
         /*25----
    Aranan değerin Array içerisinde kaçıncı eleman olduğunu bulan Java Kodu yazınız.

    Array: [12,15,43,23,56,76,78,90,77,43]

    Aranan değer:56

    Beklenen Çıktı:
    56 sayısı arrayin 4. elemanı
    */
    int [] liste = {12,15,43,23,56,76,78,90,77,43};

    int aranan=77;

    for (int i = 0; i < liste.length; i++) {

        if (liste[i] == aranan) System.out.println("Aranan " + aranan+" elemanı listede " +i+" .sıradadır");

        }
    }
}
