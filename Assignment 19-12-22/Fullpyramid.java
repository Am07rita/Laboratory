package basic;

public class Fullpyramid {

	public static void main(String[] args) {
		int k=0;
		for(int i=1;i<=6;i++,k=0) {
        for(int j=1;j<=6-1;j++) {
        	System.out.println(" ");
        }
        	while(k!=2*i-1) {
        		System.out.print("* ");
        		k++;
        	}
        	System.out.println();
	}
	}
}
