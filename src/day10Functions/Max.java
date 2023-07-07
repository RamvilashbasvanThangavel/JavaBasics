package day10Functions;

public class Max {
	public int val (int[] a) {
		int temp = a[0];
		for(int i = 0;i<= a.length-1;i++) {
		if(a[i]>temp) {
			temp = a[i];
		}
	}
	return temp;
}
}


