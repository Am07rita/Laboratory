package Array;

import java.util.Scanner;

public class Countvowels {
	
	public static int countvowel(String str)
	{
		int count=0;
		char c;
		for(int i=0;i<str.length();i++)
		{
			c=str.charAt(i);
			if((c=='a' || c=='e' || c=='i' || c=='o' || c=='u')||
			  (c=='A' || c=='E' || c=='I' || c=='O'|| c=='U'));
			{
				count++;
			}
		}
		return count;
		
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.nextLine();
		System.out.println("The no.of vowels in "+str+" is: "+countvowel(str));
	}
}
