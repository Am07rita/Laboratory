package Abstraction;

interface Printable{//first interface
	
	int x=100;
	public void display();
	void fun();
}
interface drawable extends Printable{//second interface
	void draw();
}
//third interface
//interface using without extends or implements can access all methods of its earlier interfaces. 
interface sayable{
	void say();
	int x=50;
}

class Print implements drawable{
//interface inherit interface using extends.
//class inherit class using extends.
//class inherit interface using implements.
	@Override
	public void display() {
		System.out.println("Hello");
		
	}

	@Override
	public void fun() {
		System.out.println("This is fun");
		
	}

	@Override
	public void draw() {
		System.out.println("Drawing is fun");
		
	}

	public void say() {
		
		System.out.println("Speaking is fun");
	}
	
}
class Message implements drawable,sayable{

	@Override
	public void display() {
		System.out.println("Hello");
		
	}

	@Override
	public void fun() {
		System.out.println("This is fun");
		
	}

	@Override
	public void say() {
		System.out.println("speaking is fun");
		
	}

	@Override
	public void draw() {
		System.out.println("Drawing is fun");
		
	}
	
}

public class InterfaceDemo {

	public static void main(String[] args) {
		Print print=new Print();//we cannot create object of interface.
		print.display();
		print.draw();
		print.fun();
		System.out.println("The value of x: "+drawable.x);
		
		System.out.println();
		Message message=new Message();
		print.display();
		print.draw();
		print.fun();
		print.say();
		System.out.println("The value of x: "+sayable.x);
		
	}

}
