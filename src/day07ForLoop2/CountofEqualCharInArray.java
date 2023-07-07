package day07ForLoop2;

public class CountofEqualCharInArray {
	public static void main(String[] args) {
		String[] name = { "Raja", "kaja", "Ravi", "Ramu", "kavi", "Deva","sam","muthu"};
		int c = 0;  //count of first letter R
		int d = 0;  // count of first letter not starting with R
		for (int i = 0; i <= name.length - 1; i++) {
			if (name[i].startsWith("R"))   { 
				c++;
			} 
			else {
				d++;
			}
		}
		System.out.println("count of first letter R : "+c);
		System.out.println("count of First letter not start with R : "+d);
	}
}
