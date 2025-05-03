package Kalıtım2;

class Hayvan2 {
    Hayvan2() {                 //4
        System.out.println("Hayvan constructor'ı çağrıldı."); //5
    }
    void sesCikar(){
        System.out.println("deneme");
    }
}

class Kedi extends Hayvan2 {
    Kedi() {   //2
        //super()       //3
        System.out.println("Kedi constructor'ı çağrıldı."); //6
    }
}

/*
public static void main(String[] args) {

        Kedi kd = new Kedi(); //1

        new Kedi() --> nesnenin oluşturulduğu yer
        Kedi kd --> nesneyi arayacağımız yer
        String str

        kd nesnesinin data tipi Kedi, nesne tipi Kedi

Hayvan constructor'ı çağrıldı.
Kedi constructor'ı çağrıldı.


    }
 */


