package Array;

import java.util.Scanner;

public class Arraydeletionpos {

	public static void main(String[] args) {
		int a[]=new int[20];
		int ele,pos,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("How many elements you want to enter");
		ele=sc.nextInt();
		
		System.out.println("Enter "+ele+" elements:");
		for(i=0;i<ele;i++) {
			a[i]=sc.nextInt();		
	}
	//printing the elements before deletion
		System.out.println("Array before deletion");
		for(i=0;i<ele;i++) {
			System.out.println(a[i]+" ");
	}
	System.out.println();
	System.out.println("Enter the position from where you want to delete");
	pos=sc.nextInt();
	
	//checking if the position is valid or not
	if(pos>=ele+1 || pos<0) {
		System.out.println("Invalid position");
	}
	else {
		//removing the elements from the position and also shifting the elements in its right position
	for(i=pos-1;i<ele;i++) 
	{
		a[i]=a[i+1];
	}
	//decrementing the size
	ele--;
	
	
	System.out.println("Array after deletion");
	for(i=0;i<ele;i++) {
		System.out.println(a[i]+ " ");
	}
	System.out.println();
	}
	}
}
