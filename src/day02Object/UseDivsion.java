package day02Object;

public class UseDivsion {
	public static void main(String[] args) {
		Division d = new Division();
		d.a1 = 200;
		d.a2 = 2;
		System.out.println(d.div1());
		System.out.println(d.div2(10, 2));
		d.div3();
		d.div4(16, 4);

	}
}
