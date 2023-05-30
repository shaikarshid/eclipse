package Rough;

public class Person  extends Thread
{

	String name;
	String movie ;

	Netflix n;// has a relationship

	
	public Person(String name, String movie, Netflix n) {

		this.name = name;
		this.movie = movie;
		this.n = n;
	}


	@Override
	public void run()
	{
		n.watchingMovie(name,movie);
	}


}
