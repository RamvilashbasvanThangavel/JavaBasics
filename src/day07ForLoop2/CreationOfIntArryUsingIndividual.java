package day07ForLoop2;

public class CreationOfIntArryUsingIndividual {
	public static void main(String[] args) {
		int[] mark = new int[5];         // Datatype[] variablename = new Datatype[Size]; eg - creation of Array
		mark[0] = 98;
		mark[1] = 96;
		mark[2] = 78;
		mark[3] = 92;
		mark[4] = 76;
		for (int i = 0; i < 5; i++) {
			System.out.println(mark[i]);
		}

	}

}
