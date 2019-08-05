class test
{
	int a;
	test()
	{
	System.out.println("constructor without parameter:"+a);
	}
	test (int x)
	{
	a=x;
	System.out.println("constructor with parameter:"+a);
	}
	void display()
	{
	System.out.println(a);
	}
}
class test_p
{
	public static void main(String ar[])
	{
	test ob=new test();
	test ob1=new test(5);
	ob.a=20;
	ob.display();
	ob.a=30;
	ob.display();
	
	}
}