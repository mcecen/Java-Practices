package methodlar;

public class this_ornek {
	String ad;
	public void degistir(String ad){
		this.ad=ad;
	}
	public static void main(String[] args) {
		this_ornek t = new this_ornek();
		t.degistir("Mehmet");
		System.out.println(t.ad);

	}

}
