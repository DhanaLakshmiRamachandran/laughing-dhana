import java.util.Scanner;

public class odd {
	
	        public static void main(String args[])
	        {
	                Scanner scan=new Scanner(System.in);
	                System.out.println("Enter a no : ");
	                int i=scan.nextInt();
	                int n[]=new int[10];    
	                int x;
	                int Even=0,Odd=0;
	                
	                while(i!=0)
	                {
	                        x=i%10;
	                        if(x%2==0)
	                        {
	                                Even=Even+x;
	                        	
	                                
	                        }
	                        else
	                        {
	                                Odd=Odd+x;
	                        }
	                        i=i/10;
	                        
	                }
	                System.out.println("Sum of ODD NO :"+Odd+" ");
	                System.out.println("Sum of Even NO :"+Even);
	                if(Odd%2==0){
	                	System.out.println("-1");
	                }
	                else{
	                	System.out.println("1");
	                }
	                
	        }
	}
