package Polimorfizm;

public class Programci extends Calisan {
	public Programci() { // yap�land�r�c�
		pozisyon = "Programci";
	}

	@Override
	public void calis() { // iptal etme (override)
		System.out.println(pozisyon + " Calisiyor");
	}
}
