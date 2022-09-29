// 19  w.a.p. to find Factorial of a Given Number using all loops.  date= 05-11-21

import java.util.Scanner;
class fact
{
	public static void main(String arg[])
	{
		int n,i,factorial=1;
		Scanner s=new Scanner(System.in);
		
		System.out.print("Factorial for This Number=");
		n=s.nextInt();
		
		for(i=1;i<=n;i++)
		{
			factorial=factorial*i;
		
		}  
		
	/*	i=1;
		while(i<=n)
		{
			factorial=factorial*i;
			i++;
		}  */
		
	/*	i=1;
		do
		{
			factorial=factorial*i;
			i++;
		}while(i<=n);    */
		
    	System.out.println("\nThe Factorial of "+n+" is="+factorial);
	}
}