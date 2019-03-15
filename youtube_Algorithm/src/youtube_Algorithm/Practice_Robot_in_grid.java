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
	public ArrayList<Point> findPath(boolean[][] grid){//false 아무것도 없는 칸  ,true 갈 수 없는 곳
		if(grid ==null|| grid.length==0) return null;
		ArrayList<Point> path = new ArrayList<Point>();
		if(findPath(grid, grid.length-1, grid[0].length-1,path))//시작은 최종 목적지 
			return path;
		else return null; //false면 둘이 만나는 path가 없는거니까 null반환
	}
	private boolean findPath(boolean[][] grid, int row, int col, ArrayList<Point> path) {
		if(!isInRange(grid, row, col) || grid[row][col]) return false; //해당 point 가 grid의 범위 안에 없거나 못들어가게 막아놓은 곳이면 false반환
		//즉, 경로에 추가하면 안되는 경우
		if((row==0 && col==0)// goal(start point)
				|| findPath(grid, row, col-1, path) //go left가 되거나 //왼쪽에서 먼저 길을 찾으면 위로 가지는 앉는다(or연산자)
				|| findPath(grid , row-1, col, path)) {//go up이 되거나
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
