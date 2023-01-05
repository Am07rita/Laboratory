package Array;

public class Arraydescending {

	public static void main(String[] args) {
		int b[]= {45,76,34,78,12,14};
		int temp=0;
		System.out.println("original array");
		for(int i=0;i<b.length;i++) 
		{
			System.out.println(b[i]+" ");
		}
		System.out.println();
		for(int i=0;i<b.length;i++)
		{
		for(int j=i+1;j<b.length;j++)
		{
			if(b[i]<b[j])
			{
				temp=b[j];
				b[i]=b[j];
				b[j]=temp;
			}
		}
		}
		System.out.println("Sorted array:(descending order)");
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]+" ");
		}
	}
}

