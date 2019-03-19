package Full_Navigation;

public class Mock_exam_answer1 {
	public static void main(String[] args) {
		
			int[] answers = {1,3,2,4,2};
			int[] arr = new int[3];
		    int[] a = {1,2,3,4,5};
		    int[] b = {2,1,2,3,2,4,2,5};
		    int[] c = {3,3,1,1,2,2,4,4,5,5};
		    
		
		    for(int i = 0; i < answers.length; i++){
		        if(answers[i] == a[i%5]) arr[0]++; //5%5 = 0 이 되버리니까
		        if(answers[i] == b[i%8]) arr[1]++;
		        if(answers[i] == c[i%10]) arr[2]++;
		    }
		    
		    int max = arr[0];
		
		    if(max < arr[1]) max = arr[1];
		    if(max < arr[2]) max = arr[2];
  
		    if(max == arr[0] && max == arr[1] && max == arr[2]) {
		    	int[] answer = {1,2,3};
		    	for(int i =0;i<answer.length;i++) {
			    	System.out.println(answer[i]);
			    }
		    }
		    else if(max == arr[0] && max == arr[1]) {
		    	int[] answer = {1,2};
		    	for(int i =0;i<answer.length;i++) {
			    	System.out.println(answer[i]);
			    }
		    }
		    else if(max == arr[0] && max == arr[2]) {
		    	int[] answer = {1,3};
		    	for(int i =0;i<answer.length;i++) {
			    	System.out.println(answer[i]);
			    }
		    }
		    else if(max == arr[1] && max == arr[2]){
		    	int[] answer = {2,3};
		    	for(int i =0;i<answer.length;i++) {
			    	System.out.println(answer[i]);
			    }
		    }
		    else if(max == arr[0]){
		    	int[] answer = {1};
		    	for(int i =0;i<answer.length;i++) {
			    	System.out.println(answer[i]);
			    }
		    }
		    else if(max == arr[1]) {
		    	int[] answer = {2};
		    	for(int i =0;i<answer.length;i++) {
			    	System.out.println(answer[i]);
			    }
		    }
		    
		    
	}
}
