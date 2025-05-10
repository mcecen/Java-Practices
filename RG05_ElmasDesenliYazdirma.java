package Practice_Mentoring;

public class RG05_ElmasDesenliYazdirma {

    public static void main(String[] args) {

        /*5-----
    Aşağıdaki elmas deseni görüntüsünü çizen java kodunu yazınız.
    Test Data:
    Yarım elmas uzunluğu : 7
    Beklenen Çıktı:
          *
         ***
        *****
       *******
      *********
     ***********
    *************
     ***********
      *********
       *******
        *****
         ***
          *
    */

        System.out.println("\t  *\n" +
                "\t ***\n" +
                "\t*****\n" +
                "   *******\n" +
                "  *********\n" +
                " ***********\n" +
                "*************\n" +
                " ***********\n" +
                "  *********\n" +
                "   *******\n" +
                "\t*****\n" +
                "\t ***\n" +
                "\t  *\n"
        );

        int n = 7; // Yarı yüksekliği (orta kısmın satır sayısı)

        // Üst kısmı yazdır
        for (int i = 1; i <= n; i++) {
            // Boşlukları yazdır
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Yıldızları yazdır
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

         // Alt kısmı yazdır
        for (int i = n - 1; i >= 1; i--) {
            // Boşlukları yazdır
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // Yıldızları yazdır
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
