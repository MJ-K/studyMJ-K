package exam_03;

public class SelectionSort {
	void selectionSort(int[] list) {
	    int indexMin, temp;

	    for (int i = 0; i < list.length - 1; i++) {
	        indexMin = i;
	        for (int j = i + 1; j < list.length; j++) {
	            if (list[j] < list[indexMin]) {
	                indexMin = j;
	            }
	        }
	        temp = list[indexMin];
	        list[indexMin] = list[i];
	        list[i] = temp;
	        System.out.print(list[i] + "\t");
	    }
	}
	public static void main(String[] args) {
		SelectionSort ss= new SelectionSort();
		int[] data  = { 100,20,5,2,3,34,65,23,66,200};
		ss.selectionSort(data);
	}
}
