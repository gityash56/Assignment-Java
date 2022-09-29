// 22 w.a.p. to display or check Armstrong number or not..

import java.util.Scanner;
//import java.lang.Math;
class armstrong
{
	public static void main(String arg[])
	{
		int r,num,sum=0,temp;
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter Number=");
		num=s.nextInt();
		
		temp=num;
		while(num !=0)
		{
			r=num%10;
		    sum +=  (Math.pow(r,3));   
			num=num/10;
			
		}
		if(temp==sum)
		{
			System.out.println("Number is Armstrong");
		}
		else
		{
			System.out.println("Number is not Armstrong");
		}
	}
}