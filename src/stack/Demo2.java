package stack;

import java.util.Stack;

public class Demo2 {
	public static void main(String[] args) {


		Stack s=new Stack();
		s.push("java");
		s.push(null);
		s.push(30);
		s.push(30);


		System.out.println(s); //[java, null, 30, 30]

		System.out.println(s.pop());//30
		System.out.println(s.pop());//30
		System.out.println(s.pop());//null

		System.out.println(s);// [java]

		s.push("newone");

		System.out.println(s);//[java, new one]

		System.out.println(s.isEmpty());
		System.out.println(s.indexOf("java"));
		System.out.println(s.get(1));


		//----->

		Stack s2 =new Stack();
		
		// In stack :collection c is not working ex:[Stack s2 =new Stack(s);]
		s2.addAll(s);
		s2.push(" secondstack ");
		System.out.println(s2);
		s2.addAll(1, s);
		System.out.println(s2);
		

	}
}
