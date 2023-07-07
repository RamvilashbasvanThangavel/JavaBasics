package day06ForLoop1;

public class Palindrome {
	public static void main(String[] args) {

		String name = "mom";
		String temp = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			temp = temp + name.charAt(i);

		}
		if (temp.equals(name)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Non Palindrome");

		}

	}
}