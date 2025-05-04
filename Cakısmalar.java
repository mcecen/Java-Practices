package Interface;

interface A1 {
	public void hesapla();
}

interface A2 {
	public void hesapla(int d);
}

interface A3 {
	public int hesapla();
}

class Cakýsmalar implements A1, A2 {

	@Override
	public void hesapla() {
		System.out.println("Çakýþmalar.hesapla");

	}

	@Override
	public void hesapla(final int d) {
		System.out.println("Çakýþmalar.hesapla" + d);

	}
}

/* dönüþ tiplerine göre ayýrt edilmez.

	class S2 implements A1,A3{

		@Override
		public int hesapla() {
			// TODO Auto-generated method stub
			return 0;
		}
		
	}
*/