package day09ForLoop3OfObject;

public class UseMarker {
	public static void main(String[] args) {

		Marker marker1 = new Marker();
		marker1.brand = "Reynolds";
		marker1.price = 10;
		marker1.colour = "Black";
		marker1.nozzelSize = 1.5f;

		Marker marker2 = new Marker();
		marker2.brand = "Reynolds";
		marker2.price = 15;
		marker2.colour = "Red";
		marker2.nozzelSize = 2.5f;

		Marker marker3 = new Marker();
		marker3.brand = "Reynolds";
		marker3.price = 10;
		marker3.colour = "Blue";
		marker3.nozzelSize = 1.5f;

		Marker[] marker = { marker1, marker2, marker3 };
		for (int i = 0; i <= marker.length - 1; i++) {
			System.out.println(marker[i].price + "," + marker[i].brand + "," + marker[i].colour);
		}
		int totalprice = 0;
		int count = 0;
		int average = 1;
		for (int i = 0; i <= marker.length - 1; i++) {
			totalprice = marker[i].price + totalprice;
			count = count + 1;
			average = totalprice / count;

		}
		System.out.println(totalprice);
		System.out.println(average);

	}
}
