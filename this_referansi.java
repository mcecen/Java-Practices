package methodlar;


class Ogrenci{
	private int no;
	private String isim;
	public Ogrenci(int no, String isim){
		this.no=no;
		this.isim=isim;
	}
}

class Ogrenciler{
	private int no;
	private String isim;
	public Ogrenciler(int a, String b){
		no=a;
		isim=b;
	}
}

public class this_referansi {
/* Her s�n�fta bulunan ve her nesnenin kullanabildi�i bir referanst�r 
 * S�n�f tanmlas� yap�ld���n�nda Java otomatik olarak arka planda olu�turur.
 * Amac� nesnenin kendisini referans etmesi, b�ylece neslere ait global de�i�kenlere eri�ebiliriz. */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
