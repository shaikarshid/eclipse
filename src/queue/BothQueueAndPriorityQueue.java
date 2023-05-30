package queue;

import java.util.PriorityQueue;
import java.util.Queue;


public class BothQueueAndPriorityQueue
{
	public static void main(String[] args)
	{
		// queue  : first in first Out

		Queue q=new PriorityQueue();
		
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(2);

		System.out.println(q);
		

		//		Queue q=new PriorityQueue();
		//		q.add("java");
		//		q.add("javaTwo");
		//		q.add("javaThree");
		//
		//		q.add("javaThree");
		//
		//		System.out.println(q);

	}
}
// Only homogeneous data can be allowed ..
// null values can not be allowed .
// duplicated can be allowed 