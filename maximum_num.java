// 8 w.jp. to find Maximum from 2 given number  10-10-21

import java.util.Scanner;
class maximum_num
{
	public static void main(String args[])
	{
		int n1,n2;
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter Number1 & Number2 value=");  //don't Enter a same value
		n1=s.nextInt();
		n2=s.nextInt();
		
		if(n1>n2)
		{
			System.out.print("Number1 is Gretter");
		}
		else
		{
			System.out.print("Number2 is Gretter");
		}
		
	}
}