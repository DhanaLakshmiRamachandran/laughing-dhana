public class Check {
	public void check(String s)
	{
		String[] s1=s.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			int len=s1[i].length();
			char key=s1[i].charAt(len-1);
			int[] flag=new int[len];
			for(int j=0;j<len;j++)
			{
				if(s1.charAt[j]<91)
				{
					flag[j]=1;
				}
			}
			s1[i].toLowerCase();
			int key1=(int)key-96;
			for(int j=0;j<len-1;j++)
			{
				s1.charAt(j)-=key1;
				if(s1.charAt(j)<97)
				{
					s1.charAt(j)+-26;
				}
				
			}
			for(int j=0;j<len;j++)
			{
				if(flag[j]==1)
				{
					s[j]-=32;
				}
				
			}
		}
		String result=s1[0];
		for(int i=1;i<s1.length;i++)
		{
			result=result+" "+s1[i];
		}
		System.out.println(result);
	}


public static void main(String[] args)
{
	String str="Java";
	str.check(s);
}
}

	
		

