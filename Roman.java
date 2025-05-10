package overiding;

public class Roman extends Kitap {
	public static void main(final String[] args) {
		final Roman r = new Roman();
		final int sayfa_sayisi = r.sayfaSayisi();
		final double fiyat = r.fiyatOgren();
		final String yazar = r.yazarIsmi();
		System.out.println(sayfa_sayisi);
		System.out.println(fiyat);
		System.out.println(yazar);
	}

	@Override
	public int sayfaSayisi() {
		return 0;
	}
}
