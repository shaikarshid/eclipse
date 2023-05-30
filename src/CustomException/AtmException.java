package CustomException;

public class AtmException extends RuntimeException {

	private String message;

	AtmException(String message)
	{
		this.message=message;

	}
	@Override
	public String getMessage()
	{
		return message;
	}


}
