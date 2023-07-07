package day05ElseIfLadder;

public class ConditionColourSignal {
	public static void main(String[] args) {
		String a = args[0].toLowerCase();
		if (a.contains("red")) {
			System.out.println("Stop");
	}
	    else if (a.contains("yellow")) {
	    	System.out.println("Ready");
		}
	    else if (a.contains("green")) {
	    	System.out.println("Go");
	    }
	    else {
	    	System.out.println("Invalid Inputs");
	    }
	}

}
