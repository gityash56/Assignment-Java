// w.jp.  to display sum of two number take input with user.   date - 9/10/21

import java.util.Scanner;
class sum
{
	public static void main(String args[])
	{
		int n1,n2,total;
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter First value=");
		n1=s.nextInt();
		System.out.print("Enter Second value=");
		n2=s.nextInt();
		
		total=n1+n2;
		
		System.out.println("First value:"+n1);
		System.out.println("Second value:"+n2);
		
		System.out.print("Two Number Addition is:="+total);
	}
}