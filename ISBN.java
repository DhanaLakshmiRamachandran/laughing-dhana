
public class ISBN {

	public static void main(String[] args) {
		int sum=0;
		String num="02011033117";
		int len=num.length()-1;
		for(int i=0;i<len;i++){
			int num1=Integer.parseInt(num.substring(i,i+1));
			int num2=i+1;
			int temp=num1*num2;
			sum+=temp;
		}System.out.println(sum);
		if(sum%11==0){
			System.out.println("ISBN num");
		}else
		{
			System.out.println("Not ISBN num");
		}
		}

	}


