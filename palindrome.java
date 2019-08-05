import java.util.*;
class palindrome
{
	public static void main(String ar[])
	{
	System.out.print("enter number:");
	Scanner ob=new Scanner(System.in);
	int n=ob.nextInt();
	int num=n,sum=0,r;
	while(n>0)
	{
	r=n%10;
	sum=(sum*10)+r;
	n=n/10;
	}
	if (sum==num)
		System.out.print(num+" is palindrome");
	else
		System.out.print(num+" is not palindrome");
	}
}