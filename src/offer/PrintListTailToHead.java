package offer;

import java.util.Stack;


public class PrintListTailToHead {
	
	class Node{                         //内部类实现，定义链表结构
		public int data;
		public Node next;
		public Node(int data) {
			this.data = data;
	   }
		public Node() {
	   }
	}
	
	private Node head = new Node();
	
	public void add(int data) {          //添加链表结点
		Node node = new Node(data);

		Node temp = head;

		while (temp.next != null) {

			temp = temp.next;

		}

			temp.next = node;
	
	}
	
	public void TailToHead(Node head) {    //从尾到头倒着输出
		
		Stack<Node> stack = new Stack<Node>();
		Node temp = head;
		
		while(temp.next != null) {
			stack.push(temp.next);
			temp = temp.next;
		}
		
		while(!stack.isEmpty())
			System.out.println(stack.pop().data);
		}

	public static void main(String[] args) {
		 PrintListTailToHead plr=new PrintListTailToHead();
		 //输入的链表的多个结点
		 plr.add(1);
		 plr.add(2);
		 plr.add(3);
         plr.TailToHead(plr.head);
	}
}
