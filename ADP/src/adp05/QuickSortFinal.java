package adp05;

public class QuickSortFinal {
	public static void sortiereArray(Container[] sortArray, String pivotLoc) {
		quickSort(sortArray, 0, sortArray.length - 1, pivotLoc);
	}

	private static void quickSort(Container[] sortArray, int links, int rechts, String pivotLoc) {
		if (links < rechts) {
			int i = aufteilen(sortArray, links, rechts, pivotLoc);
			quickSort(sortArray, links, i - 1, pivotLoc);
			quickSort(sortArray, i + 1, rechts, pivotLoc);
		}
	}

	private static int aufteilen(Container[] sortArray, int links, int rechts, String pivotLoc) {
		int pivot, i, j;
		Container<?> tmp;

		int pivotIndex = pivotFinden(links, rechts, pivotLoc);

		pivot = sortArray[pivotIndex].getKey();

		// pivotelement an den rechten rand schieben
		tmp = sortArray[rechts];
		sortArray[rechts]=sortArray[pivotIndex];
		sortArray[pivotIndex]=tmp;

		i = links;
		j = rechts - 1;

		while (i <= j) {
			if (sortArray[i].getKey() > pivot) {

				// tmp = sortArray[i];
				// sortArray[i] = array[j];
				// array[j] = tmp;
				swap(sortArray,i, j);
				j--;
			} else
				i++;
		}

		// tausche erstes element > pivot mit pivot-Element
		swap(sortArray,i, rechts);
		return i;
	}
	public static void swap(Container array[], int i, int j) {
		//count();
		//count();
		Container tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}

	/*
	 * Wählt das Verfahren zur Pivot-Bestimmung aus
	 */
	private static int pivotFinden(int links, int rechts, String verfahren) {

		switch (verfahren) {
		case "links":
			return links;

		case "mitte":
			return (links + rechts) / 2;

		case "rechts":
			return rechts;
			
		case "zufall":
			return (int)(Math.random()*(rechts+links));
		default:
			return -1;
		}
	}

	public static void main(String[] args) {
		
		int laengeArray = 1000000;
		Container[] liste = new Container[laengeArray];
		for (int i = 0; i < liste.length; i++) {
			 //Container container = new Container(i+1);
			Container container = new Container((int) ((Math.random() * laengeArray)));
			liste[i] = container;
		}
		for (int i = 0; i < 10; i++) {
			System.out.print(liste[i].getKey() + " ");
		}
		
		Test.sortiereArray(liste, "zufall");
		for (int i = 0; i < 10; i++) {
			System.out.print(liste[i].getKey()+" ");
		}

}

}
