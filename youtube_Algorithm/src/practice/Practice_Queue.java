package practice;

import java.util.NoSuchElementException;

class Queue<T>{
	class Node<T>{
		private T data;
		private Node<T> next; //���� ���� ���
		
		public Node(T data) {
			this.data = data;
		}
	}
	
	private Node<T> first; // FIFO�� ���� �� �ڷ� ����.(FIRST�� ������ �ϴϱ�)
	private Node<T> last;
	
	public void add(T item) {
		// ���ΰ��� ����
		// ���� ��
		Node<T> n = new Node<T>(item);
		
		if(last!=null) {
			last.next = n;//���� ��Ʈ �ڿ� ���̱�
		}
		
		last = n; //���� n�� last
		
		if(first==null) {
			first = last;//���� first�� ���ٸ� first�� �Ǿ��Ѵ�.
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
	
	public T peek(){//���� ���Ұ� �������� ����
		if(first==null) {
			throw new NoSuchElementException();
		}
		return first.data;
	}	
	
	public boolean isEmpty(){//����°� �Ⱥ���°� ������� true
		return first == null; //null�̸� true 
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
