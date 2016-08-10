import java.util.Scanner;

public class Seed {

	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		int i=scr.nextInt();
		int len=Integer.toString(i).length();
		int seed=i;
		while(i!=0){
			int temp=i%10;
			seed*=temp;
			i/=10;
		}
		System.out.println("seed : "+seed);
	}

}
