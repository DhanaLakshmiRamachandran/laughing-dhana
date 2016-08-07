import java.util.Scanner;

public class Range {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the first input :");
		int a = scr.nextInt();
		System.out.println("Enter the second input :");
		int b = scr.nextInt();
		System.out.println("Enter the third input :");
		int c = scr.nextInt();

		int flag = 0;
		int count = 0;
		int d;

		String s = Integer.toString(a);
		while (b <= c) {
			flag = 0;
			for (int i = 2; i <= b / 2; i++) {
				if (b % i == 0) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				d = b;
				System.out.println("Prime numbers :" + d);
				String s1 = Integer.toString(d);
				if (s1.endsWith(s)) {
					count++;

				}
				if (s1.length() > 1) {
					if (s1.startsWith(s)) {
						count++;

					}
				}
			}
			b++;
		}
		System.out.println(count);

	}

}
