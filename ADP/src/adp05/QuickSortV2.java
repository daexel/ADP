package adp05;

import java.util.Arrays;

import Counter.Counter;

public class QuickSortV2 extends Counter {
		public static void main(String[] args) {
		int laengeArray = 10;
		Element[] liste= new Element[laengeArray];
	    for (int i=0;i<liste.length;i++){
	    	//Element element = new Element(i+1);
	    	Element element = new Element((int) (Math.random()*laengeArray)); 
	    	liste[i]=element;
	    }
	    for (int i=0;i<10;i++){
		System.out.print(liste[i].getKey()+" ");
	    }	
	    System.out.println();
		int low = 0;
		int high = liste.length - 1;
		QuickSortV2 sort = new QuickSortV2();
		sort.quickSort(liste, low, high,"random");
		for (int i=0;i<10;i++){
			System.out.print(liste[i].getKey()+" ");
		    }
		System.out.println("\nAnzahl Zaehler: "+sort.getOpCount());
	}
 /**
  * Algorithmus zur Sortierung einer Liste
  * 
  * @param arr 				Array als uebergebene Liste	
  * @param low				Niedrigstes Element
  * @param high				Hoechstes Element
  * @param pivotElement		String zur Festlegung des Pivotelementes
  */
	public void quickSort(Element[] arr, int low, int high,String pivotElement) {
		if (arr == null || arr.length == 0)
			return;
 
		if (low >= high)
			return;
		int pivot=0;
		
		// Definiert das Pivotelement
		switch(pivotElement){
		case "middle":
			int middle = low + (high - low) / 2;
		    pivot = arr[middle].getKey();
		    break;
		case "first":
			int first = low;
			pivot = arr[first].getKey();
			break;
		case "last":
			int last = high;
			pivot = arr[last].getKey();
			break;
		case "random":
			int random = arr[(int)(Math.random()*(arr.length-1))].getKey();
			pivot = arr[random].getKey();
			break;
		}
		// make left < pivot and right > pivot
		int i = low, j = high;
		while (i <= j) {
			while (arr[i].getKey() < pivot) {
				i++;
			}
 
			while (arr[j].getKey() > pivot) {
				j--;
			}
 
			if (i <= j) {
				//swap elements
				Element temp = arr[i];
				arr[i] = arr[j];
				count();
				arr[j] = temp;
				count();
				i++;
				j--;
			}
		}
 
		// Rekursives sortieren zweier einzelner Stücke des Arrays
		if (low < j)
			quickSort(arr, low, j,pivotElement);
 
		if (high > i)
			quickSort(arr, i, high,pivotElement);
	}
}
