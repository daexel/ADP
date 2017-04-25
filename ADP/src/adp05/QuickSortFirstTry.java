package adp05;

import java.util.Arrays;

import Counter.Counter;

public class QuickSortFirstTry extends Counter {
	public static void main(String[] args) {
		
		
		int laengeArray = 10000;
		Container[] liste = new Container[laengeArray];
		for (int i = 0; i < liste.length; i++) {
			 Container container = new Container(i+1);
			//Container container = new Container((int) (Math.random() * laengeArray) + 1);
			liste[i] = container;
		}
		for (int i = 0; i < 10; i++) {
			System.out.print(liste[i].getKey() + " ");
		}
		System.out.println();
		int low = 0;
		int high = liste.length - 1;
		//sortieren-------------------------------------------------
		QuickSortFirstTry sortierer = new QuickSortFirstTry();
		sortierer.sortiere(liste);
		//sortieren-------------------------------------------------		
		
		for (int i = 0; i < 10; i++) {
			System.out.print(liste[i].getKey() + " ");
		}
		System.out.println("\nAnzahl Zaehler: " + sortierer.getOpCount());
	}
	
	 public void sortiere(Container liste[]) {
	      quickSort(liste, 0, liste.length-1);
	   }
	

	/**
	 * Algorithmus zur Sortierung einer Liste
	 * 
	 * @param arr
	 *            Array als uebergebene Liste
	 * @param low
	 *            Niedrigstes Container
	 * @param high
	 *            Hoechstes Container
	 * @param pivotElement
	 *            String zur Festlegung des Pivotelementes
	 */
	public void quickSort(Container[] arr, int low, int high) {
		if (arr == null || arr.length == 0) {
			return;
		}

		if (low >= high) {
			return;
		}

		if (low < high) {
			int i = getPartition(arr, low, high);
			quickSort(arr, low, i - 1);
			quickSort(arr, i + 1, high);
		}

	}

	// Rekursives sortieren zweier einzelner Stücke des Arrays

	public int getPartition(Container[] arr, int links, int rechts) {
		int pivot, i, j;
		//pivot = getPivot(links, rechts, verfahren, arr);
		pivot =arr[links].getKey();
		i = links;
		j = rechts-1;
		while (i <= j) {
			if (arr[i].getKey() > pivot) {
				// tausche x[i] und x[j]
				swap(arr, i, j);
				j--;
			} else {
				i++;
			}
		}
		swap(arr,i,rechts);
		return i;
	}

	/**
	 * 
	 * Gibt je nach Verfahren das Pivotelement zurück.
	 * 
	 * 
	 * @param low
	 *            Das Element an der ganz linken Position
	 * @param high
	 *            Das Element an der ganz rechten Position
	 * @param verfahren
	 *            String zur Uebergabe des Verfahrens
	 * @param arr
	 *            Das zu sortierende Array
	 * @return Das Pivot Element
	 */
	public int getPivot(int low, int high, String verfahren, Container[] arr) {
		// Definiert das Pivotelement
		switch (verfahren) {
		case "middle":
			return arr[low + (high - low) / 2].getKey();

		case "first":
			return arr[low].getKey();

		case "last":
			return arr[high].getKey();

		case "random":
			int random = arr[(int) (Math.random() * (arr.length - 1))].getKey();
			return random;

		default:
			return low;
		}

	}

	/**
	 * 
	 * Vertauscht Elemente in der Liste
	 * 
	 * @param array
	 *            Das zu sortierende Array
	 * @param i
	 *            Position i im Array
	 * @param j
	 *            Position j im Array
	 */
	public void swap(Container array[], int i, int j) {
		count();
		count();
		Container tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}
}
