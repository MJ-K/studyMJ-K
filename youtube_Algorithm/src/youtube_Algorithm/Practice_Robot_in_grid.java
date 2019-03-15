package youtube_Algorithm;

import java.util.ArrayList;

//Dynamic programming

class Point{
	int row, col;
	
	public Point(int row, int col) {
		this.row = row;
		this.col = col;
	}
}

class Solution{
	public ArrayList<Point> findPath(boolean[][] grid){//false �ƹ��͵� ���� ĭ  ,true �� �� ���� ��
		if(grid ==null|| grid.length==0) return null;
		ArrayList<Point> path = new ArrayList<Point>();
		if(findPath(grid, grid.length-1, grid[0].length-1,path))//������ ���� ������ 
			return path;
		else return null; //false�� ���� ������ path�� ���°Ŵϱ� null��ȯ
	}
	private boolean findPath(boolean[][] grid, int row, int col, ArrayList<Point> path) {
		if(!isInRange(grid, row, col) || grid[row][col]) return false; //�ش� point �� grid�� ���� �ȿ� ���ų� ������ ���Ƴ��� ���̸� false��ȯ
		//��, ��ο� �߰��ϸ� �ȵǴ� ���
		if((row==0 && col==0)// goal(start point)
				|| findPath(grid, row, col-1, path) //go left�� �ǰų� //���ʿ��� ���� ���� ã���� ���� ������ �ɴ´�(or������)
				|| findPath(grid , row-1, col, path)) {//go up�� �ǰų�
			Point p = new Point(row, col);
			path.add(p);
			return true;
		}
		return false;
	}
	
	private boolean isInRange(boolean[][] grid, int row, int col) {
		return row>=0 && row<=grid.length-1
				&& col>=0 && col<=grid[row].length-1;
	}
}

public class Practice_Robot_in_grid {
	public static void main(String[] args) {
		boolean[][] grid = {
				{false, false, false, false},
				{false, false, false, true},
				{true, true, false, false},
				{false, false, false, false}
		};
		Solution sol = new Solution();
		ArrayList<Point> path = sol.findPath(grid);
		if(path != null)// null check
			for(Point p : path) 
				System.out.print(p.row + "" +p.col+" -> ");
	}
}
