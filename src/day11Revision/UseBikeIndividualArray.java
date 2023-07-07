package day11Revision;

public class UseBikeIndividualArray {

	public static void main(String[] args) {
		BikeIndividualArray b1 = new BikeIndividualArray();
		b1.brand = "Tvs";
		b1.model = "Jupiter";
		b1.price = 850000;
		b1.cc = 160;

		BikeIndividualArray b2 = new BikeIndividualArray();
		b2.brand = "Bajaji";
		b2.model = "Pulsar";
		b2.price = 120000;
		b2.cc = 210;

		BikeIndividualArray b3 = new BikeIndividualArray();
		b3.brand = "Honda";
		b3.model = "Dio";
		b3.price = 850000;
		b3.cc = 125;

		BikeIndividualArray[] bikes = new BikeIndividualArray[3];
		bikes[0] = b1;
		bikes[1] = b2;
		bikes[2] = b3;

		for (int i = 0; i < bikes.length; i++) {
			System.out.println(
					"1st Output = " + bikes[i].brand + "," + bikes[i].model + "," + bikes[i].price + "," + bikes[i].cc);
		}
		BikeIndividualArray temp = bikes[0];
		for (int i = 0; i < bikes.length; i++) {
			if (temp.price < bikes[i].price) {
				temp = bikes[i];
			}
		}
		System.out.println("2nd Output = " + temp.brand + "," + temp.model + "," + temp.cc + "," + temp.price);
	}
}
