package day11Revision;

public class Student {
	String name;
	int e;
	int t;
	int m;
	int total;

	public int findTotal(int a) {
		return e + t + m + a;
	}

	public void display() {
		System.out.println(name + " - " + t + "+" + e + "+" + m + "=" + total);
	}
}
