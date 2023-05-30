package Rough;                      /// super statement 

class Demo1 {
	
	Demo1()
	{
		super();
		System.out.println("Demo1");
	}

}
class Demo2 extends Demo1{
	
	Demo2(int x)
	{
		super();
		System.out.println("Demo2");
		
		System.out.println(x);
	}
	
}
public class Demo3 extends Demo2
{
	Demo3()
	{
		super(20);
		System.out.println("Demo3");
	}
	
	public static void main(String[] args) {
		Demo3 d3=new Demo3();
		
	}
}
