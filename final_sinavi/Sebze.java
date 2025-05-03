package final_sinavi;

public class Sebze extends Yiyecek {

	public Sebze(final String isim, final String renk) {
		super(isim, renk, "Toprak");
	}

	@Override
	public String YiyecekTuru() {
		return "Sebze";
	}

}
