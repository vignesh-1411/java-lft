package OOP;
import java.util.*;

public class QueueDemo {
public static void main(String[] args) {
		
		Queue<Integer> q = new LinkedList<>();			//since queue is an interface we cant create obj for queue , so we use linked list
		
		//there's thing called priorityqueue check it out.
		
		q.add(3);
		q.add(10);
		q.add(1);
		q.add(8);
		
		System.out.println("Head is " + q.peek());
		
		System.out.println("Removed " + q.poll());		//can also use q.remove
		
		System.out.println("Head is " + q.peek());
		
		
	
	}

}
