package day10Functions;

public class UseCalculator {
	public static void main(String[] args) {
		Calculator ar = new Calculator();      // object creation syntax for class Calculator.
		System.out.println(ar.add());         // without parameter return type.
		ar.sub();                             // without parameter void type.
		System.out.println(ar.mul(4, 2));    // with parameter return type.
		ar.div(4, 2);                       // with parameter void type.
	}
}
