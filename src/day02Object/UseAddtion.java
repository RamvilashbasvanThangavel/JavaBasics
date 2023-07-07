package day02Object;

public class UseAddtion {
	public static void main(String[] args) {
		Addtion a = new Addtion();
		a.num1 = 10;
		a.num2 = 20;
		System.out.println(a.add1());
		System.out.println(a.add2(100, 200));
		a.add3();
		a.add4(10, 40);
	}
}
