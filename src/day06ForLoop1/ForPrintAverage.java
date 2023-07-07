package day06ForLoop1;

public class ForPrintAverage {
	public static void main(String[] args) {
		int a = 5;
		int total = 0;
		int count = 0;
		for (int i = 1;i<=a; i++) {
			total = total+i;
			count = count+1;	
		}
		System.out.println(total/count);
	}

}
