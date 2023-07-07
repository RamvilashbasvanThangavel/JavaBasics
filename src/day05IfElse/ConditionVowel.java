package day05IfElse;

public class ConditionVowel {
	public static void main(String[] args) {
		String name = "kvn";
		if (name.contains("a") || name.contains("e") || name.contains("i") || name.contains("o")
				|| name.contains("u")) {
			System.out.println("It contains Vowels");
		} else {
			System.out.println("It contains No Vowels");
		}
	}

}
