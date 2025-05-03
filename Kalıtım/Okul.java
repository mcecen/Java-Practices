package Kalıtım2;

class Okul {
    Okul() {    //3
        System.out.println("Okul Constructor"); //4
    }
    protected int sayi1 = 10;
    protected int sayi2 = 15;
    protected String isim1 = "Ali";     //--> Hatice
    protected String isim2 = "Veli";
}
 class Sinif extends Okul {
    int sayi1 = 30;
    int sayi3 = 40;
    String isim2 = "Ayse";          //Kemal
    String isim3 = "Fatma";

    Sinif() {           //1
        //super()       //2
        System.out.println("Sinif Constructor"); //5

        System.out.println(this.sayi1); //6 --> 30
        System.out.println(super.sayi1); //7 --> 10
        System.out.println(this.sayi2); //8 --> 15
        System.out.println(super.sayi2); //9 --> 15
        System.out.println(this.sayi3); //10 --> 40
        //System.out.println(super.sayi3); //11 -->CTE

        super.isim1 = "Hatice"; //12
        System.out.println(this.isim1); //13 --> Hatice
        System.out.println(super.isim1); //14 --> Hatice

        this.isim2 = "Kemal"; //15
        System.out.println(this.isim2); //16 --> Kemal
        System.out.println(super.isim2); //17 --> Veli

        System.out.println(this.isim3); //18 --> Fatma
        //System.out.println(super.isim3); // --> CTE
    }
}