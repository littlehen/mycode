package data_structure;

import org.junit.jupiter.api.Test;

public class LinkList {
	
	private Node head = new Node();
	private Node current;
	
	public void add(int data) {
		Node node = new Node(data);

		Node temp = head;

		while (temp.next != null) {

			temp = temp.next;

		}

			temp.next = node;
	
	}
	
	public void print(Node node) {
		if(node == null)
			return;
			current = node.next;
		while(current != null) {
			System.out.println(current.data);
			current = current.next;
		}
		
	}
	
	public void insert (int index,int data) {
		if(index < 1 || index > length()) {
			System.out.println("输入的位置不合法");
			return;
		}
		Node temp = head;
		int length = 1;
		while(temp.next !=null) {
			if(index == length) {
				Node node = new Node(data);
				node.next = temp.next;
				temp.next = node;
				return;
			}else {
				temp = temp.next;
				length++;
			}
		}
	}
	
	public int length() {
		int length = 0;
		Node temp = head;
		while(temp.next != null) {
			length++;
			temp = temp.next;
		}
		return length;
	}
	
	class Node{
		public int data;
		public Node next;
		public Node(int data) {
			this.data = data;
	   }
		public Node() {
	   }
	}
	
	@Test
	public void testSingleLinkedList() {
		LinkList linkList = new LinkList();
		for(int i = 1; i < 10;i++) {
			linkList.add(i);
		}
		
		//linkList.insert(1,4);
		linkList.print(linkList.head);
	}
	
//	public static void main(String args[]) {
//		LinkList linkList = new LinkList();
//		for(int i = 1; i < 10;i++) {
//			linkList.add(i);
//		}
//		
//		//linkList.insert(1,4);
//		linkList.print(linkList.head);
//	}

}
