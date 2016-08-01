import java.util.LinkedList;
import java.util.Queue;

class MyStack {
	Queue<Integer> q1 = new LinkedList<Integer>();
	Queue<Integer> q2 = new LinkedList<Integer>();

	public void push(int x) {
		q1.offer(x);
	}

	public void pop() {
		while (q1.size() != 1)
			q2.offer(q1.poll());
		q1.poll();
		while (!q2.isEmpty())
			q1.offer(q2.poll());
	}

	public int top() {
		int res = 0;
		while (!q1.isEmpty()) {
			res = q1.peek();
			q2.offer(q1.poll());
		}
		while (!q2.isEmpty())
			q1.offer(q2.poll());
		return res;
	}

	
	public boolean empty() {
		return q1.isEmpty();
	}
}
