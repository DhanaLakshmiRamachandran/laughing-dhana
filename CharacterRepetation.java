import java.util.*;

public class CharacterRepetation {
	public static void main(String[] args) {
		// String s = "ENGINEERING";
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = s.next();
		int count;
		int k = 0;
		int len = str.length();
		char[] characters = new char[str.length()];
		for (int i = 0; i < len; i++) {
			count = 0;
			for (int j = 0; j < len; j++) {

				if (characters[j] == str.charAt(i)) {
					count++;
				}
			}
			if (count == 0) {
				characters[k] = str.charAt(i);
				k++;
			}
		}
		int lenOfArray = k;

		for (int i = 0; i < lenOfArray; i++) {
			count = 0;
			for (int j = 0; j < len; j++) {
				if (characters[i] == str.charAt(j)) {
					count++;
				}
			}
			System.out.println(characters[i] + " occurs " + count + " times int the give string ( " + str + " )");
		}
	}
}
