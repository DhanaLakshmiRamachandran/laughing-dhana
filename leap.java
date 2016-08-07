import java.util.Scanner;

public class Leap {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the year");
		int in=scanner.nextInt();
		if(in% 400==0 || in %100==0){
			System.out.println("leap year");
		}
		else
		{
			System.out.println("non leap year");
		}
	}

}
