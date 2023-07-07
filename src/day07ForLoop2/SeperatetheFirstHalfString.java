package day07ForLoop2;

public class SeperatetheFirstHalfString {
	public static void main(String[] args) {
		String[] name = { "Raju", "Ram", "Kavi", "Deva", "Hari", "mani" };
		for (int i = 0; i <= name.length / 2 - 1; i++) {
			System.out.println("First Half name : " + name[i]);
		}
		for (int i = name.length / 2 - 1; i >= 0; i--) {
			System.out.println("First Half name in Reverse : " + name[i]);
		}
		for (int i = name.length / 2; i <= name.length - 1; i++) {
			System.out.println("Second half name : " + name[i]);
		}
		for (int i = name.length - 1; i >= name.length / 2; i--) {
			System.out.println("Second half name in Reverse : " + name[i]);
		}
	}
}
