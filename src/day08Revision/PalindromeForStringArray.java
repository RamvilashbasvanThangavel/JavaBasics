package day08Revision;

public class PalindromeForStringArray {
	public static void main(String[] args) {
		String[] word = {"Madam","Ravi","Mom"};
		for(int i = 0;i<word.length;i++) {
			String reverse = "";
			for(int j = word[i].length()-1;j>=0;j--) {
				reverse = reverse +word[i].charAt(j);
			}
			if(word[i].equalsIgnoreCase(reverse)) {
				System.out.println(word[i]+" : palindrome");
			}
			else {
				System.out.println(word[i]+" : is not palindrome");
			}
		}
	}

}
