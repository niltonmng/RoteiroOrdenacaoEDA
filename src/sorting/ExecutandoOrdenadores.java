package sorting;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class ExecutandoOrdenadores {


	private static Sorting merge;
	private static Sorting quick;
	private static Sorting selection;
	private static Sorting insertion;

	public ExecutandoOrdenadores(){
		ExecutandoOrdenadores.merge = new MergeSort();
		ExecutandoOrdenadores.quick = new QuickSort();
		ExecutandoOrdenadores.selection = new SelectionSort();
		ExecutandoOrdenadores.insertion = new InsertionSort();
	}

	public static void main(String[] args) {

		long lStartTimeMerge = System.nanoTime();
		executeSortingAlgorithm(merge);
		long lEndTimeMerge = System.nanoTime();
		long outputMerge = lEndTimeMerge - lStartTimeMerge;
		System.out.println("Elapsed time in milliseconds: " + outputMerge / 1000000);

		long lStartTimeQuick = System.nanoTime();
		executeSortingAlgorithm(quick);
		long lEndTimeQuick = System.nanoTime();
		long outputQuick = lEndTimeQuick - lStartTimeQuick;
		System.out.println("Elapsed time in milliseconds: " + outputQuick / 1000000);

		long lStartTimeSelection = System.nanoTime();
		executeSortingAlgorithm(selection);
		long lEndTimeSelection = System.nanoTime();
		long outputSelection = lEndTimeSelection - lStartTimeSelection;
		System.out.println("Elapsed time in milliseconds: " + outputSelection / 1000000);

		long lStartTimeInsertion = System.nanoTime();
		executeSortingAlgorithm(insertion);
		long lEndTimeInsertion = System.nanoTime();
		long outputInsertion = lEndTimeInsertion - lStartTimeInsertion;
		System.out.println("Elapsed time in milliseconds: " + outputInsertion / 1000000);





	}


	public static int[] vetorRandom(int tamanho){
		int[] resultado = new int[tamanho];
		Random r = new Random();
		for (int i = 0; i < tamanho; i++) {
			int random = r.nextInt(100);
			resultado[i] = random;
		}
		return resultado;
	}


	public static void executeSortingAlgorithm(Sorting strategy){
		for (int i = 20000; i <= 40000; i+=1000) {
			int[] v = vetorRandom(i);
			strategy.sort(v);
		}
	}


}





/*
 * Cria um ArrayList<int[]> com 21 elementos do tipo array de inteiros,
 * que possuem de 20000 a 40000 elementos, todos gerados randomicamente.
 * @return

public static ArrayList<int[]> listaNumerosRandomicos(){ 
	Random randomGenerator = new Random();
	ArrayList<int[]> lista = new ArrayList<int[]>();

	int tamanho = 20000;
	for (int i = 0; i <= 20; i++) {
		int[] v = new int[tamanho];
		for (int j = 0; j < v.length; j++){
			int randomInt = randomGenerator.nextInt(100);
			v[j] = randomInt;
		}
		tamanho += 1000;
		lista.add(v);
	}
	return lista;
}
 */