class maximum
{
	public static void main(String args[])
	{
		int a=70,b=80,c=90,d=100;
		if(a>=b&&a>=c&&a>=d)
		{
			System.out.print(a+" is Maximum");
		}
		else if(b>=a&&b>=c&&b>=d)
		{
			System.out.println(b+" is Maximum");
		}
		else if(c>=a&&c>=b&&c>=d)
		{
			System.out.println(c+" is Maximum");
		}
		else
		{
			System.out.println(d+" is Maximum");
		}
	}
}