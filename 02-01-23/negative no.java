package Array;
import java.util.Scanner;
public class NegativeNos
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of aaray:");
		int s=sc.nextInt();
		int a[]=new int[s];
		System.out.println("Enter the elements");
		for(int i=0;i<s;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println();
		System.out.println("Negative numbers are:");
		for(int i=0;i<s;i++)
		{
			if (a[i]<0)
			{
		System.out.println(a[i]+"  ");
	}
	}
	}
}
