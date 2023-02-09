package Thursdaylab;
import java.util.Scanner;
public class Firstlastdigit {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num,first_Digit=0,last_Digit=0,temp;
		System.out.println("Enter the number:");
		num=sc.nextInt();
		temp=num;
		last_Digit = num%10;
		System.out.println("Last digit of "+num+" is: "+last_Digit);
		for(;num>=10;) {
			num=num/10;
			first_Digit=num;
		}
		System.out.println("First digit of "+temp+" is: "+first_Digit);
	}
	}

