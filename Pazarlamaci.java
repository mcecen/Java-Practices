package Polimorfizm;

public class Pazarlamaci extends Calisan {
	public Pazarlamaci() { // yapýlandýrýcý
		pozisyon = "Pazarlamaci";
	}

	@Override
	public void calis() { // iptal etme (override)
		System.out.println(pozisyon + " Calisiyor");
	}
}