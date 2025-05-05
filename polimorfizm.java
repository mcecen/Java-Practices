package notPolimorfizm;

//http://www.turhaltemizer.com/2008/02/java-polimorfizm.html
public class polimorfizm {

	public static void hazirlanSinavVar(final Object[] o) {
		for (int i = 0; i < o.length; i++)
			if (o[i] instanceof Universite) {
				final Universite uni = (Universite) o[i];
				uni.dersCalis();
			} else if (o[i] instanceof Ogrenci) {
				final Ogrenci og = (Ogrenci) o[i];
				og.dersCalis();
			} else if (o[i] instanceof Akademisyen) {
				final Akademisyen ak = (Akademisyen) o[i];
				ak.dersCalis();
			}
	}

	public static void main(final String args[]) {
		final Object[] o = new Object[3];
		o[0] = new Universite();
		o[1] = new Ogrenci();
		o[2] = new Akademisyen();
		hazirlanSinavVar(o);
	}
}
