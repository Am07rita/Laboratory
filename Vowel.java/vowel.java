package basic;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			char d ;
			System.out.println("Enter a character");
			d = sc.next().charAt(0);
			if (d =='a' || d =='e'|| d =='i' || d == 'o' || d == 'u') 
			{
				System.out.println("The character is a Vowel");
			}
			else
			{
				System.out.println("The character is consonant");
			}
	     

	}

}
