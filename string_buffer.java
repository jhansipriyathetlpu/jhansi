import java.util.*;
class buf
{
 public static void main(String ar[])
 {
 
 String s="welcome to my home";
 StringBuffer ob=new StringBuffer(s);
 System.out.println("capacity:"+ob.capacity());
 System.out.println("length:"+ob.length());
 System.out.println("append:"+ob.append("[house]"));
 System.out.println("insert:"+ob.insert(13," new"));
 System.out.println("delete:"+ob.delete(13,16));
 System.out.println("replace:"+ob.replace(0,2,"here"));
 System.out.println("substring:"+ob.substring(10));
 System.out.println("substring:"+ob.substring(2,4));
 System.out.println("reverse:"+ob.reverse());
 }
}