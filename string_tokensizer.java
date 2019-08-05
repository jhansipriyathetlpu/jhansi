import java.util.*;
class tok
{
 public static void main(String ar[])
 {
 //String s="hai hello";
 //StringTokenizer ob=new StringTokenizer(s);
 //StringTokenizer ob=new StringTokenizer("hai,hello wel",",");
 StringTokenizer ob=new StringTokenizer("hai,hello",",",true);
 int c=ob.countTokens();
 while(ob.hasMoreTokens())
  {
  String m=ob.nextToken();
  System.out.println(m);
  }
  System.out.println(c);
 }
}