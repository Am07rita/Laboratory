package Array;

import java.util.Scanner;

public class Arrayexample 
{
	public static void main(String[] args) 
	{
	//creating an array in compile time
		int arr[]= {1,2,3,7,8,9};
	    String name[]= {"Amrita","Kajal","Shristy"};
	    char c[]= {'a','g','h','v'};
   //index value printing
	   System.out.println(arr[5]);
	   System.out.println(name[2]);
	   System.out.println(c[3]);
   //length of array printing
	   System.out.println(name.length);
	   System.out.println(arr.length);
	   System.out.println(c.length);
   //printing the values of an array using for loop 
	   for (int i=0;i<name.length;i++) 
	   {
		System.out.println(name[i]);
	   }
	   for (int i=0;i<c.length;i++) 
	   {
		System.out.println(c[i]);
	   }
	   
	   Scanner sc=new Scanner(System.in);
	   int arr1[]=new int[6];
	   
		System.out.println("Enter the array");
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
		}	
		
			System.out.println("printing using for loop");
		   for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]) ;  
		   }
		   System.out.println("printing using for-each loop");
	for(int var:arr1) {
		System.out.println(var);
	}
	}
}
