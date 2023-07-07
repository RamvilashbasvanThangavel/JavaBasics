package day02Object;

public class UseMultiple {
	public static void main(String[] args) {
		Multiple m = new Multiple();
		m.num1 = 10;
		m.num2 = 20;
		System.out.println(m.multiple1());
		System.out.println(m.multiple2(2, 4));
		m.multiple3();
		m.multiple4(4, 5);

	}
}