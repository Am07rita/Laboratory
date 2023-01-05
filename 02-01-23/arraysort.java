package Array;
import java.util.Arrays;
public class Arraysort {

	public static void main(String[] args) {
		int a[]= {12,67,54,34,87};
		Arrays.sort(a);
		System.out.println("sorting elements:(ascending order)");
		for(int var: a) {
			System.out.println(var+"  ");
		}
	}
}
