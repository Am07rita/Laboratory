package basic;
import java.util.Scanner;

public class Banktransaction {
	 public static float deposit (float a,float b) {
	    	float result= a+b;
	    	return result;
	 }
	 public static float withdraw (float a,float b)
	 {
		   float c=0;
		    if(a>=b)
		    { 
	    	c=a-b;
	    	System.out.println("withdrawl successfully ");
		    }
	    	else 
	    	{
	    		System.out.println(" Insufficient balance:");
	    		  
	    	}
			return c;
		       
		    	
	    	}
	    
	        
	    	public static void main(String[] args) {
	    	
	    		Float num1,num2,res;
	    		int choice;
	    		Scanner sc = new Scanner(System.in);
	    		do {
	            System.out.println("which operation you want to perform");
	            System.out.println("1)DEPOSIT\n2)WITHDRAW 3)EXIT");
	            choice=sc.nextInt();
	            switch(choice){
	            	case 1:
	            
	            	 System.out.println("Enter your current amount:");
	            	 num1 = sc.nextFloat();
	            	 System.out.println("deposited amount:");
	            	 num2 = sc.nextFloat();
	            	 res = Banktransaction.deposit(num1,num2);
	            	 System.out.println("your available amount:"+res);
	            	 break;
	            case 2:
	            		 System.out.println("Enter your current amount:");
	                	 num1 = sc.nextFloat();
	                	 System.out.println("withdrawl amount:");
	                	 num2 = sc.nextFloat();
	                	 res = Banktransaction.withdraw (num1,num2);
	                	 System.out.println("your available amount is:"+res);
	                	 break;
	    }
	    	
	   
	 }while(choice != 3);
}
}
