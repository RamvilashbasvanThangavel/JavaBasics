package day05ElseIfLadder;

public class CondtionBasicselseif {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		if (a>0) {
			System.out.println("positive");
		}
		else if (a<0) {
			System.out.println("Negative");
		}
		else {
			System.out.println("Neutral");
		}
	}

}
