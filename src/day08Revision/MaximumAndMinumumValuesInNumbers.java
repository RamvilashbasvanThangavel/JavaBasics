package day08Revision;

public class MaximumAndMinumumValuesInNumbers {
	public static void main(String[] args) {
	int[] num = {20,2,5,6,4,8,10,100,15,30} ;
	int max = num[0];     // Maximum value Temp = max;
	int min = num[0];    //Minumum value Temp = min;
	for(int i = 0;i<num.length;i++) {
		if(max<num[i]) {
			max = num[i];
		}
		else if(min>num[i]) {
			min = num[i];
	}
	}
	System.out.println("Maximum Value : "+max);
	System.out.println("Minumum Value : "+min);
}
}
