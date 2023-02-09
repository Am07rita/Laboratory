package Thursdaylab;
import java.util.Scanner;
public class Minimum_Maximum {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int s=0;
		System.out.println("Enter the size of array:");
		s=sc.nextInt();
		int a[]=new int[s];
		System.out.println("Enter the elements of array :");
		for(int i=0;i<=s;i++) {
			a[i]=sc.nextInt();
		}
		int max=a[0],min=a[0];
		for(int i=0;i<=s;i++) {
			if(max<a[i]) {
				max=a[i];
			}
			else if(min>a[i]) {
				min=a[i];
			}
		}
		System.out.println("Maximum no.in array is: "+max);
		System.out.println("Minimum no.in array is: "+min);
	}

}
