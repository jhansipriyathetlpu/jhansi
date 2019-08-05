import java.util.*;
class strong
{
	public static void main(String ar[])
	{
	System.out.print("enter number:");
	Scanner ob=new Scanner(System.in);
	int n=ob.nextInt();
	int num=n,i,fact,sum=0,r;
	while(n>0)
	{
	r=n%10;
	fact=1;
	for(i=1;i<=r;i++)
		fact=fact*i;
	sum=sum+fact;
	n=n/10;
	}
	if (sum==num)
		System.out.print(num+" is strong number");
	else
		System.out.print(num+" is not strong number");
	}
}