package methodlar;

public class Tost {

	int sayi;
	String malzeme;
	public Tost() { //yapýlandýrýcýdan baþka bir yapýlandýrýcýyý çaðýrýrken her zmana ilk satýrda olmalý
		this(5);
		//this(5 ,"sucuklu");  Bir yapýlandýrý içince birden fazla yapýlandýrýcý this kullanýlmaz.
	}
	public Tost(int sayi) {
		this(sayi,"sucuklu");
		this.sayi=sayi;
		System.out.println("bla bla");
	}
	public Tost(int sayi, String malzeme) {
		this.sayi=sayi;
		this.malzeme=malzeme;
		System.out.println("Tost(int Sayi, String malzeme");
	}
	public void siparisGoster(){
		//this(5,"kasarli");
		System.out.println("Tost sayisi" + sayi +"malzeme "+ malzeme);
	}
	public static void main(String[] args) {
		Tost t = new Tost();
		t.siparisGoster();

	}

}
