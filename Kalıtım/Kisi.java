package Kalıtım2;

class Kisi {
    String isim;

    Kisi(String isim) {
        this.isim = isim;
        System.out.println("Kisi oluşturuldu: " + isim);
    }
}

class Ogrenci extends Kisi {
    String okul;

    Ogrenci(String isim, String okul) {
        super(isim);
        this.okul = okul;
        System.out.println("Öğrenci okulu: " + okul);
    }
}

/*
        Kisi k1 = new Ogrenci("Ayşe", "İstanbul Üniversitesi");
        Kisi k2 = new Ogrenci("Ali", "Ankara Üniversitesi");
 */