package practice;

import java.util.NoSuchElementException;

class Queue<T>{
	class Node<T>{
		private T data;
		private Node<T> next; //다음 것을 기약
		
		public Node(T data) {
			this.data = data;
		}
	}
	
	private Node<T> first; // FIFO를 위해 앞 뒤로 저장.(FIRST를 빼내야 하니까)
	private Node<T> last;
	
	public void add(T item) {
		// 서로간에 연결
		// 들어온 것
		Node<T> n = new Node<T>(item);
		
		if(last!=null) {
			last.next = n;//현재 라스트 뒤에 붙이기
		}
		
		last = n; //이제 n이 last
		
		if(first==null) {
			first = last;//만약 first가 없다면 first가 되야한다.
		}
	}
	
	public T remove() {
		if(first==null) {
			throw new NoSuchElementException();
		}
		T data = first.data;
		first = first.next;
			
		if(first==null) {
			last=null;
		}
		
		return data;
	}
	
	public T peek(){//다음 원소가 무엇인지 보기
		if(first==null) {
			throw new NoSuchElementException();
		}
		return first.data;
	}	
	
	public boolean isEmpty(){//비었는가 안비었는가 비엇으면 true
		return first == null; //null이면 true 
	}
	
	
}

public class Practice_Queue {
	public static void main(String[] args) {
		Queue<Integer> q = new Queue<Integer>();
		
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.peek());
		System.out.println(q.remove());
		System.out.println(q.isEmpty());
		System.out.println(q.remove());
		System.out.println(q.isEmpty());
	}
}
