import java.util.*;
class reverse
{
 public static void main(String ar[])
 {
 char s[]={'j','a','n','u'};
 char c;
 int n,i;
 n=s.length-1;
 for(i=0;i<n/2;i++)
  {
   c=s[i];
   s[i]=s[n];
   s[n]=c;
   n--;
  }
  String b=new String(s);
 System.out.print("reverse string is:"+b);
 }
}


/*Scanner ob=new Scanner(System.in);
 System.out.print("enter string:");
 s=ob.nextLine();*/

/*import java.util.*;
class reverse
{
 public static void main(String ar[])
 {
 String s,rev=" ";
 Scanner ob=new Scanner(System.in);
 System.out.print("enter string:");
 s=ob.nextLine();
 for(int i=s.length()-1;i>=0;i--)
  {
   rev=rev+s.charAt(i);
  }
 System.out.print("reverse string is:"+rev);
 }
}*/