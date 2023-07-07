package day07ForLoop2;

public class PrintStringLengthMax {
	public static void main(String[] args) {
		String[] name = { "Brand", "Marker", "ClassRoom", "Mouse" };
		int a = name[0].length();
		String max = " ";
		for (int i = 0; i <= name.length - 1; i++) {
			if (name[i].length() > 3) {
				System.out.println(name[i]); // words more than 3 letters need to print syso.
			}
		}
		for (int i = 0; i <= name.length - 1; i++) {
			if (name[i].length() > a) {
				a = name[i].length(); // for finding largest word length
				max = name[i]; // for finding the largest word string
			}
		}
		System.out.println("largest word in length in the Array : " + a);
		System.out.println("largest word in the Array : " + max);
	}

}
