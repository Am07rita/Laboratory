package oops;
class Employee
{
	int id;
	String name,city,country,state,designation;
    final int aadhar;
    long phone,salary;
    public Employee(int id,String name,String city,int aadhar)
	{
    	this.id=id;
    	this.name=name;
    	this.city=city;
    	this.aadhar=aadhar;
    	}
    public Employee(int id,String name,String city,int aadhar,String country,String state) 
    {
    this(id,name,city,aadhar);
    this.country=country;
	this.state=state;
    }
    public Employee(int id,String name,String city,int aadhar,String country,String state,String designation
    		,long salary,long phone) 
    {
    this(id,name,city,aadhar,state,country)	;
    this.designation=designation;
    this.salary=salary;
    this.phone=phone;
    }
    
    
    @Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", country=" + country + ", state=" + state
				+ ", designation=" + designation + ", aadhar=" + aadhar + ", phone=" + phone + ", salary=" + salary
				+ "]";
	}
	public void display() {
    	System.out.println("ID:"+id);
    	System.out.println("Name:"+name);
    	System.out.println("City:"+city);
    	System.out.println("Aadhar.:"+aadhar);
    	System.out.println("Country:"+country);
    	System.out.println("state.:"+state);
    	System.out.println("designation.:"+designation);
    	System.out.println("salary:"+salary);
    	System.out.println("phone.:"+phone);
    	
    	
    	}
    }
public class ConstructorOverloading {
    
	public static void main(String[] args) {
		Employee employee1 =  new Employee (1,"Amrita","Ranchi",9877664);
		//employee1.display();
		System.out.println(employee1);
		System.out.println();
		Employee employee2 = new Employee(2,"Kajal","Bokaro",9877664,"India","Jharkhand");
		//employee1.display();
		System.out.println(employee2);
		System.out.println();
		Employee employee3 = new Employee(3,"Shristy","Jamshedpur",78544,"India","Jharkhand");
		System.out.println(employee3);
	}

}
