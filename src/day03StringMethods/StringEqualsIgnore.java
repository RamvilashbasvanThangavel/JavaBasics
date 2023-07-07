package day03StringMethods;

public class StringEqualsIgnore {
	public static void main(String[] args) {
		String a = "RamvilashBasvan";
		String b = "ramvilashbasvan";
		boolean c = a.equalsIgnoreCase(b);
		System.out.println(c);
	}

}
