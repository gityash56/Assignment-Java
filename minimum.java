import java.util.Scanner;  
class minimum
{  
	public static void main(String[] args)   
	{  
		int a,b,c,min,temp;  
		Scanner s = new Scanner(System.in); 
		
		System.out.print("Enter The First Number:");  
		a = s.nextInt();  
		System.out.print("\nEnter The Second Number:");  
		b = s.nextInt();  
		System.out.print("\nEnter The Third Number:");  
		c = s.nextInt();  
		
		temp=a<b?a:b;  
		min=c<temp?c:temp;
		
		System.out.println("\nThe minimun number is: "+min);  
	}  
}  










