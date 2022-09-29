// 11  w.jp. to find Student is Pass or Fail.

import java.util.Scanner;
class stud_passfail
{
	public static void main(String args[])
	{
		int c,java,rdbms;
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter C progrming marks=");
		c=s.nextInt();
		
		System.out.print("Enter Java marks=");
		java=s.nextInt();
		
		System.out.print("Enter Rdbms marks=");
		rdbms=s.nextInt();
		
		if(c>=33 || java>=33 || rdbms>=33)
		{
			System.out.print("Congratulation You are pass.");
		}
		else
		{
			System.out.print("You are Fail.");
		}
	}
}