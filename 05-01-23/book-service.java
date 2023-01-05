package Bookmanagementsystem;

import java.util.Scanner;

public class BookService {

	static Book book[]=new Book[10];
	static Scanner sc=new Scanner(System.in);
	static int index=0;
	
	//create book method
	public static void createBook()
	{
		System.out.println("Enter Book ID:");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Book Name:");
		String bname=sc.nextLine();
		
		System.out.println("Enter Author Name:");
		String author=sc.nextLine();
		
		System.out.println("Enter Book Price:");
		double price=sc.nextDouble();
		book[index]=new Book(id,bname,author,price);
		index++;
		System.out.println("Book Details Added!!!");
		System.out.println("-------------------------------------------");
	}
	
	//get all book details
	
	public static void getAllBookDetails()
	{
		for(int i=0;i<index;i++) 
		{
			System.out.println("Book ID: "+book[i].getBookId());
			System.out.println("Book Name: "+book[i].getBookName());
			System.out.println("Author Name: "+book[i].getAuthor());
			System.out.println("Book price: "+book[i].getBookPrice());
			System.out.println("-------------------------------------------");
		}
	}
	
	//get book details
	public static void getBookDetailsUsingId()
	{
		boolean flag=false;
		System.out.println("Enter book ID to seacrh");
		int id =sc.nextInt();
		for(int i=0;i<index;i++) 
		{
			if(id==book[i].getBookId()) 
			{
				System.out.println("Book ID:  "+book[i].getBookId());
				System.out.println("Book Name: "+book[i].getBookName());
				System.out.println("Author Name: "+book[i].getAuthor());
				System.out.println("Book price: "+book[i].getBookPrice());
				System.out.println("-------------------------------------------");
				flag=true;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("Book not found!!");
			
		}
	}
	//get book details using name
	
	public static void getBookDetailsUsingName()
	{
		boolean flag1=false;
		sc.nextLine();
		System.out.println("Enter book Name to seacrh");
		String bookname =sc.nextLine();
		for(int i=0;i<index;i++) 
		{
				if(bookname.equalsIgnoreCase(book[i].getBookName())) 
				{
				System.out.println("Book ID:  "+book[i].getBookId());
				System.out.println("Book Name: "+book[i].getBookName());
				System.out.println("Author Name: "+book[i].getAuthor());
				System.out.println("Book price: "+book[i].getBookPrice());
				System.out.println("-------------------------------------------");
				
				flag1=true;
				break;
			}	
		}
		if(flag1==false)
		{
			System.out.println("Book not found!!");
			System.out.println("-------------------------------------------");
			
		}
	}
}

