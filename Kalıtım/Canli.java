package Kalıtım2;

class Canli {
    Canli() {System.out.println("Canli constructor");}
}

class Hayvan extends Canli {
    Hayvan() {System.out.println("Hayvan constructor");}
}

class Kus extends Hayvan {
    Kus() {System.out.println("Kus constructor");}
}

/*
    public static void main(String[] args) {
    Kus serce = new Kus();
    }
 */