class Student
{
		public int mark=90;
		static int count=0;
		{
			count++;
		}
		int enrl_no;
		String name;
		String gender;
	Student()
	{
		enrl_no=101;
		name="shah yash";
		gender="Male";
		mark=80;
	}
	Student(int nr,String na,int m)
	{
		enrl_no=nr;
		name=na;
		gender="F";
		mark=m;
	}
	void display()
	{
		System.out.println("Enrollment no : "+enrl_no);
		System.out.println("Name : "+name);
		System.out.println("Gender : "+gender);
		System.out.println("Mark : "+mark);
		
		System.out.println("");
	}
}
class main_Student
{
	public static void main(String args[])
	{
		Student S1=new Student();
		Student S2=new Student(102,"shah",91);
		
		S1.display();
		S2.display();
		System.out.println("Number of object : "+Student.count);
	}
}
