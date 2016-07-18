public class Contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hellohai";
		String s2="hello";
		int len=s2.length();
		for(int i=0;i<len;i++)
		{
			if(s1.contains(s2))
			{
				System.out.println("Subset");
			}
			else
			{
				System.out.println("not a Subset");
			}
		}
		

	}

}
