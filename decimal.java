import java.util.*;
class decimal
{
 public static void main(String ar[])
 {
 String s;
 System.out.println("enter decimal value");
 Scanner ob=new Scanner(System.in);
 s=ob.nextLine();
 int n=s.indexOf('.');
 System.out.println("before dot "+n+" values");
 int i=s.length()-1;
 System.out.println("after dot "+(i-n)+" values");
 }
}