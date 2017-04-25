package adp05;

import java.util.Arrays;

import Counter.Counter;

public class QuickSortV2 extends Counter {
	public static void main(String[] args) {
		int laengeArray = 1000;
		Element[] liste= new Element[laengeArray];
	    for (int i=0;i<liste.length;i++){
	    	Element element = new Element(i+1);
	    	//Element element = new Element((int) (Math.random()*10)); 
	    	liste[i]=element;
	    }
	    for (int i=0;i<10;i++){
		System.out.print(liste[i].getKey()+" ");
	    }	
	    System.out.println();
		int low = 0;
		int high = liste.length - 1;
		QuickSortV2 sort = new QuickSortV2();
		sort.quickSort(liste, low, high);
		for (int i=0;i<10;i++){
			System.out.print(liste[i].getKey()+" ");
		    }
		System.out.println("\nAnzahl Zaehler: "+sort.getOpCount());
	}
 
	public void quickSort(Element[] arr, int low, int high) {
		if (arr == null || arr.length == 0)
			return;
 
		if (low >= high)
			return;
 
		// pick the pivot
		// Mitte
		int middle = low + (high - low) / 2;
		//Erstes
		int first = low;
		//Letztes
		int last = high;
		//Radom
		int random = arr[(int)(Math.random()*(arr.length-1))].getKey();
		//---------------------------------------------------------------------
		int pivot = arr[low].getKey();
		//-----------------------------------------------------------------------
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
				Element temp = arr[i];
				arr[i] = arr[j];
				count();
				arr[j] = temp;
				count();
				i++;
				j--;
			}
		}
 
		// recursively sort two sub parts
		if (low < j)
			quickSort(arr, low, j);
 
		if (high > i)
			quickSort(arr, i, high);
	}
}
