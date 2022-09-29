/* 12  w.jp. to find number positive or negative   date 11-10-21 */

import java.util.Scanner;
class positive_negative 
{
	public static void main(String arg[])
	{
		int num;
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter a Number=");
		num=s.nextInt();
		
		if(num>0)
		{
			System.out.println("Number is positive.");
		}
		else if(num<0)
		{
			System.out.println("Number is Negative.");
		}
		else
			System.out.println("Number is Zero.");
	}
}