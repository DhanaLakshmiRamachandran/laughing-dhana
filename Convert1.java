package wrappers;

import java.util.Scanner;

public class Convert {
	public static void main(String[] args) {

		Integer in = Integer.parseInt(args[0]);
		Integer out=Integer.parseInt(args[1]);
		System.out.println(Integer.toBinaryString(in)+" "+Integer.toBinaryString(out));
		
	}

}
