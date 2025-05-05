package Polimorfizm;

public class Mudur extends Calisan {

	public Mudur() { // yapýlandýrýcý
		pozisyon = "Mudur";
	}

	@Override
	public void calis() { // iptal etme (override)
		System.out.println(pozisyon + " Calisiyor");
	}
}
