// 3  w.jp. to find rectangle   date 9-10-21
import java.util.Scanner;
class rectangle
{
	public static void main(String args[])
	{
		int l,w,area;
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter Length vlaue=");
		l=s.nextInt();
		
		System.out.print("Enter Width vlaue=");
		w=s.nextInt();
		
		area=l*w;
		
		System.out.println("Length value="+l);
		System.out.println("Width value="+w);
		
		System.out.print("Area of Rectangle is="+area);
		
		
	}
}