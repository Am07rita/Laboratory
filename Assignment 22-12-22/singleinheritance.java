package Inheritence;
//parent class
class User{
	int id;
    String name;
	
    public void setData(int id,String Name) {
    	
    	this.id=id;
    	this.name=Name;
    	
    }
    public void display()
    {
    	System.out.println("ID:  "+id);
    	System.out.println("Name:  "+name);
    	
    } 
}


class Teacher extends User{
	
	double salary;
	String subject;
	 public void setData(int id,String Name,double salary,String subject) {
	    super.setData(id, Name);	
	    	this.salary=salary;
	    	this.subject=subject;
	    	
	    }
	 public void display()
	    {
		 super.display();//calling parent class set data
	    	System.out.println("Salary:  "+salary);
	    	System.out.println("Subject:  "+subject);
	    	
	    } 
}
public class Single_inheritence {

	public static void main(String[] args) {
		Teacher teacher1= new Teacher();
        teacher1.setData(101,"Amrita",10000,"English");
        Teacher teacher2= new Teacher();
        teacher2.setData(102,"Ria",30000,"Physics");
        teacher1.display();
        System.out.println("******************");
        teacher2.display();
	}

}
