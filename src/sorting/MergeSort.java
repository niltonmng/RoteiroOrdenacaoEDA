package sorting;

public class MergeSort implements Sorting {

	@Override
	public void sort(int[] elements) {
		this.mergeSort(elements, 0, elements.length-1);
	}
	
	
	private void mergeSort(int[] v, int ini, int fim) {

		if (ini < fim) {

			int med = (ini + fim) / 2;
			mergeSort(v, ini, med);
			mergeSort(v, med+1, fim);

			merge(v, ini, med, fim);

		}

	}

	private void merge(int[] v, int ini, int med, int fim) {

		int[] helper = new int[v.length];

		for (int i = 0; i < v.length; i++) { // array que guarda as informações de onde os elementos estava, originalmente para que sejam mudados posteriormente no vetor original.
			helper[i] = v[i];
		}

		int i = ini;
		int j = med + 1;
		int k = ini;

		while (i <= med && j <= fim) {
			if (helper[i] < helper[j]) {
				v[k] = helper[i];
				i++;
			} else {
				v[k] = helper[j];
				j++;
			}

			k++;

		}
		
		// append do elementos do primeiro array restante
		while (i <= med) {
			v[k] = helper[i];
			k+=1;
			i+=1;
		}
		// append do elementos do segundo array restante
		while (j <= fim) {
			v[k] = helper[j];
			k+=1;
			j+=1;
		}

	}
}
