class primes
{
 public static void main(String ar[])
  {
  int i,n,c;
  for (n=1;n<100;n++)
   {
    c=0;
   for(i=1;i<=n;i++)
    {
    if(n%i==0)
     c++;
    }
   if(c==2)
	{System.out.println(n);}
  
   }	
  }
}