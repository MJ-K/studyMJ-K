package practice;

import java.util.NoSuchElementException;

class Stack<T>{
	class Node<T>{
		T data;
		Node<T> next;
		
		public Node(T data) {
			this.data = data;
		}
	}
	
	private Node<T> top; // LIFO 마지막만 알면 된다 넣고 빼는게 전부 last에 집중
	
	public void push(T item) {
		Node<T> n = new Node(item);
		///★
		n.next = top;//다음으로 뽑아질 것을 next로 두는건데 LIFO라 지금 
					//들어오는게 탑이 되고 그 다음것이 다음에 빠져 나올 것이 된다.
					//FIFO라면 last.next = n 이후에 last = n이렇게 될 것이다. 어차피
					//first를 뽑아내느 형식이라 들어오는 것이 존재하는 것 뒤에 와야하기 때문이다.
		top = n;
	}
	
	public T pop() {
		if(top==null) {
			throw new NoSuchElementException();
		}
		T data = top.data;
		top = top.next;
		
		return data;
	}
	
	public T peek() {
		if(top==null) {
			throw new NoSuchElementException();
 		}
		return top.data;
	}
	
	public boolean isEmpty() {
		return top==null;
	}
}

public class Practice_Stack {
	public static void main(String[] args) {
		
	}
}
