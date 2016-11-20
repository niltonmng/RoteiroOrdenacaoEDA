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
		
        ArrayList<int[]> lista = listaNumerosRandomicos();
        for (int i = 0; i < lista.size(); i++) {

        	long lStartTimeMerge = System.nanoTime();
        	merge.sort(lista.get(i));
        	long lEndTimeMerge = System.nanoTime();
        	long outputMerge = lEndTimeMerge - lStartTimeMerge;
            System.out.println("Elapsed time in milliseconds: " + outputMerge / 1000000);
            
            long lStartTimeQuick = System.nanoTime();
        	quick.sort(lista.get(i));
        	long lEndTimeQuick = System.nanoTime();
        	long outputQuick = lEndTimeQuick - lStartTimeQuick;
            System.out.println("Elapsed time in milliseconds: " + outputQuick / 1000000);
            
            long lStartTimeSelection = System.nanoTime();
        	selection.sort(lista.get(i));
        	long lEndTimeSelection = System.nanoTime();
        	long outputSelection = lEndTimeSelection - lStartTimeSelection;
            System.out.println("Elapsed time in milliseconds: " + outputSelection / 1000000);
            
            long lStartTimeInsertion = System.nanoTime();
        	insertion.sort(lista.get(i));
        	long lEndTimeInsertion = System.nanoTime();
        	long outputInsertion = lEndTimeInsertion - lStartTimeInsertion;
            System.out.println("Elapsed time in milliseconds: " + outputInsertion / 1000000);
            
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
