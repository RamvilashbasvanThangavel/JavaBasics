package day09ForLoop3OfObject;

public class UseEmployee {
	public static void main(String[] args) {
		Employee em1 = new Employee();
		em1.salary = 25000;
		em1.name = "Ram";
		em1.fatherName = "Thangavel";
		em1.experience = 5;

		Employee em2 = new Employee();
		em2.salary = 30000;
		em2.name = "Arun";
		em2.fatherName = "kumar";
		em2.experience = 2;

		Employee em3 = new Employee();
		em3.salary = 15000;
		em3.name = "Muthu";
		em3.fatherName = "Raman";
		em3.experience = 4;

		Employee[] em = { em1, em2, em3 };
		for (int i = 0; i < em.length; i++) {
			System.out.println("1st Output : " + em[i].name.concat(em[i].fatherName));
		}

		for (int i = 0; i < em.length; i++) {
			if (em[i].salary > 20000) {
				System.out.println("2nd Output : " + em[i].name + "," + em[i].fatherName + "," + em[i].experience + ","
						+ em[i].salary);
			}
		}

		int a = 3;
		for (int i = 0; i < em.length; i++) {
			if (em[i].experience > a) {
				System.out.println("3nd Output experience more than 3: " + (em[i].salary + 10000));
			} else {
				System.out.println("3nd Output experience less than 3: " + (em[i].salary + 5000));
			}
		}

	}
}
