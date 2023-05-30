package SingleTonClass;

public class Account {
	
	int accNum=77;
	String accName="sravan";
	
	private static Account a;
	
	private Account()
	{
		System.out.println("account  object created ");
	}
		
	public static Account getInstance()
	{
		if(a==null)
		{
			a=new Account();
		}
		else
		{
			System.out.println(" already object  creted");
		}
		return a;
	}
	
	

}
