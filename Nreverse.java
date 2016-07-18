import java.util.Scanner;

public class Nreverse {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the numbers:");
		int k=scan.nextInt();
		int b;
		while(k>0)
		{
			b=k%10;
			System.out.println(b);
			k=k/10;
			
		}
	}
