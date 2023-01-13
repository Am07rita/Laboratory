package Batchapplication;

import java.util.Scanner;

public class BatchMain {

	public static void main(String[] args) {
	int choice,ch,c;
	Scanner sc=new Scanner (System.in);
	
	BatchService batch=new BatchService();
	System.out.println("Welcome to Anudip Foundation");
	do {
		System.out.println("Please choose which course you want to pursue: \n" 
	+"1)Java 2)AWS  3)Others  4)Exit");
	choice=sc.nextInt();
		 switch(choice) 
		 {
		 case 1:
			 System.out.println("------JAVA-----");
			 System.out.println("1) Enter student Info\n2)Show Student Info\n "
					+"3)Update Student Info");
			ch=sc.nextInt();
			 switch(ch) {
			 case 1:
				 batch.javastudentInfo();
				 System.out.println();
				 break;
			 case 2:
				 batch.getAllJavaStudentDetails();
				 System.out.println();
				 break;
			 case 3:
				 batch.updateJavaStudentInfo();
				 System.out.println();
				 break;
			 default:
				 System.out.println("Wrong choice!!!");
				 }
			 break;
		 case 2:
			 System.out.println("-----------AWS------------");
			 System.out.println("1) Enter student Info\n2)Show Student Info\n "
						+"3)Update Student Info");
			 c=sc.nextInt();
			 switch(c) {
			 case 1:
				 batch.AWSStudentInfo();
				 System.out.println();
				 break;
			 case 2:
				 batch.getAllAWSStudentDetails();
				 System.out.println();
				 break;
			 case 3:
				 batch.updateAWSStudentInfo();
				 System.out.println();
				 break;
			 }
		 case 3:
			 batch.search();
			 System.out.println();
			 break;
		 case 4:
				System.out.println("Thank you for visting!!");
				System.exit(0);
			default:
				System.out.println("wrong choice");
		 }
			 
	}while(true);

	}

}
