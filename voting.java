// 9 w.jp. to check user is Applicable for voting or Not..!
import java.util.Scanner;
class voting
{
	public static void main(String args[])
	{
		int age;
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter your Age=");
		age=s.nextInt();
		
		if(age>=18)
		{
			System.out.print("You Are Eligible for Voting");
		}
		else
		{
			System.out.print("You Are Not Eligible for Voting");
		}
	}
}