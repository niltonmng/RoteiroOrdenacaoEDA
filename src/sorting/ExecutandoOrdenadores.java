package sorting;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class ExecutandoOrdenadores {

	public static void main(String[] args) {
		
		Sorting merge = new MergeSort();		
		Sorting quick = new QuickSort();
		Sorting selection = new SelectionSort();
		Sorting insertion = new InsertionSort();

		ArrayList<int[]> nova = listaNumerosRandomicos();
		for (int i = 0; i < nova.size(); i++) {
			
			long lStartTimeMerge = System.nanoTime();
			merge.sort(nova.get(i));
			long lEndTimeMerge = System.nanoTime();
			long outputMerge = lEndTimeMerge - lStartTimeMerge;
			System.out.println("merge " + outputMerge + " " + nova.get(i).length);

			//long lStartTimeQuick = System.nanoTime();
			//quick.sort(nova.get(i));
			//long lEndTimeQuick = System.nanoTime();
			//long outputQuick = lEndTimeQuick - lStartTimeQuick;
			//System.out.println("quick " + " " + nova.get(i).length);

			long lStartTimeSelection = System.nanoTime();
			selection.sort(nova.get(i));
			long lEndTimeSelection = System.nanoTime();
			long outputSelection = lEndTimeSelection - lStartTimeSelection;
			System.out.println("selection " + outputSelection + " " + nova.get(i).length);

			long lStartTimeInsertion = System.nanoTime();
			insertion.sort(nova.get(i));
			long lEndTimeInsertion = System.nanoTime();
			long outputInsertion = lEndTimeInsertion - lStartTimeInsertion;
			System.out.println("insertion " + outputInsertion + " " + nova.get(i).length);
		}
		

		long lStartTimeMerge = System.nanoTime();
		executeSortingAlgorithm(merge);
		long lEndTimeMerge = System.nanoTime();
		long outputMerge = lEndTimeMerge - lStartTimeMerge;
		System.out.println("merge " + outputMerge / 1000000);

		long lStartTimeQuick = System.nanoTime();
		executeSortingAlgorithm(quick);
		long lEndTimeQuick = System.nanoTime();
		long outputQuick = lEndTimeQuick - lStartTimeQuick;
		System.out.println("quick " + outputQuick / 1000000);

		long lStartTimeSelection = System.nanoTime();
		executeSortingAlgorithm(selection);
		long lEndTimeSelection = System.nanoTime();
		long outputSelection = lEndTimeSelection - lStartTimeSelection;
		System.out.println("selection " + outputSelection / 1000000);

		long lStartTimeInsertion = System.nanoTime();
		executeSortingAlgorithm(insertion);
		long lEndTimeInsertion = System.nanoTime();
		long outputInsertion = lEndTimeInsertion - lStartTimeInsertion;
		System.out.println("insertion " + outputInsertion / 1000000);

	}
	
	private static void calculation() throws InterruptedException {
        //Sleep 0 seconds
        TimeUnit.SECONDS.sleep(0);

    }


	public static int[] vetorRandom(int tamanho){
		int[] vetor = new int[tamanho];
		Random r = new Random();
		for (int i = 0; i < tamanho; i++) {
			int numeroRandom = r.nextInt(100);
			vetor[i] = numeroRandom;
		}
		return vetor;
	}


	public static void executeSortingAlgorithm(Sorting strategy){
		for (int i = 20000; i <= 40000; i+=1000) {
			int[] v = vetorRandom(i);
			strategy.sort(v);
		}
	}


	/**
	 * Cria um ArrayList<int[]> com 21 elementos do tipo array de inteiros,
	 * que possuem de 20000 a 40000 elementos, todos gerados randomicamente.
	 * @return
	 */
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
}




