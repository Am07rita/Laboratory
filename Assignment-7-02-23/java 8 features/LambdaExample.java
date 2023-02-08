package java8features;

import java.util.ArrayList;

public class lambdaexample {

	public static void main(String[] args) {

/*  ArrayList <String> list=new ArrayList<String>();
   list.add("Amrita");
   list.add("Bishnu");
   list.add("Chinmayee");
   list.add("Harsad");
   //foreach method is available from java8
   list.forEach(
		   (m)->System.out.println(m)
		 );
*/
		//without lambda expression
		Runnable r=new Runnable() {

			@Override
			public void run() {
				System.out.println("Thread 1 is running!!");
				
			}
		};
		Thread t1=new Thread(r);
		t1.start();
		
		//using lambda  
		Runnable r1=()->{
			System.out.println("Thread 2 is running!!");
		};
		Thread t2=new Thread(r1);
		t2.start();
	}

}
