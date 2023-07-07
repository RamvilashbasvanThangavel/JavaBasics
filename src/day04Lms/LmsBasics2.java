package day04Lms;

public class LmsBasics2 {
	public static void main(String[] args) {
		String a = args[0];
		String b = args[1];
		String c = args[2];
		String d = args[3];
		String e = args[4];
		String a1 = a.toUpperCase();
		String b1 = b.toUpperCase();
		String c1 = c.substring(2);
		String d1 = d.toLowerCase();
		String e1 = a.concat(e);
		System.out.println(a1 + "\n" + b1 + "\n" + c1 + "\n" + d1 + "\n" + e1);

	}

}
