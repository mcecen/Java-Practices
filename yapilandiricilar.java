package methodlar;
/* 		sýnýftan bir nesne oluþturulduðunda derleyici otomatik olarak bir yapýlandrýcý metod çaðýrýr.
 * bu method her oluturlan nesne için çaðýrýýr
 * 
 *  	yapýlandýýcý metot nesnenin ilk oluþturuldupunda olmasý gereken deðerleri kullanacaðýný
 *  metotlarý belirler.
 *  
 *  	yapýlandýrýcý metotlar sýnýf adý ile ayný ismi taþýmak zorunda
 *  	
 *  	yapýlandýrýcý metotlar harhangi bir geri dönüþ parametresi içermez
 *  
 *  	yapýlandýrýcý metotlar  aþýrý yüklenebilir(overload) !!
 *  
 *  	her sýnýf için bir varsayýlan yapýlandýrýcý mevcuttur bu yapýlar parametresizdir.*/
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
