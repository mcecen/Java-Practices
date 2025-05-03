package Kalıtım2;

class Personel {
    Personel() {
        System.out.println("Personel constructor'ı");
    }

    Personel(String departman) {
        System.out.println("Personel constructor (departmanlı): " + departman);
    }
}

class Muhendis extends Personel {
    Muhendis() {
        super("Mühendislik Departmanı");
        System.out.println("Muhendis constructor'ı");
    }
}

class BilgisayarMuhendisi extends Muhendis {
    BilgisayarMuhendisi(String isim) {
        super();
        System.out.println("BilgisayarMuhendisi constructor'ı: " + isim);
    }
}

class Yazilimci extends BilgisayarMuhendisi {
    Yazilimci() {
        super("Yazılımcı İsmi");
        System.out.println("Yazilimci constructor'ı");
    }
}
/*
        Personel p = new Yazilimci();

 */
