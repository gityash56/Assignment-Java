/* 16  w.a.p. using switch case to perform following task.

case 1 for Addition of two numbers(+)
case 2 for Substraction of two numbers(-)
case 3 for Multiplication of two numbers(*)
case 4 for Division of two numbers(/)
case 5 for Remainder of two numbers(%)

 date- 20/10/21   */
 
import java.util.Scanner;
class calc
{
	public static void main(String arg[])
	{
		int n1,n2,add,sub,mul,div;
		float mod;
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter Number=");
		n1=s.nextInt();
		System.out.print("Enter Second Number=");
		n2=s.nextInt();
		
		System.out.println("\nEnter 1 To Perform Addition");
		System.out.println("Enter 2 To Perform Substraction");
		System.out.println("Enter 3 To Perform Multiplication");
		System.out.println("Enter 4 To Perform Division");
		System.out.println("Enter 5 To Perform Remainder");
		
		int ch;
		System.out.print("\nEnter Your Choice..=");
		ch=s.nextInt();
		switch(ch)
		{
			case 1:
				add=n1+n2;
				System.out.println("Addition is="+add);
			break;
			case 2:
				sub=n1-n2;
				System.out.println("Substraction is="+sub);
				break;
				
			case 3:
				mul=n1*n2;
				System.out.println("Multiplication is="+mul);
				break;
				
			case 4:
				div=n1/n2;
				System.out.println("Division is="+div);
				break;
				
			case 5:
				mod=n1%n2;
				System.out.println("Remainder is="+mod);
				break;
				
			default:
					System.out.println("Please Enter Your Valid Choice..!");
					break;
			
		}		
	}
} 
