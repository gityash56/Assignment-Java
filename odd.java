/* 17  w.a.p. to display odd Numbers using all loops.    date- 24/10/21   */

import java.util.Scanner;
class odd
{
		public static void main(String args[])
		{
			int n,i;
			Scanner s=new Scanner(System.in);
			
			System.out.print("Enter Any Number You want to Print=");
			n=s.nextInt();
			
			/*for(i=1;i<=n;i++)
			{
				System.out.println(i);
				i++;
			} */
		
			/*	i=1;
				while(i<=n)
				{
					System.out.println(i);
					i=i+2;
				}  */
			i=1;
			do
			{
				System.out.println(i);
				i=i+2;    
			}while(i<=n);
		}	
}