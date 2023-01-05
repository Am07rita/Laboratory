package Array;

import java.util.Scanner;

public class Palindromestring 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string:");
		String str =sc.nextLine();
		String	reverseStr="";
		int strLength=str.length();
			for(int i=(strLength-1);i>=0;i--)
			{
			reverseStr=reverseStr+str.charAt(i);	
			}
		
			if(str.toLowerCase().equals(reverseStr.toLowerCase()))
			{
				System.out.println(str+ " is a palindrome string");
			}
			else
			{
				System.out.println(str+ " is not a palindrome string");
			}
	}

}
