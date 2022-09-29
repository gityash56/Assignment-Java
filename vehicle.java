import java.util.Scanner;
class vehicle1
 {
	 String vehicle_type;
	 void display(String s)
	 {
		 System.out.println("\nVehicle type ==>"+s);
	 }
	 
 }
 class car extends vehicle1
 {
	 String model_type,company_name;
	 
	 
	 void display(String s1,String s2,String s3)
	 {
		super.display(s1);
		System.out.println("Model type ==>"+s2);
		 System.out.println("Company Name ==>"+s3);
	 }
 }
 class vehicle
 {
	 public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		
		car v1 = new car();
		v1.display("CAR","BREZZA","MARUTI SUZUKI");
	}
 }
 
