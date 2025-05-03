package Kalıtım2;

class Arac2 {
    Arac2() {

    }
    void bilgi() {
        System.out.println("Bu bir araçtır.");
    }
}
class Bisiklet extends Arac2 {
    Bisiklet() {
        //super()
    }
    void bilgi() {
        super.bilgi();
        System.out.println("Bu bir bisiklettir.");
    }
}
/*
        public static void main(String[] args) {

        Bisiklet b = new Bisiklet();
        b.bilgi();

 */