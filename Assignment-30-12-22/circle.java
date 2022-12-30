package Abstraction;
import java.util.Scanner;
public class Circle 
{
	final double pi=3.14;
	public double calculatearea(double pi,int r) 
{
	double area;
	area=pi*r*r;
	return area;
}
  public double circum(double pi,int r)
{
	double cir;
	cir=2*pi*r;
	return cir;
}

	public static void main(String[] args) {
		Circle circle =new Circle();
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the radius");
		int r=sc.nextInt();
		double result=circle.calculatearea(circle.pi, r);
		System.out.println("Area of circle:"+result);
		double circumference=circle.circum(circle.pi, r);
		System.out.println("Area of circumference:"+circumference);
	}

}
