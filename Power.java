public class Cyclicity {
public static int output1;
	public static void cycle(int input1)
	{
		int count=0;
		int number=input1;
		String s1=Integer.toString(input1);
		StringBuffer sb=new StringBuffer(s1);
		StringBuffer sb1=sb.reverse();
		String s2=sb1.toString();
		 number=Integer.parseInt(s2);
		int temp=number;
		while(temp>0)
		{
			temp=temp/10;
			count++;
		}
		int sum;
		int value=0;
		while(number>0)
		{
			sum=number%10;
			value+=sum*count;
			number=number/10;
			count--;
		}
		output1=value;
		System.out.println(output1);
	}

	public static void main(String[] args) {
	
		cycle(1234);
		

	}

}
