package oops;
class Student1{
	int id;
	String name,address;
	long phone;
	static String institute="Anudip Foundation";
	//default constructor
	/*public Student1()
	{
	id=0;
	name=null;
	}*/
	//parameterized constructor
public Student1(int id,String name,String address,long phone) {
this.id=id;
this.name=name;
this.address=address;
this.phone=phone;
}
public void display() {
	System.out.println("ID:"+id);
	System.out.println("Name:"+name);
	System.out.println("Address:"+address);
	System.out.println("Mobile No.:"+phone);
	}
//static method
public static void changeInstituteName() {
	institute="Anudip Foundation social welfare";
}
}
public class ConstructorDemo {

	public static void main(String[] args) {
		Student1 student1=new Student1(1,"Amrita","Ranchi",9877664l);
		student1.display();
		System.out.println();
		student1.changeInstituteName();
		Student1 student2=new Student1(2,"Kajal","Bokaro",4667889977l);
		student2.display();
	}

}
