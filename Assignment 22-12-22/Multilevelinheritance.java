package Inheritence;
//in this level their is grandparent class,parent class,child class.

	class Animal{
		
		public void display() {
			System.out.println(" Animal Kingdom");
		}
	}
		class Mammal extends Animal{
			public void birth() {
			System.out.println ("Mammls gives birth to offspring");
		}
		
	}
	class Dog extends Mammal{
		public void puppy(){
			
			System.out.println ("Dogs gives birth to puppies");
			
		}
	
	}
	
	public class Multilevel {
		
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.puppy();
		dog.birth();
		dog.display();
		
	}
	}
	
