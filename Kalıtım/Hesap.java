package Kalıtım2;

class Hesap {  //nesneyi buradan arayacağız
    double bakiye = 1000;

    void goster() { //7     //4
        System.out.println("Hesap bakiyesi: " + bakiye); //8
    }

    static void sistemMesaji() {
        System.out.println("Hesap sistemine hoş geldiniz.");
    }
}

class VadeliHesap extends Hesap { //h nesnesi buradan oluşacak
    double faiz = 0.10;

    @Override
    void goster() { //5
        super.goster(); //6
        System.out.println("Faiz oranı: " + faiz); //9
    }

    static void sistemMesaji() {
        System.out.println("Vadeli hesap sistemine giriş.");
    }
}

/*

        public static void main(String[] args) { //1

        Hesap h = new VadeliHesap(); //2
        h.goster(); //3
        h.sistemMesaji(); //10

        System.out.println("-------------");

        VadeliHesap v = new VadeliHesap();
        v.sistemMesaji();


        }
 */