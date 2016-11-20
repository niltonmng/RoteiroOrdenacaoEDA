package sorting;

public class QuickSort implements Sorting {

	@Override
	public void sort(int[] elements) {
		this.quickSort(elements, 0, - 1);
	}
	
	
	private void quickSort(int[] v, int ini, int fim) {
        if (ini < fim) {
            int pos_pivot = particiona(v, ini, fim);
            quickSort(v, ini, pos_pivot - 1);
            quickSort(v, pos_pivot + 1, fim);
        }
    }

	private int particiona(int[] v, int ini, int fim) {
        
        int pivot = v[ini];
        int i = ini;

        for (int j = ini + 1; j <= fim; j++) {
            if (v[j] < pivot) {
                i+=1;
                swap(v, i, j);
            }
        }

        // troca pivot (v[ini]) com i.
        swap(v, ini, i);
        
        return i; 
    }

	private void swap(int[] v, int i, int j) {
        int aux = v[i];
        v[i] = v[j];
        v[j] = aux;
    }

}
