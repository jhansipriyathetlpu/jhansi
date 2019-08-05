class rectangle
{
	int l,b;
	void area()
	{System.out.println(l*b);}
	void perimeter()
	{System.out.println(2*(l+b));}
}
class test
{
	public static void main(String ar[])
	{
	rectangle k1=new rectangle();
	k1.l=10;
	k1.b=20;
	k1.area();
	k1.perimeter();
	rectangle k2=new rectangle();
	k2.l=50;
	k2.b=60;
	k2.area();
	k2.perimeter();
	}
}
