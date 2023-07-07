package day07ForLoop2;

public class PrintCharAt {
	public static void main(String[] args) {
		String[] language = { "Tamil", "English", "Hindi", "Malayalam", "Telugu" };
		for (int i = 0; i <= language.length - 1; i++) {                                   // language[0]- indicates the first value in the array.
			System.out.println("first Letter of The Value :" + language[i].charAt(0));    // language[i]-indicates the first value to last value.
		}                                                                                 // charAt(0)- indicates the first character in the values.
		for (int i = 0; i <= language.length - 1; i++) {
			System.out.println("Second Letter of The Value :" + language[i].charAt(1));   // charAt(1)- indicates the second character in the values.
		}
		for (int i = 0; i <= language.length - 1; i++) {
			System.out.println("Third Letter of The Value :" + language[i].charAt(2));    // charAt(2)- indicates the third character in the values.
		}
		for (int i = 0; i <= language.length - 1; i++) {
			System.out.println("Fourth Letter of The Value :" + language[i].charAt(3));   // charAt(3)- indicates the fourth character in the values.
		}
		for (int i = 0; i <= language.length - 1; i++) {
			System.out.println("Last Letter of The Value :" + language[i].charAt(language[i].length() - 1));
		}                                                                // charAt(language[i].length - indicates the last letter of each values by using -1.
	}

}
