public class Exponents {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String d = s.nextLine();
		int length = d.length();
		double sum = 0;
		if (length == 0) {
			System.out.println("0");
		} else {
			 {
				
				int b;
				double temp;
				b = Integer.parseInt(d);
				while (length != 0){
				int c = b % 10;
				temp = Math.pow(c, length);
				sum = sum + temp;
				b = b / 10;
				length--;

			}
			System.out.println(sum);
		}

	}
}
}
