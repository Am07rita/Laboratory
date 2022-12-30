package Array;
import java.util.Scanner;
public class Sumofevenodd 
{
	public static void main(String[] args)
	{
	  Scanner Sc=new Scanner(System.in);
      System.out.println("Enter the size of array");
      int n=Sc.nextInt();//taking size of array during run time. 
      int a[]=new int[n];
      int sumE=0,sumO=0,countE=0,countO=0;
      System.out.println("Enter the elements of array");
      for(int i=0;i<a.length;i++) 
      {
      	a[i]=Sc.nextInt();
	 if(a[i]%2==0) {   //for even no.
    	countE++;
    	sumE=sumE+a[i];
    }
    else {  //for odd no.
    	countO++;
    	sumO=sumO+a[i];
    }
	}
	System.out.println("Total even numbers in given elements are: "+countE);
	System.out.println("Sum of even numbers are: "+sumE);
	System.out.println();
	System.out.println("Total Odd numbers in given elements are: "+countO);
	System.out.println("Sum of odd numbers are: "+sumO);
	}
}
