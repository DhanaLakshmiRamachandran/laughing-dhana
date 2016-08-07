public class Power2 {
	public static void sum(int input1)
	{   
	
		String str =String.valueOf(input1);
		int sum=0;
 for(int i=0;i<str.length()-1;i++)
		{   
 	sum+=Math.pow(Integer.valueOf(str.substring(i,i+1)),Integer.valueOf(str.substring(i+1,i+2)));
}
 sum=sum+1;
 		System.out.println(sum);
}

	public static void main(String args[])
	{
			sum(123);
	}}
