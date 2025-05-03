package Kalıtım2;

class Arac {
    Arac(String marka) {        //4
        System.out.println("Arac markası: " + marka); //5
    }
}

class Otomobil extends Arac {
    Otomobil(String marka, String model) {      //2  "Toyota", "Corolla"
        super(marka);                           //3
        System.out.println("Otomobil modeli: " + model); //6
    }
}

/*
public static void main(String[] args) {
        Otomobil oto = new Otomobil("Toyota", "Corolla");  //1
    }

    Arac markası: " Toyota
    "Otomobil modeli: " Corolla
 */