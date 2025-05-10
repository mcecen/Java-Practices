package methodlar;

public class Tost {

	int sayi;
	String malzeme;
	public Tost() { //yap�land�r�c�dan ba�ka bir yap�land�r�c�y� �a��r�rken her zmana ilk sat�rda olmal�
		this(5);
		//this(5 ,"sucuklu");  Bir yap�land�r� i�ince birden fazla yap�land�r�c� this kullan�lmaz.
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
