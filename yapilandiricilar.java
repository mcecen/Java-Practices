package methodlar;
/* 		s�n�ftan bir nesne olu�turuldu�unda derleyici otomatik olarak bir yap�landr�c� metod �a��r�r.
 * bu method her oluturlan nesne i�in �a��r��r
 * 
 *  	yap�land��c� metot nesnenin ilk olu�turuldupunda olmas� gereken de�erleri kullanaca��n�
 *  metotlar� belirler.
 *  
 *  	yap�land�r�c� metotlar s�n�f ad� ile ayn� ismi ta��mak zorunda
 *  	
 *  	yap�land�r�c� metotlar harhangi bir geri d�n�� parametresi i�ermez
 *  
 *  	yap�land�r�c� metotlar  a��r� y�klenebilir(overload) !!
 *  
 *  	her s�n�f i�in bir varsay�lan yap�land�r�c� mevcuttur bu yap�lar parametresizdir.*/
class Yapicilar{
	int deger1;
	public Yapicilar(){
		deger1=5;
	}
	public Yapicilar(int sayi){
		deger1=sayi;
	}
}

public class yapilandiricilar {
	public static void main(String[] args) {
		Yapicilar nesne = new Yapicilar();
		System.out.println(nesne.deger1);
	}
	
}
