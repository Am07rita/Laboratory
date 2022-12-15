//WAP to check whether a charcter is an alphabet or not.

package basic;

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char d;//char d='x';static
		System.out.println("Enter a character");
		d = sc.next().charAt(0);
		if (d>='a' && d<='z') 
		{
			System.out.println("The character is an alphabet");
		}
		else
		{
			System.out.println("The character is not an alphabet");
		}
     
	}

}
