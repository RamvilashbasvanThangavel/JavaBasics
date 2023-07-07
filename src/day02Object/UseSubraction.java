package day02Object;

public class UseSubraction {
	public static void main(String[] args) {
		Subraction s = new Subraction();
		s.num1 = 500;
		s.num2 = 200;
		System.out.println(s.sub1());
		System.out.println(s.sub2(300, 200));
		s.sub3();
		s.sub4(40, 20);
	}
}