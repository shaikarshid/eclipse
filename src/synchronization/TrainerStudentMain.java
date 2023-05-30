package synchronization;

public class TrainerStudentMain {

	
	public static void main(String[] args) {
		
		
		Trainer t=new Trainer();
		
		Student s1=new Student("arshid", "java", t);
		Student s2=new Student("javeed", "sql", t);
		Student s3=new Student("bablu", "aws", t);
		Student s4=new Student("sravan", "It courses", t);
		
		
		s1.start();
		s2.start();
		s3.start();
		s4.start();
		
	}
}
