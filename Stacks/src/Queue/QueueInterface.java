package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInterface {

	public static void main(String[] args) {
		Queue<Integer> q= new LinkedList<>();
		q.add(15);
		q.add(25);
		q.add(18);
		q.remove(25);
		System.out.println(q.element());

	}

}
