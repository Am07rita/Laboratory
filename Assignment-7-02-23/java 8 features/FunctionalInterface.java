package java8features;

@FunctionalInterface
interface message{
	void say();
	//void walk();

	default void msg() 
	{
		System.out.println("Default with method body!!");
	}
	default void talk() 
	{
		System.out.println("Second default method");
	}
	//can contain  any no.of object class method
	int hashCode();
	String toString();
	boolean equals(Object obj);
}
public class FunctionalInterfacedemo implements message {

	@Override
	public void say() {
		System.out.println("Saying I'm back!!");
		
	}
	
	public static void main(String[] args) {
		 FunctionalInterfacedemo demo=new  FunctionalInterfacedemo();
		 demo.msg();
		 demo.talk();
		 demo.say();

	}
	}
/*Functional interface-an interface that contains only one abstract method is known as functional 
 * interface,it can have any no.of static ,default method but can only one abstract method.
 * can also declare method of object  class
 * it is also known as  single abstract  method
 */
