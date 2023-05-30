package Rough;

public class NetperMian {
	public static void main(String[] args) {
		
		
		
		
		Netflix n= new Netflix();
		
		Person p=new Person("arshid","jalsa", n);
		Person p1= new Person("baBLU"," dukudu", n);
		p.start();
		p1.start();

	}

}
