package practice;

import java.util.LinkedList;

class Graph{
	class Node{
		int data;//현재
		LinkedList<Node> adj; //인접 "노드" 저장 링크드리스트
		boolean marked; //들렀나 안들렀나 체크
		
		public Node(int item) {
			this.data = item;
			adj = new LinkedList<Node>();
			marked = false;
		}
	}
	
	Node[] node; //"노드" 저장 배열
	
	Graph(int size) {
		node= new Node[size];
		
		for(int i = 0;i<size;i++) {
			node[i] = new Node(i);// 기존 배열에 "노드"들 저장.
		}
	}
	
	public void addEdge(int i1, int i2) {
		Node n1 = node[i1]; //해당 인덱스를 가진  node를 뽑아내기
		Node n2 = node[i2];
		
		if(!n1.adj.contains(n2)) {//n1이 n2를 인접하게 가지고 있지 않을 때 추가
			n1.adj.add(n2);
		}
		if(!n2.adj.contains(n1)) {//위와 동일
			n2.adj.add(n2);
		}
	}
	
	public void dfs() {
		dfs(0); //기본은 0부터 시작
	}
	public void dfs(int index) {
		Node root = node[index];//root node
		Stack<Node> stack = new Stack<Node>();//dfs는 스택기반
		stack.push(root);
		root.marked = true;
		
		while(!stack.isEmpty()) {
			Node n = stack.pop(); //뽑아내고
			for(Node r : n.adj) { //뽑아낸 것 인접한거 넣고 마킹
				if(r.marked == false) {
					r.marked = true;
					stack.push(r); //인접한 것 넣기
				}
			}
			visit(n); // 맨 처음 뽑은 것은 출력
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
		visit(root);//★Queue선언할 필요도 없었다고한다.
		
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
