package github;

import java.util.Scanner;

public class Lab {

	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("enter a number : ");
		String s1=scr.nextLine();
		String str=scr.nextLine();
		String str1=scr.nextLine();
		String str2=scr.nextLine();
		String str3=scr.nextLine();
		String s2[]={"7","10","173","829"};
		for(int i=0;i<s2.length;i++){
			if(s2[i].equals(str)){
				System.out.println("+");
			}
		}
		String s3=str1.substring(str1.length()-2);
		if(s3.equals(s1)){
			System.out.println("-");
		}
		for(int i=0;i<s2.length;i++){
			String s4=str2.substring(1,3);
			if(s4.equals(s2[i])){
				System.out.println("*");
			}
		}
		for(int i=0;i<s2.length;i++){
			String s5=str3.substring(str3.length()-2);
			if(s5.equals(s2[i])){
				System.out.println("?");
			}
		}

	}

}
