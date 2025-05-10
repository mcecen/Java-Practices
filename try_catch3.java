package calisma;

import java.util.Random;

public class try_catch3 {
	public static void main(final String[] args) {
		int a = 0, b = 0, c = 0;
		final Random r = new Random();

		for (int i = 0; i < 32000; i++) {
			try {
				b = r.nextInt();
				c = r.nextInt();
				a = 1234 / (b / c);
			} catch (final ArithmeticException e) {
				System.out.println("bla bla");
				a = 0;
			}
			System.out.println("a: " + a);
		}
	}
}
