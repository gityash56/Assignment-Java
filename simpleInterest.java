// 5  w.jp. to calculate of simple interest   date 9-10-21

import java.util.Scanner;
class simpleInterest
{
	public static void main(String args[])
	{
		int p,r,n,si;
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter P value=");
		p=s.nextInt();
		System.out.print("Enter R value=");
		r=s.nextInt();
		System.out.print("Enter N value=");
		n=s.nextInt();
		
		si=(p*r*n)/100;
		
		System.out.print("Simple interest:="+si);
	}
}