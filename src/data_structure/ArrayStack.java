package data_structure;

import java.util.Arrays;
import java.util.EmptyStackException;

import org.junit.Test;



public class ArrayStack {
	private Object[] elementData;
	private int top;
	private int size;
	
	public ArrayStack(){
		this.elementData = new Object[10];
		this.top = -1;
		this.size = 10;
	}
	
	public ArrayStack(int initialCapacity) {
		if(initialCapacity < 0) {
			throw new IllegalArgumentException("Õ»³õÊ¼ÈÝÁ¿²»ÄÜÐ¡ÓÚ0"+initialCapacity);
		}
		this.size = initialCapacity;
		this.elementData = new Object[initialCapacity];
	}
	
	public Object push(Object item) {
		//ÊÇ·ñÐèÒªÀ©ÈÝ
		isGrow(top+1);
		elementData[++top] = item;
		return item;
	}
	
	public boolean isGrow(int minCapacity) {
		int oldCapacity = size;
		if(minCapacity >= oldCapacity) {
			int newCapacity = 0;
			if((oldCapacity << 1) - Integer.MAX_VALUE > 0) {
				newCapacity = Integer.MAX_VALUE;
			}else {
				newCapacity = (oldCapacity << 1);
			}
			this.size = newCapacity;
			elementData = Arrays.copyOf(elementData, size);
			return true;
		}else
			return false;
	}
	
	public Object pop() {
		Object obj = peek();
		remove(top);
		return obj;
	}
	
	public Object peek() {
		if(top == -1) {
			throw new EmptyStackException();
		}
		return elementData[top];
	}
	
	public void remove(int top) {
		elementData[top] = null;
		this.top--;
	}
	
	public boolean isEmpty() {
		return (top==-1);
	}


	
	public static void main(String[] args) {
		//Õ»µÄ²âÊÔ
//		ArrayStack mystack = new ArrayStack(3);
//		mystack.push(1);
//		System.out.println(mystack.peek());
//		mystack.push(2);
//		mystack.push(3);
//		mystack.push("111");
//		System.out.println(mystack.peek());
//		mystack.pop();
//		mystack.pop();
//		mystack.pop();
//		System.out.println(mystack.peek());
		
		//×Ö·û´®µ¹ÐðÊä³ö
//		ArrayStack mystack = new ArrayStack();
//		String str = "hello world";
//		char[] cha = str.toCharArray();
//		for(char c : cha) {
//			mystack.push(c);
//		}
//		while(!mystack.isEmpty()) {
//			System.out.print(mystack.pop());
//		}
		
		//Õ»µÄ²âÊÔ
//		@Test
//		public void testMyArrayStack() {
//			MyArrayStack mystack = new MyArrayStack(3);
//			mystack.push(1);
//			System.out.println(mystack.peek());
//			mystack.push(2);
//			mystack.push(3);
//			mystack.push("111");
//			System.out.println(mystack.peek());
//			mystack.pop();
//			mystack.pop();
//			mystack.pop();
//			System.out.println(mystack.peek());
//		}
		
		//×Ö·ûÆ¥Åä
		ArrayStack mystack = new ArrayStack(3);
		String str = "12<a[b{c}]>";
		char[] cha = str.toCharArray();
		for(char c : cha) {
			switch(c) {
			case '{':
			case '[':
			case '<':
				mystack.push(c);
				break;
			case '}':
			case ']':
			case '>':
				if(!mystack.isEmpty()) {
					char ch = mystack.pop().toString().toCharArray()[0];
					if((c=='}' && ch!= '{') || (c==']' && ch!= '[' )|| (c==')' && ch!= '(')) {
						System.out.println("Error:"+ch+"-"+c);
					}
				}
				break;
			default:
				break;
			}
		}
	}
	
	//×Ö·û´®µ¹ÐðÊä³ö
//	@Test
//	public void testStringReversal() {
//		ArrayStack mystack = new ArrayStack();
//		String str = "hello world";
//		char[] cha = str.toCharArray();
//		for(char c : cha) {
//			mystack.push(c);
//		}
//		while(!mystack.isEmpty()) {
//			System.out.print(mystack.pop());
//		}
//	}
	
	//×Ö·ûÆ¥Åä
//	@Test
//	public void testMatch() {
//		ArrayStack mystack = new ArrayStack(3);
//		String str = "12<a[b{c}]>";
//		char[] cha = str.toCharArray();
//		for(char c : cha) {
//			switch(c) {
//			case '{':
//			case '[':
//			case '<':
//				mystack.push(c);
//				break;
//			case '}':
//			case ']':
//			case '>':
//				if(!mystack.isEmpty()) {
//					char ch = mystack.pop().toString().toCharArray()[0];
//					if(c=='}' && ch!= '{' || c==']' && ch!= '[' || c==')' && ch!= '(') {
//						System.out.println("Error:"+ch+"-"+c);
//					}
//				}
//				break;
//			default:
//				break;
//			}
//		}
//	}

}

