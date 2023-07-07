package day03StringMethods;

public class StringSplit {
	public static void main(String[] args) {
		String word = "My Name Is Tamil Arasan";
		String[] a = word.split("\\s+");
		System.out.println(a.length);
		System.out.println(a[0]+"\n"+a[1]+"\n"+a[2]+"\n"+a[3]+"\n"+a[4]);
		

	}

}
