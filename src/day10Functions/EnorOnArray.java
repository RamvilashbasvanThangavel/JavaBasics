package day10Functions;

public class EnorOnArray {
	public void en (int[] num) {
		for(int i = 0;i<=num.length-1;i++) {
			if(num[i]%2==0) {
				System.out.println(num[i]+" is Even");
			}
			else {
				System.out.println(num[i]+" is Odd");
			}
		}
	}

}
