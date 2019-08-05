class example
{
	int a,b;
	example()
	{
	a=10;
	b=20;
	}
	void display(int a,int b)
	{
	a=this.a+30;
	b=this.b+40;
	System.out.println(a+" "+b);
	}
	public static void main(String ar[])
	{
	int a=15,b=60;
	System.out.println(a+" "+b);
	example ob=new example();
	ob.display(a,b);
	System.out.println(a+" "+b); 
	}
}
