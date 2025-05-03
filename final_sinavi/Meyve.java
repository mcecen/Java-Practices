package final_sinavi;

public class Meyve extends Yiyecek {

	public Meyve(final String isim, final String renk) {
		super(isim, renk, "A�a�");
	}

	@Override
	public String YiyecekTuru() {
		return "Meyve";
	}
}
