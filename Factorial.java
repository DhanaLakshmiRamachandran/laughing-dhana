import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int k=scan.nextInt();
		int a=0,b=1,c=0,i;
		System.out.println(a);
		System.out.println(b);
		for(i=1;i<=k-2;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
		

	}

}
