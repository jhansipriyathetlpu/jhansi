import java.util.*;
class test
{
		int v;
		void read()
		{   System.out.println("enter no:");
		Scanner ob=new Scanner(System.in);
		v=ob.nextInt();  }
		void display()
		{   System.out.println("no is:"+v);   }
}

class test1
{
	public static void main(String ar[])
	{
	int a;
	test ob1=new test();	
	ob1.read();
	ob1.display();
	
	}
}