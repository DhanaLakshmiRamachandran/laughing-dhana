import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		//Scanner scr=new Scanner(System.in);
		int num=4;
		int a=0;
		int b=1,c = 0;
		int sum=0;
		System.out.println("a :"+a);
		System.out.println("b :"+b);
		for(int i=2;i<num;i++){
			c=a+b;
			System.out.println(""+c);
			a=b;
			b=c;
			sum+=b;
				}System.out.println("sum : "+sum);
		
				
	}

}
