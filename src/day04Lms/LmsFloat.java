package day04Lms;

public class LmsFloat {
	public static void main(String[] args) {
		float a = Float.parseFloat(args[0]);
		float b = Float.parseFloat(args[1]);
		float c = Float.parseFloat(args[2]);
		float d = Float.parseFloat(args[3]);
		float add = a + b + c + d;
		float sub = a - b - c - d;
		float multiple = a * b * c * d;
		System.out.println("Addition :" + add + "\n" + "Subraction :" + sub + "\n" + "Multiplication :" + multiple);
	}

}
