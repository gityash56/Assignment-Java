import java.util.Scanner;
class armstrongnum
{
    public static void main(String args[]) 
	{
        int num,temp,r,result = 0;
		Scanner s = new Scanner(System.in);
      
		System.out.print("\nEnter a Number = ");
		num = s.nextInt();

        temp = num;
        while (temp != 0)
        {
			r= temp % 10;
            result += Math.pow(r,3);
            temp /= 10;
        }

        if(result == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
    }
}





