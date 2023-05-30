package Rough;




class Super {

	int c=20;

	void work()
	{
		System.out.println("bakkar");
	}

}


public class Superante extends Super {

	

    int c=30;

	@Override
	void work()
	{
		int  c=70;
		super.work();// keyword
		System.out.println("working");
//		super.work();//key
		
		System.out.println(this.c);
		
		System.out.println(super.c);
		
		System.out.println(c);
		
	
	}

	public static void main(String[] args) {

		Superante t1=new Superante();
		t1.work();
		System.out.println(t1.c);
		
		
	

	}

}



