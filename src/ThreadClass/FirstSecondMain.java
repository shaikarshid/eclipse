package ThreadClass;

//By Extending ThreadClass -.> ex:1
public class FirstSecondMain 
{
	public static void main(String[] args) 
	{
		FirstThread f=new FirstThread();
		SecondThread s=new SecondThread();

		f.start();
		s.start();


	}

}
