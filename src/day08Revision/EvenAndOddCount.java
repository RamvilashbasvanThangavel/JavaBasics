package day08Revision;

public class EvenAndOddCount {
	public static void main(String[] args) {
		int[] numbers = {-13,26,54,0,87,-333,148};
		int oc = 0;
		int ec = 0;
		for(int i = 0;i<=numbers.length-1;i++) {
			if(numbers[i]%2==0) {
				ec++;
				System.out.println("Even number : "+numbers[i]);
			}
			else {
				oc++;
			}
	}
		System.out.println("Odd Count : "+oc);
		System.out.println("Even count : "+ec);
	}
	}

