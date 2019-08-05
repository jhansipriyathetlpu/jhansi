class sort
{
	public static void main(String ar[])
	{
	int a[]={4,7,3,9,5,2,6},i,j,temp;
	for(int x:a)
		System.out.println(x);
	System.out.print("after sorted");
	for(i=0;i<a.length;i++)
	  {
	   for (j=0;j<a.length-1;j++)
	     {
	     if(a[i]<a[j])
		{
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		}
	     }
	   }
	for(int x:a)
		System.out.println(x);
	}
}