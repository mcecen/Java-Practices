package final_sinavi;

public class main {

	public static void main(final String[] args) {
		final Sebze s = new Sebze("Lavaha", "K�rm�z�");
		final Meyve m = new Meyve("Elma", "Ye�il");
		final String syer = s.getYer();
		final String myer = m.getYer();

		System.out.println("Meyvenin yeti�ti�i yer " + myer
				+ ", Sebzenin yeti�ti�i yer " + syer + "dir.");

		YiyecekYazdir(m);
	}

	public static void YiyecekYazdir(final Yiyecek y) {
		System.out.println(y.getIsim() + " bir " + y.YiyecekTuru() + "dir.");
	}

}
