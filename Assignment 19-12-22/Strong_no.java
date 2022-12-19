package basic;

import java.util.Scanner;

public class Strong_No {

	public static void main(String[] args) {
		int num,temp,fact,r,i,sum=0;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a No.");
		num = sc.nextInt();
		temp = num; //storing value of num in temp variable
		while(num!=0) 
		{
			r = num%10;
			fact=1;
			for(i=1;i<=r;i++) 
			{
				fact=fact*i;
			}
			sum=sum+fact;
			num=num/10;
		}
		if(temp==sum) 
		{
		System.out.println(temp+" is a strong number.");	
		}
		else {
			System.out.println(temp+" is not a strong number.");
		}
		
	}

}

