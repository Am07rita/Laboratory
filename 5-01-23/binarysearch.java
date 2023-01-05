package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Binarysearch {

	public static void main(String[] args) {
		int arr[]=new int[5];
		Scanner sc=new Scanner (System.in);
		Arrays.sort(arr);
		System.out.println("Enter the elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the elements to search");
		int ele=sc.nextInt();
		int result=Arrays.binarySearch(arr, ele);
		if(result>=0)
		{
			System.out.println("Elements present in position: "+(result+1));
		}
		else
		{
			System.out.println("Elements not found");
		}
	}

}
