public class dizilerde_method {
	public static void main(String[] args) {
		String dizi[]={"Mehmet","Alihan","Salih Can"};
		for (int i=0,k=0;i<dizi.length;i++,k++){		
			yazdir(dizi[i],k);
		}
	}
		

	static void yazdir(String dizi, int k) {
		System.out.printf("%d.ki�i = %s\n",k+1,dizi);
	}

}
