package day06ForLoop1;

public class ForPrintEg5charAT {
	public static void main(String[] args) {
		String a = "java";
		String temp = "";
		for (int i = 0; i <= a.length() - 1; i++) {
			temp = temp+a.charAt(i);
			System.out.println(temp);
		}
	}

}
