package HashMap;

import java.util.HashMap;

public class Demo1 {
	public static void main(String[] args) {

		HashMap<String , Integer> m=new HashMap<>();
		
		m.put("arshid", 1);
		m.put("bhanu", 2);
		m.put("sravan", 3);
		m.put("bablu", 4);
		m.put("javeed", 4);
		m.put(null, 5);
		
		System.out.println(m);
		System.out.println(m.get(null));
		System.out.println(m.get("arshid"));
		
		System.out.println(m.containsKey("bablu"));
		System.out.println(m.containsValue(4));
		System.out.println(m.size());
		System.out.println(m.isEmpty());
		
		
		HashMap<String , Integer> m1=new HashMap<>();
	
		m1.put("new", 786);
		
		m1.putAll(m); //putAll & collection c also working
		
		System.out.println(m1);
		
	}
}
