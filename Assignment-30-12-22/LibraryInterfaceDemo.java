package Abstraction;
interface Libraryuser{

	void registerAccount();
	void requestBook();
}
class KidUsers implements Libraryuser
{
	int age;
    String bookType;
	@Override
	public void registerAccount() {
			if(age<12) {
				System.out.println("You have successfully registered under a kids Account");
			}
			else {
				System.out.println("Sorry age must be less than 12 to register as a kid");
			}
	}

	@Override
	public void requestBook() {
		if(bookType.equalsIgnoreCase("kids")) {
			System.out.println("Book issued successfully.Please return the book within 10 days");
	}
		else {
			System.out.println("Oops,you are allowed to take kids books");
		}
}
}

class AdultUsers implements Libraryuser{
	int age;
	String bookType;
	@Override
	public void registerAccount() {
		if(age>12) {
			System.out.println("You have successfully registered under an Adult  Account");
		}
		else {
			System.out.println("Sorry age must be greater than 12 to register as an adult");
		}
	}
	@Override
	public void requestBook() {	
		
		if(bookType.equalsIgnoreCase("fiction"))
				 {
			System.out.println("Book issued successfully.Please return the book within 7 days");
	}
		else {
			System.out.println("Oops,you are allowed to take only adult fiction books");
		}
	}
}

public class LibraryInterfaceDemo {
	public static void main(String[] args) {
		KidUsers kid=new KidUsers();
		KidUsers kid1=new KidUsers();
		kid.age=10;
		kid1.age=18;
	    kid.registerAccount();
	    kid1.registerAccount();
	    kid.bookType="Kids";
	    kid1.bookType="Fiction";
	    kid.requestBook();
	    kid1.requestBook();
	    
	    System.out.println();
	    AdultUsers adult=new AdultUsers();
	    AdultUsers adult1=new AdultUsers();
		adult.age=5;
		adult.age=23;
	    adult.registerAccount();
	    adult1.registerAccount();
	    adult.bookType="Kids";
	    adult1.bookType="Fiction";
	    adult.requestBook();
	    kid1.requestBook();
	    
	}
}

