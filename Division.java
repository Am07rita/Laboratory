//WAP to check whether that no.is divisible by 5 ana 11
package basic;

import java.util.Scanner;

public class Divisible {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a no.");
		num = sc.nextInt();
		if(num%5==0 && num%11==0) 
		{
		   System.out.println("The no.is divisible by both 5 and 11");	
		}
		else
		{
			System.out.println("The no.is not divisible by both 5 and 11");
		}

	}

}
