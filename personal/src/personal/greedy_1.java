package personal;

public class greedy_1 {
	public static void main(String[] args) {
		int money = 1000 - 200; 
		int[] array = {500,100,50,10,5,1}; 
		int idx = 0; int ans = 0; while(money != 0) 
		{ 
			int change = money / array[idx];
			System.out.println(array[idx] +" : "+change +"°³");
			money -= change * array[idx++]; 
			ans += change; 
			
		} 
		System.out.println(ans);

	}
}
