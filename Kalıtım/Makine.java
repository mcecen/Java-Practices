package Kalıtım2;

class Makine {
    Makine() {
        System.out.println("Makine başlatıldı.");
    }

    void calistir() {
        System.out.println("Makine çalışıyor.");
    }
}

class Araba extends Makine {
    Araba() {
        super();
        System.out.println("Araba üretildi.");
    }

    void calistir() {
        System.out.println("Araba motoru çalıştı.");
    }
}

class ElektrikliAraba extends Araba {
    ElektrikliAraba() {
        super();
        System.out.println("Elektrikli araba şarj edildi.");
    }

    void calistir() {
        super.calistir();
        System.out.println("Elektrik motoru sessiz çalışıyor.");
    }
}
/*
        Makine tesla = new ElektrikliAraba();
        tesla.calistir();
 */