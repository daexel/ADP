package adp05;

import Counter.Counter;

//import Counter.Counter;

public class QuickSort extends Counter {
	 private Element[] liste;
     //private int number;
public QuickSort(Element [] liste){
	this.liste=liste;
}
     public void sort(Element[] liste, String piv) {
    	 // check for empty or null array
             if (liste ==null || liste.length==0){
                     return;
             }
             
             int listengroesse = liste.length;
             quicksort(0, listengroesse - 1,piv);
     }

     private void quicksort(int low, int high, String piv) {
             int i = low, j = high;
             int pivot=0;
             // Get the pivot element from the middle of the list
             switch(piv){
             case "first": pivot=liste[low].getKey();
             case "last" : pivot=liste[high].getKey();
             case "middle": pivot = liste[low + (high-low)/2].getKey();
             }

             // Divide into two lists
             while (i <= j) {
                     // If the current value from the left list is smaller than the pivot
                     // element then get the next element from the left list
                     while (liste[i].getKey() < pivot) {
                             i++;
                     }
                     // If the current value from the right list is larger than the pivot
                     // element then get the next element from the right list
                     while ((liste[j].getKey() > pivot)&&(j<=0)) {
                             j--;
                     }

                     // If we have found a value in the left list which is larger than
                     // the pivot element and if we have found a value in the right list
                     // which is smaller than the pivot element then we exchange the
                     // values.
                     // As we are done we can increase i and j
                     if (i <= j) {
                             exchange(i, j);
                             i++;
                             j--;
                     }
             }
             // Recursion
             if (low < j)
                     quicksort(low, j,piv);
             if (i < high)
                     quicksort(i, high,piv);
     }

     private void exchange(int i, int j) {
             Element temp = liste[i];
             liste[i] = liste[j];
             count();
             liste[j] = temp;
             count();
     }
     public static void main(String[] args) {
    	 
    	 Element[] liste= new Element[10];
    for (int i=0;i<10;i++){
    	Element element = new Element((int) (Math.random()*100)); 
    	liste[i]=element;
    }
    QuickSort qs = new QuickSort(liste);
    for (int i=0; i<liste.length; i++) {
	    System.out.print(liste[i].getKey()+" ");
 }
    System.out.println();
     qs.sort(liste,"last");
     for (int i=0; i<liste.length; i++) {
    	    System.out.print(liste[i].getKey()+" ");
     }
     System.out.println("\nAnzahl zaehler: "+qs.getOpCount());
  }    
}
