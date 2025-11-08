package h2;

public class H2_main {
	public static void main(String[] args) {
		boolean x, y, a, b, c;
		int input;
		x = true;
		y = true;
		a = true;
		b = true;
		c = true;
		input = 11;
		if (input == 10 || input == 11) {
			x = true;
		} else {
			x = false;
		}
		if (input == 1 || input == 11) {
			y = true;
		} else {
			y = false;
		}
		if (x == true && y == true) {
			a = true;
		} else {
			a = false;
		}
		if (x == true || y == true) {
			b = true;
		} else {
			b = false;
		}
		c = !y;
	}
}