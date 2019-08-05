import java.lang.Math;
import java.util.*;
class ran
{
public static void main(String ar[])
 {
  Random ob=new Random();
  System.out.println(ob.nextInt(20));
  System.out.println(ob.nextDouble());
  System.out.println(ob.nextFloat());
  System.out.println(ob.nextBoolean());
  //with seed values
  Random ob1=new Random(3);
  Random ob2=new Random(3);
  System.out.println(ob1.nextInt(20));
  System.out.println(ob2.nextInt(20));
 }
}