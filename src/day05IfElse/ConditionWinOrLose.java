package day05IfElse;

public class ConditionWinOrLose {
	public static void main(String[] args) {
		String toss = "tail";
		String a = "head";
		if (toss.equalsIgnoreCase(a)) {
			System.out.println("you win");
		} else {
			System.out.println("you lose");
		}
	}
}
