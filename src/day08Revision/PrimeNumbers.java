package day08Revision;

public class PrimeNumbers {
	public static void main(String[] args) {
		int value = 10;
		boolean prime = true;
		for (int i = 2; i <= value; i++) {
			if (value % i == 0) {
				prime = false;
			}
		}
		if (prime == true) {
			System.out.println("prime");
		} else {
			System.out.println("NotPrime");
		}
	}
}
