package day07ForLoop2;

public class CreationOfFloatArryUsingIndividual {
	public static void main(String[] args) {
		float[] height = new float[9];          //syntax to store the object format in Individual Initialization.
		height[0] = 159.56f;
		height[1] = 165.26f;
		height[2] = 158.35f;
		height[3] = 172.49f;
		height[4] = 152.56f;
		height[5] = 153.89f;
		height[6] = 159.15f;
		height[7] = 157.68f;
		height[8] = 173.77f;
		for (int i = 0; i < 9; i++) {         // i < 9 indicates the condition value of the object to be done as per the index position
			System.out.println(height[i]);
		}

	}

}
