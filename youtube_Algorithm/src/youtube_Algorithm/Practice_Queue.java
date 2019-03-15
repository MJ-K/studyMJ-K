package youtube_Algorithm;

import java.util.NoSuchElementException;

//enc utf-8

class Queue<T>{ // 큐는 first in first out FIFO 먼저들어온게 먼저 나간다. dfs에 사용 (깊이우선)
	class Node<T>{
		private T data;
		private Node<T> next; //뒤에 뭐가 있는지 알아야 함으로..
		
		public Node(T data) {
			this.data = data;//생성자에서 해당 변수를 받아서 내부변수에 저장합니다.
		}
	}
		
	private Node<T> last;
	private Node<T> first;
	
	public void add(T item) {
		
		Node<T> t = new Node<T>(item);
		
		if(last!=null) {
			last.next=t;//현재 last로 되어있는 것 next에 item노드 t 저장
		}
		last = t; //이제 t 가 last
		
		if(first==null) {
			first = last; // first가 없을 때는 같은 값을 할당
		}
	}
	public T remove() {
		if(first==null) {
			throw new NoSuchElementException();
		}
		T data = first.data; // 내보낼 데이터 백업
		first = first.next; //원래 first 의 다음 애를 이제 first로
		
		if(first == null) { // first가 비게되면 last도 비워줄 것
			last = null;
		}
		
		return data;
	}
	
	public T peek() {//다음에 오는 노드가 무엇인지만 보는 것
		if(first==null) {
			throw new NoSuchElementException();
		}
		return first.data;
	}
	public boolean isEmpty() {
		
		return first==null;
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
