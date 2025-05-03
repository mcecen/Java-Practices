package final_sinavi;

public class main {

	public static void main(final String[] args) {
		final Sebze s = new Sebze("Lavaha", "Kýrmýzý");
		final Meyve m = new Meyve("Elma", "Yeþil");
		final String syer = s.getYer();
		final String myer = m.getYer();

		System.out.println("Meyvenin yetiþtiði yer " + myer
				+ ", Sebzenin yetiþtiði yer " + syer + "dir.");

		YiyecekYazdir(m);
	}

	public static void YiyecekYazdir(final Yiyecek y) {
		System.out.println(y.getIsim() + " bir " + y.YiyecekTuru() + "dir.");
	}

}
