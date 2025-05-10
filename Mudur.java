public class Mudur extends Calisan {

	public Mudur() { // yap�land�r�c�
		pozisyon = "Mudur";
	}

	@Override
	public void calis() { // iptal etme (override)
		System.out.println(pozisyon + " Calisiyor");
	}
}
