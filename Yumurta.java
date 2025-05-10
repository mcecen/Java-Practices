package methodlar;

public class Yumurta {

	int toplam_yumurta=0;
	Yumurta SepeteKoy(){
		toplam_yumurta++;
		return this;
	}
	void goster(){
		System.out.println("toplam yumurta = "+toplam_yumurta);
	}
	public static void main(String[] args) {
		Yumurta y = new Yumurta();
		y.SepeteKoy().SepeteKoy().SepeteKoy().goster();
		
	}

}
