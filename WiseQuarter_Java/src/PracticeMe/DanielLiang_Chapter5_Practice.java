package PracticeMe;

public class DanielLiang_Chapter5_Practice {

    public static void main(String[] args) {

        // 1'den 9'a kadar olan sayıların çarpım tablosu ile görünümü

        System.out.println("\t\t\tÇarpım Tablosu");
        System.out.print("\t");
        for (int i = 1; i <=9 ; i++)
        {
            System.out.print(i+" \t");

        }
        System.out.println();
        System.out.println("\t—————————————————————————————————");

        for (int i = 1; i <=9 ; i++) {
            System.out.print(i+" |");

            for (int j = 1; j <= 9; j++) {
                System.out.print("\t"+i*j+" ");

            }
            System.out.println();


        /*--------------------------------------------------------------------------------------*/
         /*
         Aşağıdaki patterni yazdırın

         1
         1 2
         1 2 3
         1 2 3 4
         1 2 3 4 5
         1 2 3 4 5 6

          */


        /*--------------------------------------------------------------------------------------*/

        /*
         Aşağıdaki patterni yazdırın

         1 2 3 4 5 6
         1 2 3 4 5
         1 2 3 4
         1 2 3
         1 2
         1

          */



        /*--------------------------------------------------------------------------------------*/
        /*
         Aşağıdaki patterni yazdırın

              1
            2 1
          3 2 1
        4 3 2 1
      5 4 3 2 1
    6 5 4 3 2 1

          */


        /*--------------------------------------------------------------------------------------*/

/*
         Aşağıdaki patterni yazdırın

        1 2 3 4 5 6
          1 2 3 4 5
            1 2 3 4
              1 2 3
                1 2
                  1

          */

        }
    }
}
