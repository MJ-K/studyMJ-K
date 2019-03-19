package Full_Navigation;

public class Mock_exam {
	public static void main(String[] args) {
		int[] answers = {1,3,2,4,2,1,2,3,4,5};
		
		int[] answer = {};
		int[] howmany = new int[3];
		int[] result = new int[3];
		//int[] one = {1, 2, 3, 4, 5};//7
		//int[] two = {2, 1, 2, 3, 2, 4, 2, 5}; //3
		//int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};//3
		
		int[][] person = {{1, 2, 3, 4, 5},{2, 1, 2, 3, 2, 4, 2, 5},{3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};
		
		
		for(int i=0;i<3;i++) {
			int cnt = 0;
			for(int j=0;j<answers.length;j++) {
				if(cnt>person[i].length-1) {
					cnt = 0;
				}
				if(person[i][cnt]==answers[j]) {
					howmany[i]++;
				}
				cnt++;
			}
		}
		
		int max = howmany[0];
		
		for(int i=0;i<3;i++) {
			if(max<howmany[i]) {
				max = howmany[i];
			}
		}
		
		int cnt =0;
		
		for(int i=0;i<3;i++) {
			if(max == howmany[i]) {
				result[cnt] = i+1;
				cnt++;
			}
			
		}
		answer = new int[cnt];
		for(int i=0;i<cnt;i++) {
			answer[i] = result[i];
			System.out.println("answer"+i+"¹øÂ° : "+answer[i]);
		}
	}
}
