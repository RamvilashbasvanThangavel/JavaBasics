package day06ForLoop1;

public class ForCheckPrimenumberOrNot {
	public static void main(String[] args) {
		int a = 10;
		boolean prime = true;
		for (int i = 2; i <=a; i++) {
			if (a % 2 == 0) {
				prime = false;
			}
		}
		if(prime==true) {
			System.out.println("is prime number");
		}
		else {
			System.out.println("is not prime number");
		}
	}

}
