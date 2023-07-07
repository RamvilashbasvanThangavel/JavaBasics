package day08Revision;

public class CapitalLetterStringToPrint {
	public static void main(String[] args) {
		String[] data = { "Ram", "RAJU", "RAGU", "Ravi" };
		for (int i = 0; i < data.length; i++) {
			if (data[i].equals(data[i].toUpperCase())) {
				System.out.println(data[i]);
			}

		}

	}
}
