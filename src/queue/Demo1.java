package queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Demo1 {
	public static void main(String[] args) {



		Queue<Integer> q=new PriorityQueue();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(3);
		q.add(4);

		System.out.println(q);//[1, 2, 3, 3, 4]

//		System.out.println(q.peek());//1
//		System.out.println(q);[1, 2, 3, 3, 4]
		
		/** peek and element both are similar when que is full*/
		
//		System.out.println(q.element());//1
//		System.out.println(q);//[1, 2, 3, 3, 4]
		
	
//		System.out.println(q.remove(4));//true
//		System.out.println(q);//[1, 2, 3, 3]

		
//		System.out.println(q.poll());//1
//		System.out.println(q);//[2, 3, 3, 4]
		
	
	}
}
