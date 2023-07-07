package day11Revision;

public class UseStudent {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "Ram";
		s1.e= 98;
		s1.t=95;
		s1.m=96;
		s1.total=s1.findTotal(10);
		s1.display();
		
		Student s2 = new Student();
		s2.name = "Raju";
		s2.e= 95;
		s2.t=92;
		s2.m=99;
		s2.total=s2.findTotal(10);
		s2.display();
	}

}
