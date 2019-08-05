import java.util.*;
class fact
{
	public static void main(String ar[])
	{
	System.out.print("enter number:");
	Scanner ob=new Scanner(System.in);
	int n=ob.nextInt();
	int f=fact(n);
	System.out.println("factorial of " +n+ " is:"+f);
	}
	static int fact(int n)
	{
	int f=1;
	if(n==1)
		return 1;
	else
		f=n*fact(n-1);
	return f;
	}
}