package synchronization;

public class Person extends Thread {
	
	String name;
	Netflix n;
	
	
	public Person(String name, Netflix n) {

		this.name = name;
		this.n = n;
	}


	@Override
	public void run()
	{
		n.watchingMovie(name);
	}
}
