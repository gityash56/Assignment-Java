class rectangle
{
	int length,width;
	static int count;
	rectangle()
	{
		length=20;
		width=17;
	}
	rectangle(int l,int w)
	{	length=l;
		width=w;	
	}
	rectangle(rectangle rt)
	{	length=rt.length;
		width=rt.width;	
	}
	void cal()
	{	count=length*width;	}
	void disp()
	{
		System.out.println("Length is : "+length);
		System.out.println("Width is : "+width);
		System.out.println("Value of Rectangle is : "+count);
	}
}
class rect
{
	public static void main(String args[])
	{	rectangle r1=new rectangle();
		rectangle r2=new rectangle(20,16);
		rectangle r3=new rectangle(r2);
		System.out.println("\n--------Default Constructor involked....---------");
		r1.cal();
		r1.disp();
		System.out.println("\n--------Parameterized constructor involked....-------");
		r2.cal();
		r2.disp();
		System.out.println("\n--------Copy constructor involked....---------");
		r3.cal();
		r3.disp();		
	}
}
