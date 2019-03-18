package DFS_BFS;

public class Solution1 {
	  public int solution(int[] numbers, int target) {
	        int answer = 0;
	        answer = dfs(numbers, 0, 0, target);
	        return answer;
	    }
	    int dfs(int[] numbers, int n, int sum, int target) {
	        if(n == numbers.length) {
	            if(sum == target) {
	                return 1;
	            }
	            return 0;
	        }
	        return dfs(numbers, n + 1, sum + numbers[n], target) + dfs(numbers, n + 1, sum - numbers[n], target);
	    }
	  public static void main(String[] args) {
		int[] numbers = {1,1,1,1,1};
		int target = 3;
		
		System.out.println(new Solution1().solution(numbers, target));
	}
}
