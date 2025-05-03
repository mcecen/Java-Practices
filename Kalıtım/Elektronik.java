package Kalıtım2;

class Elektronik {
    Elektronik() {
        System.out.println("Elektronik ürün oluşturuldu");
    }
}

class Telefon extends Elektronik {
    Telefon() {
        System.out.println("Telefon üretildi");
    }
}

class Bilgisayar extends Elektronik {
    Bilgisayar() {
        System.out.println("Bilgisayar üretildi");
    }
}
/*
        Elektronik e1 = new Telefon();
        Elektronik e2 = new Bilgisayar();
        Telefon t1 = new Telefon();
        Bilgisayar b1 = new Bilgisayar();

        Elektronik[] a = [new Telefon, new Bilgisayar, new Elektronik]


 */