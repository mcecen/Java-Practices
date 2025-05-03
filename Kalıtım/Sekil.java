package Kalıtım2;

class Sekil {                   //s1 nesnesini buradan arayacağız
    void ciz() {    //2
        System.out.println("Şekil çiziliyor...");
        //s2 nesnesini burdan arayacağız //7
    }
}

class Daire extends Sekil {             //s1 nesnesi burada
    void ciz() { //3
        System.out.println("Daire çiziliyor."); //4
    }
}

class Kare extends Sekil {          //s2 nesnesi burada
    void ciz() {                    //8
        System.out.println("Kare çiziliyor."); //9
    }
}

/*
        Sekil s1 = new Daire(); //1
        Sekil s2 = new Kare(); //5
        s1.ciz();
        s2.ciz(); //6


        Daire çiziliyor.
        Kare çiziliyor.

 */