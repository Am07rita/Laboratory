package java8features;
interface sayable1
{
	//void message();
	//String msg;
	int addition (int a,int b);
}
public class Lambdaexpressiondemo {
	public static void main(String[] args) {
		
		//without using lambda expression
		
/*		sayable1 s=new sayable1() {

			@Override
			public void message() {
				System.out.println("Hello java");
			}
		};
		s.message();

		sayable1 s= () ->System.out.println("Hello java!!");
		s.message();

		sayable1 s=() -> {
			return "we are learning java 8 features";
		};
		System.out.println(s.msg());
*/
		sayable1 s=(a,b)->(a+b);
		System.out.println("Addition: "+s.addition(5, 6));
		
		sayable1 s1=(int a,int b)->{
			return a+b;
		};
		System.out.println("Addition: "+s1.addition(5, 67));
	}
}
