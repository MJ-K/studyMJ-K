package practice;

import java.util.LinkedList;

class Graph{
	class Node{
		int data;//����
		LinkedList<Node> adj; //���� "���" ���� ��ũ�帮��Ʈ
		boolean marked; //�鷶�� �ȵ鷶�� üũ
		
		public Node(int item) {
			this.data = item;
			adj = new LinkedList<Node>();
			marked = false;
		}
	}
	
	Node[] node; //"���" ���� �迭
	
	Graph(int size) {
		node= new Node[size];
		
		for(int i = 0;i<size;i++) {
			node[i] = new Node(i);// ���� �迭�� "���"�� ����.
		}
	}
	
	public void addEdge(int i1, int i2) {
		Node n1 = node[i1]; //�ش� �ε����� ����  node�� �̾Ƴ���
		Node n2 = node[i2];
		
		if(!n1.adj.contains(n2)) {//n1�� n2�� �����ϰ� ������ ���� ���� �� �߰�
			n1.adj.add(n2);
		}
		if(!n2.adj.contains(n1)) {//���� ����
			n2.adj.add(n2);
		}
	}
	
	public void dfs() {
		dfs(0); //�⺻�� 0���� ����
	}
	public void dfs(int index) {
		Node root = node[index];//root node
		Stack<Node> stack = new Stack<Node>();//dfs�� ���ñ��
		stack.push(root);
		root.marked = true;
		
		while(!stack.isEmpty()) {
			Node n = stack.pop(); //�̾Ƴ���
			for(Node r : n.adj) { //�̾Ƴ� �� �����Ѱ� �ְ� ��ŷ
				if(r.marked == false) {
					r.marked = true;
					stack.push(r); //������ �� �ֱ�
				}
			}
			visit(n); // �� ó�� ���� ���� ���
		}
	}
	
	public void bfs() {
		bfs(0);
	}
	
	public void bfs(int index) {
		Node root = node[index];
		Queue<Node> queue= new Queue<Node>();
		queue.add(root);
		root.marked = true;
		
		while(!queue.isEmpty()) {
			Node n = queue.remove();
			for(Node r: n.adj) {
				if(r.marked == false) {
					r.marked = true;
					queue.add(r);
				}
			}
			visit(n);
		}
	}
	
	public void dfsR(Node root) {
		if(root == null) return;
		root.marked = true;
		visit(root);//��Queue������ �ʿ䵵 �����ٰ��Ѵ�.
		
		for(Node n : root.adj) {
			if(n.marked == false){
				dfsR(n);
			}
		}
	}
	
	public void dfsR(int index) {
		Node n = node[index];
		dfsR(n);
	}
	
	public void visit(Node n) {
		System.out.print(n.data+" , ");
	}
}

public class Practice_DFS_BFS_DFSR {
	
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
		
		g.dfs();
	}
}
