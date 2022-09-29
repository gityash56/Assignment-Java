/* 14  w.jp. to Generate employee salary slip take input as employee basic salary and generate following:
HRA=10%  OF BASIC 
DA=12%   OF BASIC
TA=5% OF BASIC
PF=10% OF BASIC
Medical=100 rs
pt=200 rs (profesional tax)

formula of net salary:=
------------------------
(net_sal = Basic+HRA+DA+TA+MEDICAL-PF-PT)


/date 11-10-21 */

import java.util.Scanner;
class emp_slip 
{
	public static void main(String arg[])
	{
		int eid,basic,med=100,prof=200;
		float hra,da,ta,pf,net;
		
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter Employee Id=");
		eid=s.nextInt();
		
		System.out.print("Enter basic sallary=");
		basic=s.nextInt();
		
		hra=(basic*10)/100;
		da=(basic*12)/100;
		ta=(basic*5)/100;
		pf=(basic*10)/100;
		
		System.out.println("............................................................");
		System.out.println("Employee Id= "+eid);
		
		System.out.println("............................................................");
		System.out.println("Basic salary= "+basic);
		
		System.out.println("............................................................");
		System.out.println("Allowence			Deducation");
		
		
		System.out.println("\nHRA(10%)="+hra);
		System.out.println("\t\t\t\t pf(10%)="+pf);
		System.out.println("Da(12%)="+da);
		System.out.println("\t\t\t\t profesional tax="+prof);
		System.out.println("Da(12%)="+da);
		System.out.println("\nTa(5%)="+ta);
		System.out.println("\nMedical="+med);
		System.out.println(".............................................................\n");
		
		net=basic+hra+da+ta+med-pf-prof;
		
		System.out.println("Net Salary ="+net);
		
	}
}