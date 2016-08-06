
public class Power1 {
	public static int output1;
	 
	public static void power1(int input1)
	{
		int num=input1;
		int  count=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		int num1=input1;
		while(num1>0)
		{
			int a=num1%10;
			int z=1;
			int pos=count;
			for(int i=pos;i>0;i++)
			{
				z=z*a;
			}
			num1=num1/10;

			output1=output1+z;
			
		}
		System.out.println(output1);
		}
	public static void main(String[] args) {
		power1(1234);
		
          		
		
	}
	}

