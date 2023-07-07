package day07ForLoop2;

public class PrintVowels {
	public static void main(String[] args) {
		String[] name = { "Brand", "Marker", "ClassRoom", "Mouse","Rm","KD","Dad","Apple" };
		int c = 0;
		for (int i = 0; i <= name.length - 1; i++) {
			if (name[i].contains("a") || name[i].contains("e") ||name[i].contains("i") 
					||name[i].contains("o") ||name[i].contains("u") ||
					name[i].contains("A") || name[i].contains("E") ||name[i].contains("I") 
					||name[i].contains("O") ||name[i].contains("U")) {
				System.out.println(name[i]);
			}
		}
	}

}
