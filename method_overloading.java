import java.lang.Math; 
class geo
{
	public static void main(String ar[])
	{
	geometry ob=new geometry();
	ob.area(2);
	ob.area(2,5);
	ob.area(6,7.5f);
	}
}


class geometry
{
	float a;
	double b;
	void area(int r)
	{
	b=Math.PI*r*r;
	System.out.println("circle:"+b);
	}
	void area(int l,int b)
	{
	System.out.println("rectangle:"+l*b);
	}
	void area(int b,float h)
	{
	a=0.5f*b*h;
	System.out.println("triangle:"+a);
	}
}