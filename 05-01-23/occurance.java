package Array;

import java.util.Scanner;

public class Occuranceofno {

	public static int countoccurance(String str,char c) {
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if (c==str.charAt(i))
			{
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter string:");
	String str=sc.nextLine().toLowerCase();
	System.out.println("Enter which occurance to find:");
	char c =sc.next().charAt(0);
	System.out.println("No.of occurance of "+c+" is: "+countoccurance(str,c));
	
	}

}
