public class ozyineleme {
	static int fac(int sayi) {
		if(sayi==1)
			return 1;
		else
			return(sayi*fac(sayi-1));
	}

	static int fib(int sayi){
		if(sayi<=1)
			return sayi;
		else
			return fib(sayi-1)+fib(sayi-2);
	}
		
	public static void main(String[] arg) {
		System.out.println(fac(5)+" "+fib(8));
	}
}
