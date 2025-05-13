package PracticeMe;

public class ConsOrnek {

    String beden="Beden Atanmadı";
    int boy;
    int en;
    String renk="Renk Atanmadı";

    public static void main(String[] args) {

        ConsOrnek obj1 = new ConsOrnek();

        ConsOrnek obj2 = new ConsOrnek("m",5,4,"kırmızı");

        ConsOrnek obj3 = new ConsOrnek("L",10);

        System.out.println("obj1 " + obj1);

        System.out.println("obj2 " + obj2);

        System.out.println("obj3 " + obj3);

    }

    ConsOrnek(){
        System.out.println("merhaba");
    }

    ConsOrnek(String beden,int boy,int en,String renk)
    {

        this();

        this.beden=beden;
        this.boy=boy;
        this.en=en;
        this.renk=renk;

    }

    ConsOrnek(String beden,int boy)
    {
        this.beden=beden;
        this.boy=boy;
    }

    @Override
    public String toString() {
        return "ConsOrnek{" +
                "beden='" + beden + '\'' +
                ", boy=" + boy +
                ", en=" + en +
                ", renk='" + renk + '\'' +
                '}';
    }
}