import java.util.Scanner;

public class Firstlast {
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter the number ");
		String num=scr.nextLine();
		int len=num.length();
		int str=Integer.parseInt(num.substring(0,1));
		int str1=Integer.parseInt(num.substring(len-1));
		int sum=0;
		sum+=str+str1;
		System.out.println("first num:"+str);
		System.out.println("last num:"+str1);
		System.out.println(sum);
	}

}
