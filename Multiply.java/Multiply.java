package basic;

import java.util.Scanner;

public class Multiply {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a No.");
		int i, num=sc.nextInt();
		for (i=1; i<=10; i++) 
		{
			System.out.println(num+"*"+i+"="+num*i);
		}  
	}

}
