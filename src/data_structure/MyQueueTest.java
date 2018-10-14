package data_structure;

public class MyQueueTest {
	public static void main(String args[]) {
		MyQueue myqueue = new MyQueue(3);
		myqueue.insert(1);
		myqueue.insert(2);
		myqueue.insert(3);
		System.out.println(myqueue.peekFront());
		myqueue.remove();
		System.out.println(myqueue.peekFront());
		myqueue.insert(4);
		myqueue.insert(5);
	}

}
