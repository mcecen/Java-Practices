package methodlar;

public class Tarih {

	int gun;
	public void GunEnkle(int gun){
		this.gun+=gun;
	}
	public void Ekran() {
		System.out.println("Gun = "+ gun);
	}
	public static void main(String[] args) {
		Tarih t = new Tarih();
		t.GunEnkle(2);
		t.GunEnkle(3);
		t.Ekran();

	}

}
