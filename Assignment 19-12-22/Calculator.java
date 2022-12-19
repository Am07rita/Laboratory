package basic;

import java.util.Scanner;
public class Calculator {
	
    public static int addition (int a,int b) {
    	int result= a+b;
    	return result;
    }
    
        public static int subtraction (int a,int b) 
        	{
        		int c;
        		if(a>b)
        		{
        			c=a-b;
        		}
        		else 
        		{
        			c=b-a;
        		}
        		return c;	
        		}
        
        public static int multiplication (int a,int b) {
        	int result= a*b;
        	return result;
        }
        public static float division (float a,float b) {
        	float result= a/b;
        	return result;
        }
        
	public static void main(String[] args) {
	
		int choice,num1,num2,res;
		Float num3,num4,result;
		Scanner sc = new Scanner(System.in);
		do {
        System.out.println("which operation you want to perform");
        System.out.println("1)addition\n2)subtration\n3)multiplication\n4)division\n5)Exit");
        choice=sc.nextInt();
        switch(choice){
        	case 1:
        
        	 System.out.println("Enter First No.:");
        	 num1 = sc.nextInt();
        	 System.out.println("Enter Second No.:");
        	 num2 = sc.nextInt();
        	 res = Calculator.addition(num1,num2);
        	 System.out.println("Addition result is:"+res);
        	 break;
        case 2:
        		 System.out.println("Enter First No.:");
            	 num1 = sc.nextInt();
            	 System.out.println("Enter Second No.:");
            	 num2 = sc.nextInt();
            	 res = Calculator.subtraction(num1,num2);
            	 System.out.println("subtraction result is:"+res);
            	 break;
        	 case 3:
        		 System.out.println("Enter First No.:");
            	 num1 = sc.nextInt();
            	 System.out.println("Enter Second No.:");
            	 num2 = sc.nextInt();
            	 res = Calculator.multiplication(num1,num2);
            	 System.out.println("multiplication result is:"+res);
            	 break;
        	 case 4:
        		 System.out.println("Enter First No.:");
            	 num3 = sc.nextFloat();
            	 System.out.println("Enter Second No.:");
            	 num4 = sc.nextFloat();
            	 result = Calculator.division(num3,num4);
            	 System.out.println("division result is:"+result);
            	 break;
        	 case 5:
        		 System.exit(0);
        	 }
            
		}while(choice != 5);
        }	 
        
        }
	


