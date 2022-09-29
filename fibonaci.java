// 20  w.a.p. to Display fibonaci series upto 30 Numbers using all loops.  date= 05-11-21

import java.util.Scanner;
class fibonaci
{
	public static void main(String arg[])
	{
		int n1=0,n2=1,n3,number;
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter number You want fibonaci series=");
		number=s.nextInt();
		
		System.out.println(n1);
		System.out.println(n2);
		
		for(int i=2;i<number;i++)
		{
			n3=n1+n2;
			System.out.println(""+n3);
			
			n1=n2;
			n2=n3;
		}   

	}
}