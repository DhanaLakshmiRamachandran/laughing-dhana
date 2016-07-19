import java.lang.*;
public class Palindrome
{
public static void main(String[] args)
{

int num=Integer.parseInt(args[0]);
int n=num;

int sum=0;
while(num>0)
{
sum+=num%10;
num=num/10;
}
if(sum==n)
{
System.out.println("palindrome");
}
else
{
System.out.println("not palindrome");
}
}
}
