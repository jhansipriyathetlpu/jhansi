import java.util.*;
class chara
{
	public static void main(String ar[])
	{
	String c;
	System.out.print("enter string:");
	Scanner ob1=new Scanner(System.in);
	c=ob1.nextLine();
	System.out.println("entered string is:"+c);

	char c1;
	System.out.print("enter char:");
	c1=ob1.next().charAt(0);
	System.out.print("entered string is:"+c1);
	}
}