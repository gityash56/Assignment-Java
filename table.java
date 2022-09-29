// 18) w.a.p. to display multiplication table using all loops.  date= 31-10-21

import java.util.Scanner;
class table
{
	public static void main(String arg[])
	{
		int n,a,i;
		Scanner s=new Scanner(System.in);
	
		System.out.print("Enter Any Number You Want To Print Table:");
		n=s.nextInt();
	
	/*	for(i=1;i<=10;i++)
		{
			a=n*i;
			System.out.println(n+"*"+i+"="+a);
		}
    */
	
	/*	i=1;
		while(i<=10)
		{
			a=n*i;
			System.out.println(n+"*"+i+"="+a);
			i++;
		}  
	*/
			i=1;
			do
			{
				a=n*i;
				System.out.println(n+"*"+i+"="+a);
				i++;
			}
			while(i<=10);
		
	}
}
