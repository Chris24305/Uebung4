package p2;

public class P2_main {
	public static void main(String[] args) {
		int a = 3, b = 5, c = 6;
		int intResult;
		double doubleResult;
		double x = 1.5, y = 2.3;
		intResult = c - a * 3; // Wert 9 und Typ int
		intResult = c / b;		// wert 1 und typ int
		intResult = a + b / c;	// Wert 4 und Typ int
		doubleResult = c / b;		// Wert 1.2 und Typ double
		System.out.println(doubleResult);
		doubleResult = c + a / b;	// Wert 6.0 und Typ double
		System.out.println(doubleResult);
		doubleResult = x + y * b;	// Wert 13.0 und Typ double
		System.out.println(doubleResult);
	}
}
