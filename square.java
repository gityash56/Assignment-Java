// 4  w.jp. to find Square of given number   date 9-10-21

import java.util.Scanner;
class square
{
	public static void main(String args[])
	{
		int sq,num;
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter value=");
		num=s.nextInt();
		
		sq=num*num;
		
		System.out.println("Square is:="+sq);
		
	}
}