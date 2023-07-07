package day11Revision;

public class Pen {
	String brand;
	int price;
	int discount;

	public int findMax(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	public int findhigh(int[] value) {
		int max = value[0];
		for (int i = 0; i < value.length; i++) {
			if (max < value[i]) {
				max = value[i];
			}
		}
		return max;
	}
	
	public Pen findMaxBarnd(Pen[] a) {
		Pen max = a[0];
		for(int i = 0;i<a.length;i++) {
			if(max.price <= a[i].price) {
				max=a[i];
			}
		}
		return max;
	}

}
