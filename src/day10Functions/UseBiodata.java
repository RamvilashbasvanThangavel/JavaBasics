package day10Functions;

public class UseBiodata {
	public static void main(String[] args) {
		Biodata bd = new Biodata();
		System.out.println(bd.name());  // 1st program.
		
		bd.gender();  // 2nd program doesn't contains description.
		
		System.out.println(bd.age(1997));  // 3rd program.
		
		bd.degree("B.E");

	} 
}
