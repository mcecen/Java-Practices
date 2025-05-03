package Kalıtım2;

class Insan {
    void tanit() {          //3
        System.out.println("Ben bir insanım."); //4
        this.meslek(); //5

    }

    void meslek() {     //6
        System.out.println("Mesleğim mühendis."); //7
    }
}

/*
        Insan ali = new Insan(); //1
        ali.tanit(); //2

        Ben bir insanım.
        Mesleğim mühendis.
 */