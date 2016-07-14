import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();

		if (i > 0) {
			System.out.println("Number is positive");
		} else if (i < 0) {
			System.out.println("Number is negative");
		} else if (i == 0) {
			System.out.println("Neither positive nor negative");

		} else {
			System.out.println("integer expected");

		}

	}

}
