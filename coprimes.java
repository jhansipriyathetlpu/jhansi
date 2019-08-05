class coprimes
{
	public static void main(String ar[])
	{
	int r,a=7,b=2;
	r=a%b;
	while (r!=0)
	{
	a=b;
	b=r;
	r=a%b;
	}
	if (b==1)
	System.out.print("coprimes");
	else
	System.out.print("not coprimes");
	}
}