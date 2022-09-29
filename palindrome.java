// 21  w.a.p. to check palindrome or not..

import java.util.Scanner;
class palindrome
{
	public static void main(String arg[])
	{
		int r,sum=0,temp,n;
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter Number=");
		n=s.nextInt();
		
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("It is palindrome Number.");
		}
		else
		{
			System.out.println("It is not palindrome Number.");
		}
	}
}