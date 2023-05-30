package Multithreading;

public class Demo1 
{
	public static void main(String[] args) {

		Thread t=new Thread();
		System.out.println("id:"+t.getId());
		System.out.println("name: "+t.getName());
		t.setName("yummy");
		System.out.println("name :"+t.getName());
		System.out.println("priority: "+t.getPriority());
		t.setPriority(9);
		System.out.println("Priority : "+t.getPriority());

		//set the name By using Constructor
		
		Thread t2=new Thread("yummy1");
		System.out.println("name: "+t2.getName());



// To achieve the multi-threading 
		//1: threadClasss
		// 2:runnable interface


















	}

}
