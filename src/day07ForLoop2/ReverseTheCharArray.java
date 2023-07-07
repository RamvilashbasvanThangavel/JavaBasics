package day07ForLoop2;

public class ReverseTheCharArray {
	public static void main(String[] args) {
		String word = "java";
		char[] c = word.toCharArray();
		for (int i = c.length - 1; i >= 0; i--) {
			System.out.println(c[i]);
		}
	}

}
