package day07ForLoop2;

public class creationOfFloatReverseIndividual {
	public static void main(String[] args) {
		float[] height = new float[8];
		height[0] = 159.56f;
		height[1] = 165.26f;
		height[2] = 158.35f;
		height[3] = 172.49f;
		height[4] = 152.56f;
		height[5] = 153.89f;
		height[6] = 159.15f;
		height[7] = 157.68f;
		for (int i = 7; i > 0; i--) {         // reverse oder of the Syntax.
			System.out.println(height[i]);
		}

	}
}
