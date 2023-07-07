package day07ForLoop2;

public class PrintEvenNumberOfArray {
	public static void main(String[] args) {
		int[] a = new int[6]; // int synatx type
		a[0] = 20;
		a[1] = 25;
		a[2] = 19;
		a[3] = 14;
		a[4] = 21;
		a[5] = 13;
		int c = 0, d = 0;
		for (int i = 0; i <= a.length - 1; i++) {
			if (a[i] % 2 == 0) {
				System.out.println("Even number : " + a[i]);
				c++;
			} else if (a[i] % 2 != 0) {
				System.out.println("Odd number : " + a[i]);
				d++;
			}
		}
		System.out.println("Even number count : " + c);
		System.out.println("Odd number count : " + d);
	}

}
