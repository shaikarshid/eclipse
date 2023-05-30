package ThrowableClass;

public class GetMessage 
{

	public static void main(String[] args) 
	{
		try {
			System.out.println(10/0);
		}
		catch (Exception e) {
		
			System.out.println(e.getMessage());
		}
	}
	
	
	
}
// throwable class lo 2 methos unnai 
//1: getmessage()
//2; printStackTrance()
