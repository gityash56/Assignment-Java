/*program of subclass constructor which invokes super class constructor */
class student
{
	int enrl_no,year;
	student()
	{
		enrl_no=501;
		year=2021;
		System.out.println("Supper_class");
		System.out.println("Enrollment No : "+enrl_no);
		System.out.println("Admission Year : "+year);
		
	}
}

class student_s1 extends student
{
	String name,dept;
	student_s1()
	{
		super();
		
		this.enrl_no=502;
		this.year=2022;
		name="RAVAL JATIN";
		dept="FYMCA";
		System.out.println("\nSUB_CLASS");
	}
	student_s1(int e,int y,String n,String d)
	{
		this.enrl_no=e;
		this.year=y;
		this.name=n;
		this.dept=d;
	}
	
	void display()
	{
		System.out.println("Enrollment No : "+enrl_no);
		System.out.println("Admission Year : "+year);
		System.out.println("Student Name : "+name);
		System.out.println("Department Name : "+dept);
	}
}

class supperclass
{
	public static void main(String a[])
	{
		student_s1 b1=new student_s1();
		b1.display();
	}
}
