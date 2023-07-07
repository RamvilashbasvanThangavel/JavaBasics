package day09ForLoop3OfObject;

public class UseStudent {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "Ram";
		s1.std = 8;
		s1.mark = 80;
		s1.mobileNumber = 6374307218l;

		Student s2 = new Student();
		s2.name = "Arun";
		s2.std = 8;
		s2.mark = 100;
		s2.mobileNumber = 9443183914l;

		Student s3 = new Student();
		s3.name = "Muthu";
		s3.std = 9;
		s3.mark = 95;
		s3.mobileNumber = 9659445516l;

		Student s4 = new Student();
		s4.name = "Shamala";
		s4.std = 10;
		s4.mark = 90;
		s4.mobileNumber = 9578466085l;

		Student[] s = { s1, s2, s3, s4 };
		int min = s[0].std;
		int max = s[0].std;
		int total = 0;
		int count = 0;
		int average = 1;
		int hm = s[0].mark;
		for (int i = 0; i <= s.length - 1; i++) {
			total = total + s[i].mark;
			count = count + 1;
			average = total / count;
		}
		System.out.println("Average Marks of All students: " + average);

		for (int i = 0; i <= s.length - 1; i++) {
			if (s[i].std > max) {
				max = s[i].std;
			}
		}
		System.out.println("Highest std : " + max);

		for (int i = 0; i <= s.length - 1; i++) {
			if (s[i].std < min) {
				min = s[i].std;
			}
		}
		System.out.println("lowest std : " + min);

		for (int i = 0; i < s.length; i++) {
			if (s[i].mark > hm) {
				hm = s[i].mark;
			}
		}
		System.out.println("Highest Marks : " + hm);

	}
}
