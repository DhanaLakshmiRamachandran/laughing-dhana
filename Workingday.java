import java.util.Scanner;

public class Workingday {
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		
		System.out.println("Enter the op");
		int op=scr.nextInt();
		String[] day={"Monday","tuesday","wed","thu","fri","sat"};
		
		switch(op){
		case 1:
			System.out.println("true");
			break;
		case 2:
			System.out.println("true");
			break;
		case 3:
			System.out.println("true");
			break;
		case 4:
			System.out.println("true");
			break;
		case 5:
			System.out.println("true");
			break;
		case 6:
			System.out.println("true");
			break;
		default:
			System.out.println("false");
			
			
		}
	}

}
