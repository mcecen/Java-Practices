public class asiri_yukleme {
	public int toplamaYap(int a, int b){
		int sonuc=a+b;
		System.out.println("sonuc-1="+sonuc);
		return sonuc;
	}
	public static void toplamaYap(int a, double b){
		double sonuc=a*b;
		System.out.println("sonu-2="+sonuc);
	}
	public double toplamaYap(double a, int b){
		double sonuc=a+b;
		System.out.println("sonuc-3="+sonuc);
		return sonuc;
	}
	public static void main(String[] args) {
		asiri_yukleme mod2= new asiri_yukleme();
		mod2.toplamaYap(3, 4);
		asiri_yukleme.toplamaYap(3, 5.5);
		mod2.toplamaYap(6.2, 4);
	}

}
