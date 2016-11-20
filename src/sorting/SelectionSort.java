package sorting;

public class SelectionSort implements Sorting{

	@Override
	public void sort(int[] elements) {
		this.selection(elements);
		
	}
	
	public void selection(int[] vetor) {
	    int menor;
	    int indiceMenor;
        for (int i = 0; i < vetor.length - 1; i++) {
            menor = vetor[i];
            indiceMenor = i;

            for (int j = i + 1; j < vetor.length; j++){
                if (vetor[j] < menor){
                    menor = vetor[j];
                    indiceMenor = j;
                }
            }

            vetor[indiceMenor] = vetor[i];
            vetor[i] = menor;
        }
	}
}
