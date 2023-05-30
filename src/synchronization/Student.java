package synchronization;

public class Student extends Thread {

	String name;
	String question;

	Trainer t;// has a relationship

	Student(String name, String question, Trainer t) {

		this.name = name;
		this.question = question;
		this.t = t;
	}
	@Override
	public void  run()
	{
		t.askQuestion(name, question);
	}



}
