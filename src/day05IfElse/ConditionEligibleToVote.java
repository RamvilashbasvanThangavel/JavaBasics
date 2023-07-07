package day05IfElse;

public class ConditionEligibleToVote {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		if (a >= 18) {
			System.out.println("Is Eligible to Vote");
		} else {
			System.out.println("Is Not Eligible to vote");
		}
	}

}
