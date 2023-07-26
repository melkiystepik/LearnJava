package learnJavaAtPrison;
import java.util.PriorityQueue;
public class PriorityQueueOffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue <String> pq1 = new PriorityQueue<String>();
		
		pq1.add("Red");
		pq1.add("Orange");
		pq1.add("Yellow");
		pq1.add("Green");
		
		System.out.println(pq1);

		pq1.offer("Blue");
		
		System.out.println(pq1);
	}

}
