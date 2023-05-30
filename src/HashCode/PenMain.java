package HashCode;

public class PenMain {
	public static void main(String[] args) {
		
		Pen p=new Pen(10,"cello");
	
		System.out.println(p.hashCode());
//		System.out.println(p.cost);
//		System.out.println(p.name);
		
		
		
	/** to string  override hua haito*/
		System.out.println(p);
	}
}
