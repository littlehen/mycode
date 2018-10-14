package data_structure;


//˫������
public class DoublePointLinkedList {
	private Node head;
	private Node tail;
	private int size;
	
	public DoublePointLinkedList() {
		head = null;
		tail = null;
		size = 0;
	}
	
	private class Node{
       private Object data;//ÿ���ڵ������
       private Node next;//ÿ���ڵ�ָ����һ���ڵ������
       
       public Node(Object data){
    	   this.data = data;
       }
    }
	
	//����ͷ���ӽڵ�
	public void addHead(Object data){
		Node node = new Node(data);
		if(size == 0) {
			head = node;
			tail = node;
			size++;
		}else {
			node.next = head;
			head = node;
			size++;
		}
	}
	
	//����β���ӽڵ�
	public void addTail(Object data) {
		Node node = new Node(data);
		if(size == 0) {
			head = node;
			tail = node;
			size++;
		}
		else {
			tail.next = node;
			tail = node;
			size++;
		}
	}
	
	//ɾ��ͷ���ڵ�
	public boolean deleteHead() {
		if(size == 0)
			return false;
		if(head.next == null) {
			head = null;
			tail = null;
		}else{
			head = head.next;
		}
		size--;
		return true;
			
	}
	
	//�ж��Ƿ�Ϊ��
	public boolean isEmpty() {
		return (size == 0);
	}
	
	//�������Ľڵ����
	public int getSize() {
		return size;
	}
	
	//��ʾ�ڵ���Ϣ
	 public void display(){
		 if(size >0){
	            Node node = head;
	            int tempSize = size;
	            if(tempSize == 1){//��ǰ����ֻ��һ���ڵ�
	                System.out.println("["+node.data+"]");
	                return;
	            }
	            while(tempSize>0){
	                if(node.equals(head)){
	                    System.out.print("["+node.data+"->");
	                }else if(node.next == null){
	                    System.out.print(node.data+"]");
	                }else{
	                    System.out.print(node.data+"->");
	                }
	                node = node.next;
	                tempSize--;
	            }
	            System.out.println();
	        }else{//�������һ���ڵ㶼û�У�ֱ�Ӵ�ӡ[]
	            System.out.println("[]");
	        }
	 }

}
