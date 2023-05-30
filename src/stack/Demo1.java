package stack;

import java.util.Stack;

public class Demo1 {
	public static void main(String[] args) {
		// last in first out
		//add: push()
		// remove : pop() ->

		Stack s=new Stack();
		s.push(1);
		s.push(2);
		s.push(null);
		s.push(1);
		s.push("java");
		
		System.out.println(s);


		System.out.println(s.pop());//java
		System.out.println(s.pop());//1
		System.out.println(s);//[1, 2, null]

		

	}
}// collection cis not working 
