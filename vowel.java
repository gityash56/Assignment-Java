/* 15  w.a.p. to find vowels or consonants using switch case.    date- 20/10/21   */

import java.util.Scanner;
class vowel
{
	public static void main(String arg[])
	{
		char ch;
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter character:");
		ch=s.next().charAt(0);
		
		switch(ch)
		{
			case 'A':
			case 'a':
			case 'E':
			case 'e':
			case 'I':
			case 'i':
			case 'O':
			case 'o':
			case 'U':
			case 'u':
				System.out.println("It is a Vowel");
				break;
			default:
				System.out.println("It is a Consonant");
				break;
		}
	}
}