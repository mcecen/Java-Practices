package calisma;

public class try_catch2 {
	public static void main(final String[] args) {
		int a, d;

		try {
			d = 0;
			a = 42 / 0;
			System.out.println("bla bla"); // hata veren yerden sonra catch e
											// atlar ve geri d�nmez.
		} catch (final ArithmeticException e) {
			System.out.println("biliydim b�yle olaca��n�");
		}

		System.out.println("hata sonras� sence yazacak m� ?");
	}
}
