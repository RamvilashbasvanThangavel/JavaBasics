package day04Lms;

public class LmsInt {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		int d = a + b + c;
		int e = a - b - c;
		int f = a * b * c;
		System.out.println("Addition :" + d + "\n" + "subraction :" + e + "\n" + "Multiplication :" + f);
	}

}
