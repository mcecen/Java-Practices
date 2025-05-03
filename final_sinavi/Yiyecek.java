package final_sinavi;

abstract class Yiyecek {
	private String isim;
	private String renk;
	private String yer;

	public Yiyecek(final String isim, final String renk, final String yer) {
		Set(isim, renk, yer);
	}

	public String getIsim() {
		return isim;
	}

	public String getRenk() {
		return renk;
	}

	public String getYer() {
		return yer;
	}

	public void Set(final String isim, final String renk) {
		this.isim = isim;
		this.renk = renk;
	}

	public void Set(final String isim, final String renk, final String yer) {
		Set(isim, renk);
		this.yer = yer;
	}

	public String YiyecekTuru() {
		return "belirsiz";
	}

}
