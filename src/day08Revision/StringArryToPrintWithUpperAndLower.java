package day08Revision;

public class StringArryToPrintWithUpperAndLower {
 public static void main(String[] args) {
	String[] name = {"Ram","Kavi","Deva","Ramvilash","muthu"};
	for(int i = 0;i<=name.length-1;i++) {
		if(name[i].length() % 2 != 0) {
			System.out.println(name[i].toUpperCase());
		}
		else {
			System.out.println(name[i].toLowerCase());
		}
	}
}

}
