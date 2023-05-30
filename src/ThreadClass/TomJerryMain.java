package ThreadClass;
//youtube
//By Extending ThreadClass -.> ex:2
public class TomJerryMain {
	public static void main(String[] args) {


		Tom t=new Tom();
		Jerry j=new Jerry();
	
		j.start();
		t.start();

	

	}
}
