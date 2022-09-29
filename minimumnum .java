import java.util.Scanner;  
class minimumnum 
{  
	public static void main(String[] args)   
	{  
		int a,b,c,min,temp;  
		Scanner s = new Scanner(System.in); 
		
		System.out.println("Enter The First Number:");  
		a = s.nextInt();  
		System.out.println("\nEnter The Second Number:");  
		b = s.nextInt();  
		System.out.println("\nEnter The Third Number:");  
		c = s.nextInt();  
		
		temp=a<b?a:b;  
		min=c<temp?c:temp;
		
		System.out.println("The minimun number is: "+min);  
	}  
}  










