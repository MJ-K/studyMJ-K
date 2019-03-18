package youtube_Algorithm;

import java.util.LinkedList;
import java.util.Stack;

import youtube_Algorithm.Queue;


class Graph{
	class Node{
		int data;
		LinkedList<Node> adjacent; //인접한 노드 
		boolean marked;//들렸는지 안들렸는지 체크
		
		public Node(int data) {
			this.data = data;
			this.marked = false;
			adjacent = new LinkedList<Node>();
		}
	}
	Node[] nodes; //노드들을 저장할 배열
	
	Graph(int size){
		nodes= new Node[size];
		for(int i = 0;i<size;i++) {
			nodes[i]=new Node(i);//그래프 선언 시 노드 생성 및 저장
		}
	}
	void addEdge(int i1, int i2) {// 두노드의 관계 저장하는 함수
		Node n1 = nodes[i1];
		Node n2 = nodes[i2];
		
		if(!n1.adjacent.contains(n2)) {
			n1.adjacent.add(n2);
		}
		if(!n2.adjacent.contains(n1)) {
			n2.adjacent.add(n1);
		}
		//두 노드에 서로가 있는지 확인. 서로 연결
	}
	void dfs() {
		dfs(0);//default start value = 0
	}
	void dfs(int index) {
		Node root = nodes[index];//어디서 시작?
		Stack<Node> stack = new Stack<Node>(); //dfs는 stack기반 
		stack.push(root);  //현재 노드를 스택에 추가
		root.marked = true; //stack에 들어갔다고 체크
		
		while(!stack.isEmpty()) {//스택이 빌 때 까지
			Node r = stack.pop();//하나 뽑아내고
			for(Node n : r.adjacent) {//뽑아낸 것 인접한 것 넣기 
				if(n.marked== false) {//스택에 추가되지 않은 노드들만 추가 및 체크
					n.marked=true; //마킹
					stack.push(n);// 추가
				}				
			}
			visit(r);//그리고 출력(pop한 것)
		}
	}
	
	///// bfs
	void bfs() {
		bfs(0);
	}
	void bfs(int index) {
		Node root = nodes[index];// 시작점
		Queue<Node> queue = new Queue<Node>(); // bfs는 Queue중심 
		queue.add(root);
		root.marked = true;
		

		while(!queue.isEmpty()) {
			Node r = queue.remove();
			for(Node n : r.adjacent) {
				if(n.marked== false) {//스택에 추가되지 않은 노드들만 추가 및 체크
					n.marked=true;
					queue.add(n);
				}				
			}
			visit(r);//그리고 출력(pop한 것)
		}
	}	
	
	//recursioni dfs
	
	void dfsR(Node r) {// 재귀호출 시 , 링크드리스트가 노드의 주소를 가지고 있기 때문에 노드를 받는 형태가 되어야 한다.
		if (r  ==null) return;
		r.marked = true;
		visit(r); //자식들을 호출하기 전에 데이터를 출력하고
		
		for(Node n : r.adjacent) {
			if(n.marked== false) {
				dfsR(n);// 호출이 되지 않은 자식들을 호출합니다.
			}
		}
	}
	
	void dfsR(int index) {//index를 받으면 해당 노드를 찾아서 해당 노드를 시작으로 재귀호출을 진행합니다.
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
