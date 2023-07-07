package day07ForLoop2;

public class BasicArryStringVariableReverse {
	public static void main(String[] args) {
		String[] name = { "Ram", "kavi", "deav", "Surya", "rasu", "deepa", "leena" };
		for (int i = name.length - 1; i >= 0; i--) {    //indicates the Syntax running reverse
			System.out.println(name[i]);    
		}
	}

}
