import java.util.*;
class emp
{   
    int id,salary;
	String name;
    	void read()
	{
	
	System.out.println("enter name id salary:");
	Scanner ob=new Scanner(System.in);
	name=ob.nextLine();
	id=ob.nextInt();
	salary=ob.nextInt();
	}
	void display()
	{
	System.out.println("id:"+ id);
	System.out.println("name:"+ name);
	System.out.println("salary:"+ salary);
	}
	public static void main(String ar[])
	{
      int i;
	emp ob=new emp();
     for(i=1;i<=3;i++)
   	{
	System.out.println("enter details of emp"+i+":");
	ob.read();
	ob.display();
	}
		
    }
	
}