package CustomException;

public class pornHub  extends RuntimeException
{
	private String message;
	 
	pornHub(String message )
	{
		this.message=message;
	}
	
	@Override
	public String getMessage()
	{
		return   message; 
	}
}
