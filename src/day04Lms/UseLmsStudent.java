package day04Lms;

public class UseLmsStudent {
	public static void main(String[] args) {
		LmsStudent s = new LmsStudent();
		String[] a = args[0].split("-");
		s.name = a[0];
		s.id = Integer.parseInt(a[1]);
		s.phno = Long.parseLong(a[2]);
		s.paid = Boolean.parseBoolean(a[2]);
		System.out.println(s.name);
		System.out.println(s.id);
		System.out.println(s.phno);
		System.out.println(s.paid + "\n");

		LmsStudent s2 = new LmsStudent();
		String[] b = args[0].split("-");
		s2.name = b[0];
		s2.id = Integer.parseInt(b[1]);
		s2.phno = Long.parseLong(b[2]);
		s2.paid = Boolean.parseBoolean(b[2]);
		System.out.println(s2.name);
		System.out.println(s2.id);
		System.out.println(s2.phno);
		System.out.println(s2.paid);

	}

}
