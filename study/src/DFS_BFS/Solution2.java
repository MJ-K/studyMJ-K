package DFS_BFS;

import java.util.LinkedList;
import java.util.Stack;

class Network{
	class Computer{
		int data;
		LinkedList<Computer> adj;
		boolean marked;
		public Computer(int data) {
			this.data = data;
			this.adj = new LinkedList<Computer>();
			marked = false;
		}
	}
	Computer[] computers;
	
	Network(int comNum) {
		computers = new Computer[comNum];
		for(int i=0;i<comNum;i++) {
			computers[i] = new Computer(i);
		}
	}
	
	public void setedge(int[][] node) {
		int i =0;
		int j =1;
		
		for(int a = 0;a<node.length;a++) {
			Computer c1 = computers[i];
			Computer c2 = computers[j];
			
			if(node[i][j] == 1&& node[j][i]==1) {
				if(!c1.adj.contains(c2)) {
					c1.adj.add(c2);
				}
				if(!c2.adj.contains(c1)) {
					c2.adj.contains(c1);
				}
			}
		}
	}
	public void dfs(){
		Computer root = computers[0];
		Stack<Computer> stack = new Stack<Computer>();
		stack.push(root);
		root.marked = true;
		
		while(!stack.isEmpty()) {
			Computer r = stack.pop();
			for(Computer n : r.adj) {
				if(n.marked==false) {
					stack.push(n);
					n.marked= true;
				}
			}
			System.out.print(r.data+" ");
		}
	}
}

public class Solution2 {

	
	public int solution(int n, int[][] computers) {
        int answer = 0;
        
        
        return answer;
    }
    public static void main(String[] args) {
		int n = 3;
		int[][] computers = {{1,1,0},{1,1,0},{0,0,1}};
		
		
		
	}
}
