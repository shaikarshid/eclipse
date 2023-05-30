package String;

public class CompleteString {
	public static void main(String[] args) {

		//String classs
		String s=new String("java");
		String s1=new String ("programming");
		
		System.out.println(s);//toString()
		System.out.println(s.hashCode());
		System.out.println(s1.equals(s));
		
		System.out.println(s+s1);//concatination
		
		
		//String Buffer
		StringBuffer sb= new StringBuffer("hello");
		sb.append("combined");
		System.out.println(sb);//toSTring()
		
		//StringBuilder
		StringBuilder sB=new StringBuilder(" STRING");
		sB.append("bUILDER");
		System.out.println(sB);
		
		
	}
}
