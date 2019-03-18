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
	
	private Node<T> top; // LIFO �������� �˸� �ȴ� �ְ� ���°� ���� last�� ����
	
	public void push(T item) {
		Node<T> n = new Node(item);
		///��
		n.next = top;//�������� �̾��� ���� next�� �δ°ǵ� LIFO�� ���� 
					//�����°� ž�� �ǰ� �� �������� ������ ���� ���� ���� �ȴ�.
					//FIFO��� last.next = n ���Ŀ� last = n�̷��� �� ���̴�. ������
					//first�� �̾Ƴ��� �����̶� ������ ���� �����ϴ� �� �ڿ� �;��ϱ� �����̴�.
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
