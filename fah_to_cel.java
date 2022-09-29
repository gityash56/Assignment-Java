// 6  w.jp. to convert fahrenheit into celsius  9-10-21

import java.util.Scanner;
class fah_to_cel
{
	public static void main(String args[])
	{
		float f,c;
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter Fahrenheit value=");
		f=s.nextFloat();
		
		c=((f-32)*5)/9;
		
		System.out.print("fahrenheit into celsius="+c);
	}
}