package extra;

import java.util.LinkedList;
import java.util.Queue;

public class 큐 {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(5);
		q.offer(2);
		q.offer(3);
		q.offer(7);
		q.poll();
		q.offer(1);
		q.offer(4);
		q.poll();
		
		while (!q.isEmpty()) {
			System.out.println(q.poll()+" ");

		}
		
		byte a=50;
		int b;
		b=(int)a;
		System.out.println(b);
	}

}
