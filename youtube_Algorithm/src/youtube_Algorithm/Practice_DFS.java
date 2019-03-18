package youtube_Algorithm;

import java.util.LinkedList;
import java.util.Stack;

import youtube_Algorithm.Queue;


class Graph{
	class Node{
		int data;
		LinkedList<Node> adjacent; //������ ��� 
		boolean marked;//��ȴ��� �ȵ�ȴ��� üũ
		
		public Node(int data) {
			this.data = data;
			this.marked = false;
			adjacent = new LinkedList<Node>();
		}
	}
	Node[] nodes; //������ ������ �迭
	
	Graph(int size){
		nodes= new Node[size];
		for(int i = 0;i<size;i++) {
			nodes[i]=new Node(i);//�׷��� ���� �� ��� ���� �� ����
		}
	}
	void addEdge(int i1, int i2) {// �γ���� ���� �����ϴ� �Լ�
		Node n1 = nodes[i1];
		Node n2 = nodes[i2];
		
		if(!n1.adjacent.contains(n2)) {
			n1.adjacent.add(n2);
		}
		if(!n2.adjacent.contains(n1)) {
			n2.adjacent.add(n1);
		}
		//�� ��忡 ���ΰ� �ִ��� Ȯ��. ���� ����
	}
	void dfs() {
		dfs(0);//default start value = 0
	}
	void dfs(int index) {
		Node root = nodes[index];//��� ����?
		Stack<Node> stack = new Stack<Node>(); //dfs�� stack��� 
		stack.push(root);  //���� ��带 ���ÿ� �߰�
		root.marked = true; //stack�� ���ٰ� üũ
		
		while(!stack.isEmpty()) {//������ �� �� ����
			Node r = stack.pop();//�ϳ� �̾Ƴ���
			for(Node n : r.adjacent) {//�̾Ƴ� �� ������ �� �ֱ� 
				if(n.marked== false) {//���ÿ� �߰����� ���� ���鸸 �߰� �� üũ
					n.marked=true; //��ŷ
					stack.push(n);// �߰�
				}				
			}
			visit(r);//�׸��� ���(pop�� ��)
		}
	}
	
	///// bfs
	void bfs() {
		bfs(0);
	}
	void bfs(int index) {
		Node root = nodes[index];// ������
		Queue<Node> queue = new Queue<Node>(); // bfs�� Queue�߽� 
		queue.add(root);
		root.marked = true;
		

		while(!queue.isEmpty()) {
			Node r = queue.remove();
			for(Node n : r.adjacent) {
				if(n.marked== false) {//���ÿ� �߰����� ���� ���鸸 �߰� �� üũ
					n.marked=true;
					queue.add(n);
				}				
			}
			visit(r);//�׸��� ���(pop�� ��)
		}
	}	
	
	//recursioni dfs
	
	void dfsR(Node r) {// ���ȣ�� �� , ��ũ�帮��Ʈ�� ����� �ּҸ� ������ �ֱ� ������ ��带 �޴� ���°� �Ǿ�� �Ѵ�.
		if (r  ==null) return;
		r.marked = true;
		visit(r); //�ڽĵ��� ȣ���ϱ� ���� �����͸� ����ϰ�
		
		for(Node n : r.adjacent) {
			if(n.marked== false) {
				dfsR(n);// ȣ���� ���� ���� �ڽĵ��� ȣ���մϴ�.
			}
		}
	}
	
	void dfsR(int index) {//index�� ������ �ش� ��带 ã�Ƽ� �ش� ��带 �������� ���ȣ���� �����մϴ�.
		Node r = nodes[index];
		dfsR(r);
	}
	void dfsR() {
		dfsR(0);
	}
	
	//print method 
	void visit(Node n) {
		System.out.print(n.data+" ");
	}
}

public class Practice_DFS {
	public static void main(String[] args) {
		Graph g = new Graph(9);
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(1, 3);
		g.addEdge(2, 4);
		g.addEdge(2, 3);
		g.addEdge(3, 4);
		g.addEdge(3, 5);
		g.addEdge(5, 6);
		g.addEdge(5, 7);
		g.addEdge(6, 8);
		
		//g.dfs(); 
		//g.bfs();
		//g.dfsR();
		g.dfs(3);
	}
}
