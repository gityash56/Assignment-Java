/* 13  w.jp. to check present year is leap year or not.!  date 11-10-21 */

import java.util.Scanner;
class leapyear 
{
	public static void main(String arg[])
	{
		int year;
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter Year=");
		year=s.nextInt();
		
		if(year%4==0)
		{
			System.out.println("Year is LeapYear.");
		}
		else 
		{
			System.out.println("Year is Not leapyear.");
		}
	}
}