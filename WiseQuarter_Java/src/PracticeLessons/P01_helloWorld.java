package PracticeLessons;

public class P01_helloWorld {
    public static void main(String[] args) {

        //SORU 1: Aşağıdaki her birini tek bir satır kod içine yazarak konsola yazdırınız
        /*
        Hello World
        a = 3
        Hello       World
         */
        System.out.println("Hello World");
        int a=3;
        System.out.println("a = " + a);
        System.out.println("Hello       World");

        System.out.print("Merhaba"); // print yazılırsa ifadeyi yazdırır ve alt satıra geçmez. o satırdan bir sonraki satırı yazdırır.
        System.out.println("Dünya"); //pirintln olursa ifadeyi yazdırır ve bir sonraki satırdaki işlemi alt satırdan yazdırır.


        //SORU 2: Konsola "Hello Java Ben Geldim" yazdırın
        System.out.println("\"Hello Java Ben Geldim\"");

        //SORU 3: Konsola 'Hello Java Ben Geldim' yazdırın
        System.out.println("'Hello Java Ben Geldim'");

        /* SORU 4:
        Tek bir sout içinde konsola aşağıdaki ifadeyi yazdırınız
        Hello World
            "Merhaba Dünya"
         */

        System.out.println("Hello World\n\t\"Merhaba Dünya\"");

        /*

        \": ters slash işareti kendinden sonrakini kod olarak algılanmamasını sağlar
        \t: bu işaret konulan string içinde işaretin konulduğu yere bir TAB tuşu(4 space) kadar boşluk bırakır
        \n or \r: String içinde konulduğu yerden itibaren aşşağı satırdan devam eder.


         */

        /* SORU 5:

       /*
        ÖDEV SORUSU: Aşağıdaki gibi bir ATM Karşılama Ekranı Hazırlayıp yazdırınız
        **********  WISE BANK   **********
            WISE ATM'YE HOŞGELDİNİZ
            1 – Bakiye Sorgulama
            2 – Para Yatırma
            3 – Para Çekme
            4 – Bilgi Güncelleme
            5 – Kart İade
        **********  WISE BANK   **********
         */

        System.out.println("**********  WISE BANK   **********\n\tWISE ATM'YE HOŞGELDİNİZ\n\t1 – Bakiye Sorgulama\n\t2 – Para Yatırma\n\t3 – Para Çekme\n\t4 – Bilgi Güncelleme\n\t5 – Kart İade\n**********  WISE BANK   **********");





    }
}
