import java.lang.Math; 
class geo
{
	public static void main(String ar[])
	{
	System.out.println("****Area of****");
	area ob=new area(2);
	area ob1=new area(2,5);
	area ob2=new area(6,7.5f);
	}
}


class area
{
	float a;
	double b;

	area(int r)
	{
	b=Math.PI*r*r;
	System.out.println("circle:"+b);
	}

	area(int l,int b)
	{
	System.out.println("rectangle:"+l*b);
	}

	area(int b,float h)
	{
	a=0.5f*b*h;
	System.out.println("triangle:"+a);
	}
}