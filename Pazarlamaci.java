public class Pazarlamaci extends Calisan {
	public Pazarlamaci() { // yap�land�r�c�
		pozisyon = "Pazarlamaci";
	}

	@Override
	public void calis() { // iptal etme (override)
		System.out.println(pozisyon + " Calisiyor");
	}
}