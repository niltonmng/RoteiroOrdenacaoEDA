package sorting;

public class InsertionSort implements Sorting{

	@Override
	public void sort(int[] elements) {
		this.insertion(elements);
	}
	
	
	private void insertion(int[] v) {
	    for (int j = 1; j < v.length; j++) {
	        int key = v[j];
	        int i = j-1;
	        while(i >= 0 && v[i] > key) {
	            v[i+1] = v[i]; 
	            i--;
	        }
	    v[i+1] = key;
	   }
	}

}
