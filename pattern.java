/* 23  print following pattern.  

*
* *
* * *
* * * *
* * * * *


*/
// import java.util.Scanner;
class pattern
{
	public static void main(String arg[])
	{
		// int i,j;
		// Scanner s=new Scanner(System.in);
		
		 // System.out.println("Enter the Number=");
		 // n=s.nextInt();
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");	
			}	
		}
		System.out.println();
	}
}
