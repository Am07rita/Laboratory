package Thursdaylab;

import java.util.Scanner;

public class Searchnumber {

	public static void main(String[] args) {
	int size,i;
    Scanner sc=new Scanner (System.in);
    int pos=-1;
    
    System.out.println("Enter the size of array");
    size=sc.nextInt();
    int ar[]=new int[size];
    System.out.println("Enter "+size+" elements");
    for(i=0;i<size;i++)
    {
    	ar[i]=sc.nextInt();
    }
    System.out.println("Entere the elements you want to search");
	int search=sc.nextInt();
	
	
	//searching the element
	for(i=0;i<size;i++)
	{
		if( ar[i]==search)
		{
			//flag= true;//if element is found setting flag to be true
			pos=i;
			break;
		}
	}
	if (pos!=-1)
	
	{

		System.out.println("The element "+search+" is present in:  "+(pos+1)+" position");
	}
	else
	{
		System.out.println("Data not found!!");
	}
	}

}
