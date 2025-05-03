package Kalıtım2;

class Kullanici {
    String isim;

    Kullanici(String isim) {    //6
        this.isim = isim; //7
        System.out.println("Kullanici constructor: " + isim); //8
    }

    void girisYap() {
        System.out.println(isim + " sisteme giriş yaptı."); //18
    }
}
class Admin extends Kullanici {
    int yetkiSeviyesi;

    Admin(String isim, int yetkiSeviyesi) {     //4
        super(isim); //5
        this.yetkiSeviyesi = yetkiSeviyesi; //9
        System.out.println("Admin constructor, yetki seviyesi: " + yetkiSeviyesi); //10
    }

    void girisYap() {   //16
        super.girisYap(); //17
        System.out.println("Admin olarak giriş yapıldı."); //19
    }
}

class SuperAdmin extends Admin {        //sa nesnesi burada ve burada arayacağız
    SuperAdmin(String isim) { //2       --> isim = Mustafa, yetkiseviyesi = 10
        super(isim, 10); //3
        System.out.println("SuperAdmin constructor"); //11
    }

    void girisYap() {       //13
        System.out.println("SuperAdmin özel giriş kontrolü."); //14
        super.girisYap(); //15
    }
}
/*
        SuperAdmin sa = new SuperAdmin("Mustafa"); //1
        sa.girisYap(); //12
        }}
 */