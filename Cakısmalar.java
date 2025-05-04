interface A1 {
	public void hesapla();
}

interface A2 {
	public void hesapla(int d);
}

interface A3 {
	public int hesapla();
}

class Cakısmalar implements A1, A2 {

	@Override
	public void hesapla() {
		System.out.println("�ak��malar.hesapla");

	}

	@Override
	public void hesapla(final int d) {
		System.out.println("�ak��malar.hesapla" + d);

	}
}

/* d�n�� tiplerine g�re ay�rt edilmez.

	class S2 implements A1,A3{

		@Override
		public int hesapla() {
			// TODO Auto-generated method stub
			return 0;
		}
		
	}
*/