public class AverageMarks {

	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		int m1=scr.nextInt();
		int m2=scr.nextInt();
		int s1=scr.nextInt();
		int s2=scr.nextInt();
		int s3=scr.nextInt();
		int s4=scr.nextInt();
		
		int sum=0;
		double avg=(m1+m2+s1+s2+s3+s4)/6;
		System.out.println(avg);
	}

}
