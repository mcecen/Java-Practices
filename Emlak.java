package collections;

public class Emlak {
	
	private String tur;
	private String il;
	private int oda;
	private double fiyat;
	public Emlak(){
		
	}
	public Emlak(String tur,String il,int oda,double fiyat){
		this.tur=tur;
		this.il=il;
		this.oda=oda;
		this.fiyat=fiyat;
		
	}
	public void setTur(String tur) {
		this.tur = tur;
	}
	public String getTur() {
		return tur;
	}
	public void setIl(String il) {
		this.il = il;
	}
	public String getIl() {
		return il;
	}
	public void setOda(int oda) {
		this.oda = oda;
	}
	public int getOda() {
		return oda;
	}
	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}
	public double getFiyat() {
		return fiyat;
	}
	
 
}