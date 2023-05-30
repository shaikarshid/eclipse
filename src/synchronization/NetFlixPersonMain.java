package synchronization;

public class NetFlixPersonMain {

	
	 public static void main(String[] args) {
		
		 /** seperate hoone object karko uska reference ich bhej na */
		 
		 Netflix n=new Netflix();
	
		 
		 Person p=new Person("arshid",n);
		 Person p1=new Person("raja", n);
		 
		 p.start();
		 p1.start();
		 
	}
}
// rough package meybiii eke likohai 
//  hona katha cheak karle 