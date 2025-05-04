package Interface;

class A extends Soyut1 implements Arayuz1, Arayuz2 {

	@Override
	public void a1() {
		System.out.println("A.a2()");

	}

	@Override
	public void a2() {
		System.out.println("A.a1()");

	}

	@Override
	public void s1() {
		System.out.println("A.s1()");

	}

}

interface Arayuz1 {
	public void a1();
}

interface Arayuz2 {
	public void a2();
}

public class GenelBakýs {

	public static void main(final String[] args) {
		final Soyut1 soyut_1 = new A();
		final Arayuz1 arayuz_1 = (Arayuz1) soyut_1;
		final Arayuz2 arayus_2 = (Arayuz2) soyut_1;

		soyut_1.s1();
		// soyut_1.a1();
		// soyut_1.a2();

		arayuz_1.a1();
	}

}

abstract class Soyut1 {
	public abstract void s1();
}
