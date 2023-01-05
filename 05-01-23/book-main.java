package Bookmanagementsystem;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		BookService bservice=new BookService();
		do {
			System.out.println("WElcome to book management system");
			System.out.println("1)create book details\n"
					+"2)Get all book Details\n"
					+"3)Get book details using ID\n"
					+"4)Get book details using Name\n"
					+"5)Exit");
			
			System.out.println("=================================");
			System.out.println("Enter your choice:");
			
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				bservice.createBook();
				System.out.println();
				break;
			case 2:
				bservice.getAllBookDetails();
				System.out.println();
				break;
			case 3:
				bservice.getBookDetailsUsingId();
				System.out.println();
				break;
			case 4:
				bservice.getBookDetailsUsingName();
				System.out.println();
				break;
			case 5:
				System.out.println("Thank you for visting!!");
				System.exit(0);
			default:
				System.out.println("wrong choice");
				
			}
		}while(true);

	}

}
