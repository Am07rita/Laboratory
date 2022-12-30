package Array;

import java.util.Scanner;

public class Arraysum 
{
	public static void main(String[] args) 
	{
		//int a[]=new int[4];
        //int sum=0;
        Scanner sc= new Scanner (System.in);//creating object of scanner.
        System.out.println("Enter the size of array");
        int s=sc.nextInt();//taking size of array during run time. 
        int a[]=new int[s];
        int sum=0;
        //taking input
        System.out.println("Enter the elements of array");
        for(int i=0;i<a.length;i++) 
        {
        	a[i]=sc.nextInt();
        }
        //finding sum
        for(int i=0;i<a.length;i++) 
        {
        	sum=sum+a[i];
        }
        System.out.println("The sum of array: "+sum);
	}
}
