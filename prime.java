import java.util.Scanner;
class prime
{
	public static void main(String arg[])
	{
		int i,n,count=0;
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter Number=");
		n=s.nextInt();
		
		for(i=1;i<n;i++)
		{
			if(n%i == 0)
			{
				count++;
			}
		}
		if(count==1)
		{
			System.out.println("Number is Prime");
			
		}
		else
		{
				System.out.println("\nNumber is Not Prime");

		}
	}
}


