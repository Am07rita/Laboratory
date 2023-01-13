package Batchapplication;

import java.util.Scanner;

public class BatchService {
	//CRUD-->create,read,update,delete
static Scanner sc=new Scanner(System.in);
static Java java[]=new Java[20];
static AWS aws[]=new AWS[20];
	static int id;
	static long phone;
	static String name,email;
	static int jindex=0;
	static int aindex=0;
	
	//student info taking java  course 
	public static void javastudentInfo() 
	{
		System.out.println("Enter Student id:");
		id=sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter Student Name:");
		name=sc.nextLine();
		
		System.out.println("Enter Student phone no.:");
		phone=sc.nextLong();
		
		sc.nextLine();
		System.out.println("Enter Student email:");
		email=sc.nextLine();
		
		java[jindex]=new Java(id,name,phone,email);
		jindex++;
		System.out.println("Student details added successfully!!!!");
	}
	//get java student details
	public static void getAllJavaStudentDetails() 
	{
		for(int i=0;i<jindex;i++) {
			System.out.println("Student Id: "+java[i].getStdId());
			System.out.println("Student Name: "+java[i].getStdName());
			System.out.println("Student Email: "+java[i].getEmail());
			System.out.println("Student  Phone No: "+java[i].getPhone());
			System.out.println("Course Name :JAVA");
			System.out.println("*************************");
		}
	}
	//update student info
	public static void updateJavaStudentInfo()
	{
		System.out.println("Enter Student ID:");
		id=sc.nextInt();
		for(int i=0;i<jindex;i++) 
		{
			if(id==java[i].getStdId())
			{
			System.out.println("Student Id to be updated: ");
			id=sc.nextInt();
			
			sc.nextLine();
			System.out.println("Student Name to be updated: ");
			name=sc.nextLine();
			
			System.out.println("Student phone to be updated: ");
			phone=sc.nextLong();
			sc.nextLine();
			
			System.out.println("Student Email to be updated: ");
			email=sc.nextLine();
			
			java[i]=new Java(id,name,phone,email);
			System.out.println("Updated Successfully!!!");
			System.out.println("*************************");
		}
		  else
		  {
			throw new StudentNotFoundException("Student Details not found!!");
		 }
	}
	}
	public static void AWSStudentInfo() 
	{
		System.out.println("Enter Student id:");
		id=sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter Student Name:");
		name=sc.nextLine();
		
		System.out.println("Enter Student phone no.:");
		phone=sc.nextLong();
		
		sc.nextLine();
		System.out.println("Enter Student email:");
		email=sc.nextLine();
		
		aws[aindex]=new AWS(id,name,phone,email);
		aindex++;
		System.out.println("Student details added successfully!!!!");
	}
	//get java student details
	public static void getAllAWSStudentDetails() 
	{
		for(int i=0;i<aindex;i++) {
			System.out.println("Student Id: "+aws[i].getStdId());
			System.out.println("Student Name: "+aws[i].getStdName());
			System.out.println("Student Email: "+aws[i].getEmail());
			System.out.println("Student  Phone No: "+aws[i].getPhone());
			System.out.println("Course Name :AWS");
			System.out.println("*************************");
		}
	}
	//update student info
	public static void updateAWSStudentInfo()
	{
		System.out.println("Enter Student ID:");
		id=sc.nextInt();
		for(int i=0;i<aindex;i++) 
		{
			if(id==aws[i].getStdId())
			{
			System.out.println("Student Id to be updated: ");
			id=sc.nextInt();
			
			sc.nextLine();
			System.out.println("Student Name to be updated: ");
			name=sc.nextLine();
			
			System.out.println("Student phone to be updated: ");
			phone=sc.nextLong();
			sc.nextLine();
			
			System.out.println("Student Email to be updated: ");
			email=sc.nextLine();
			
			aws[i]=new AWS(id,name,phone,email);
			System.out.println("Updated Successfully!!!");
			System.out.println("*************************");
		}
			 else
			  {
				throw new StudentNotFoundException("Student Details not found!!");
			 }	  
	}
	}
   public static void search() 
   {
	System.out.println("Enter the course:");
	String course=sc.nextLine();
	if(course.equalsIgnoreCase("Java") || course.equalsIgnoreCase("AWS")) 
	{
		System.out.println(" Course Found!!!");
	}
		else 
	{ 
		throw new  CourseNotFoundException ("Course Not Found!!");
	}
	}
}

