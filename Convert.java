public class Convert {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the decimal number:");
		int num=scan.nextInt();
		String octalString = Integer.toOctalString(num);
		System.out.println("Octal number:"+octalString);
		String BinaryString = Integer.toBinaryString(num);
		System.out.println("Binary number:"+BinaryString);
		String HexString = Integer.toHexString(num);
		System.out.println("HexaDecimal number:"+HexString);
	


	}

}
