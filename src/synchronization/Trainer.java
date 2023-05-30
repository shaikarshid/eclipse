package synchronization;

public class Trainer 
{
	
	synchronized void askQuestion(String name,String question)
	{
		System.out.println(name+" is asking a question what is "+question);
		
		
		try {
			Thread.sleep(2000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println(name+ " got the answer of"+question);
	}

}
