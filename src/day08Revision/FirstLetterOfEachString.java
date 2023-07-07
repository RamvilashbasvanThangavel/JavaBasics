package day08Revision;

public class FirstLetterOfEachString {
	public static void main(String[] args) {
		String[] name = { "Ram", "Vilash", "Arun", "Muthu", "Shyamala" };
		for (int i = 0; i <= name.length - 1; i++) {
			System.out.println("First Letter of each name : " + name[i].charAt(0));
		}
		for (int i = 0; i <= name.length - 1; i++) {
			System.out.println("Last Letter of each name : " + name[i].charAt(name[i].length() - 1));
		}
	}
}
