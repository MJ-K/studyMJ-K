package youtube_Algorithm;

import java.util.NoSuchElementException;

//enc utf-8

class Queue<T>{ // ť�� first in first out FIFO �������°� ���� ������. dfs�� ��� (���̿켱)
	class Node<T>{
		private T data;
		private Node<T> next; //�ڿ� ���� �ִ��� �˾ƾ� ������..
		
		public Node(T data) {
			this.data = data;//�����ڿ��� �ش� ������ �޾Ƽ� ���κ����� �����մϴ�.
		}
	}
		
	private Node<T> last;
	private Node<T> first;
	
	public void add(T item) {
		
		Node<T> t = new Node<T>(item);
		
		if(last!=null) {
			last.next=t;//���� last�� �Ǿ��ִ� �� next�� item��� t ����
		}
		last = t; //���� t �� last
		
		if(first==null) {
			first = last; // first�� ���� ���� ���� ���� �Ҵ�
		}
	}
	public T remove() {
		if(first==null) {
			throw new NoSuchElementException();
		}
		T data = first.data; // ������ ������ ���
		first = first.next; //���� first �� ���� �ָ� ���� first��
		
		if(first == null) { // first�� ��ԵǸ� last�� ����� ��
			last = null;
		}
		
		return data;
	}
	
	public T peek() {//������ ���� ��尡 ���������� ���� ��
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
