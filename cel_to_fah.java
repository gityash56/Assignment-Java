// 6 w.jp. to convert celsius into fahrenheit 9-10-21

import java.util.Scanner;
class cel_to_fah
{
	public static void main(String args[])
	{
		float f,c;
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter celsius value=");
		c=s.nextFloat();
		
		f=((c * 9)/5)+32;
		
		System.out.print("fahrenheit into celsius="+f);
	}
}