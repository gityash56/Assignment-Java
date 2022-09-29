// 7  w.jp. to find average of 3 number  10-10-21

import java.util.Scanner;
class average
{
	public static void main(String args[])
	{
		float n1,n2,n3,avg;
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter Number1 value=");
		n1=s.nextFloat();
		
		System.out.print("Enter Number2 value=");
		n2=s.nextFloat();
		
		System.out.print("Enter Number3 value=");
		n3=s.nextFloat();
		
		avg=(n1+n2+n3)/3;
		
		System.out.print("Average of Three Number="+avg);
	}
}