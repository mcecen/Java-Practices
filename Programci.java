package Polimorfizm;

public class Programci extends Calisan {
	public Programci() { // yapýlandýrýcý
		pozisyon = "Programci";
	}

	@Override
	public void calis() { // iptal etme (override)
		System.out.println(pozisyon + " Calisiyor");
	}
}
