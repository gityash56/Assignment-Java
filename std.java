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
		enrl_no=5001;
		name="RAVAL JATIN";
		gender="Male";
		mark=85;
	}
	Student(int nr,String na,int m)
	{
		enrl_no=nr;
		name=na;
		gender="Male";
		mark=this.mark;
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
class std
{
	public static void main(String args[])
	{
		Student S1=new Student();
		Student S2=new Student(5010,"JATIN",98);
		
		S1.display();
		S2.display();
		System.out.println("TOTAL OBJECT CREATED : "+Student.count);
	}
}
