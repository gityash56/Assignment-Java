// 10 w.jp. to check Number is odd or even..!

import java.util.Scanner;
class odd_even
{
	public static void main(String args[])
	{
		int num;
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter Number=");
		num=s.nextInt();
		
		if(num%2==0)
		{
			System.out.print("Number is Even");
		}
		else
		{
			System.out.print("Number is odd");
		}
	}
}