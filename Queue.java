
@SuppressWarnings("unchecked")
public class Queue<T> {
	T[] q;
	int front=0;
	int back=0;


	public Queue(int length) {
		q = (T[]) new Object[length];
	}

	public void put(T t) {
		if((back+1)%q.length==front%q.length) resize();
		q[back++%q.length]=t;
	}

	public T peek(int depth) {
		return q[(front+depth)%q.length];
	}
	
	public T get() {
		return q[front++%q.length];
	}

	public int size() {
		if(back>=front) return back - front;
		return q.length - front + back;
	}

	public void resize() {
		System.out.println("resize");
		Queue<T> q2 = new Queue<T>(q.length*10);
		while(this.size()>0) {
			q2.put(this.get());
		}
		this.q = q2.q;
		this.front = q2.front;
		this.back = q2.back;
	}
	
	//test for queue:
	public static void main(String[] args) {
		Queue q = new Queue(10);
		for (int i = 0; i < 15; i++) {
			System.out.println("size: " + q.size());
			q.put(i);
		}
	}
}
