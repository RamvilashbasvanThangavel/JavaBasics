package day08Revision;

public class PalindromeForString {
	public static void main(String[] args) {
		//String[] word = {"madam","hello","dad","malayalam","tamil"};
		String word = "madam";
		String temp = "";
			for(int i=word.length()-1;i>=0;i--) {
				temp = temp + word.charAt(i);	
			}
			if(temp.equals(word)) {
				System.out.println("palindrome");
			}
		}
	}

