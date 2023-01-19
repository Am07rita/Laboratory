package Restaurant;

import java.util.ArrayList;
import java.util.Scanner;

public class Billing {
	
	static ArrayList<Bill> list = new ArrayList<Bill>();
	static Scanner sc = new Scanner(System.in);
	
	static void order(String fname, int amt)
	{
		System.out.println("Enter the quantity for "+fname+" :");
		int qty = sc.nextInt();
		list.add(new Bill(fname,qty,qty*amt));
		
	}
	
	static void cont()
	{
		System.out.println("Do you want to continue: y/n");
		char ch = sc.next().charAt(0);
		if(ch!='y' || ch!='n')
		{
			System.out.println();
			//print total bill
			totalbill();
			System.exit(0);
		}
		System.out.println();
	}
	static void totalbill() 
	{
		System.out.println("Bill");
		System.out.println("====");
		System.out.println("Items\t\tqty\tAmount");
		System.out.println("======================");
		double total = 0.0;
		for(Bill i: list)
		{
			System.out.println(i.fname+" "+i.qty+" "+i.amt);
			total = total + i.amt;
		}
		
		System.out.println();
		System.out.println("Amount:\tRs."+total);
		double gst = total*0.05;
		System.out.println("GST:\tRs."+gst);
		System.out.println("---------------");
		double famount = gst + total;
		System.out.println("Total:\tRs."+famount);
		//coupons
		System.out.println("--------------------------------");
		System.out.println("Do you have any coupons to apply: y/n");
		char c=sc.next().charAt(0);
		double pamnt;
		if(c=='y'||c=='Y')
		{
			System.out.println("Enter Coupon code in Alphabet: ");
			sc.nextLine();
			String cpon=sc.nextLine();
			if(cpon.equals("FIRST"))
			{
				pamnt=famount*0.5;
				System.out.println("You have to pay:Rs" +pamnt);
			}
			else if(cpon.equals("Swiggy")){
				pamnt=(famount-(famount*0.5));
				System.out.println("You have to pay:Rs "+pamnt);
			}
			else {
				System.out.println("Coupon is not valid............. ");
			}
		}
		else {
			System.out.println("Total amount to pay:Rs"+famount);
		}
	}
}

