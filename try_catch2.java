package calisma;

public class try_catch2 {
	public static void main(final String[] args) {
		int a, d;

		try {
			d = 0;
			a = 42 / 0;
			System.out.println("bla bla"); // hata veren yerden sonra catch e
											// atlar ve geri dönmez.
		} catch (final ArithmeticException e) {
			System.out.println("biliydim böyle olacaðýný");
		}

		System.out.println("hata sonrasý sence yazacak mý ?");
	}
}
