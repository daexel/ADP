/**
 * 
 */
package adp05;

import Counter.Counter;

/**
 * @author Daexel
 *
 */
public class QuicksortFehler extends Counter{
	private Container[] elemente;
    private int laengeListe;

    public void sort(Container[] liste) {
            // check for empty or null array
            if (liste ==null || liste.length==0){
                    return;
            }
            this.elemente = liste;
            laengeListe = liste.length;
            quicksort(0, laengeListe - 1);
    }

    private void quicksort(int low, int high) {
            int i = low, j = high-1;
            
            // Pivotelement festlegen--------------------------------------------------------------------------------
            int random =elemente[(int) (Math.random() * (elemente.length - 1))].getKey();
            int first = elemente[low].getKey();
            int last = elemente[high].getKey();
            int middle = elemente[low + (high - low) / 2].getKey();
            int pivotIndex=first;
            int pivot = elemente[pivotIndex].getKey();
            Container tmp = elemente[high];
            elemente[high]=elemente[pivotIndex];
            elemente[pivotIndex]=tmp;
            //------------------------------------------------------------------------------------------------------
            // Aufteilund des Array in 2 Teile
            while (i <= j) {

                    while (elemente[i].getKey() < pivot) {
                            i++;
                    }

                    while (elemente[j].getKey() > pivot) {
                    	swap(i, j);   
                    	j--;
                    }

                    if (i <= j) {
                            swap(i, j);
                            i++;
                            j--;
                    }
            }
            // Rekursion
            if (low < j)
                    quicksort(low, j);
            if (i < high)
                    quicksort(i, high);
    }

    private void swap(int i, int j) {
    		count();
    		count();
            Container temp = elemente[i];
            elemente[i] = elemente[j];
            elemente[j] = temp;
    }
    
public static void main(String[] args) {
		
		// Liste erstellen-----------------------------------------------------------
		int laengeArray = 10000;
		Container[] liste = new Container[laengeArray];
		for (int i = 0; i < liste.length; i++) {
			 //Container container = new Container(i+1);
			Container container = new Container((int) ((Math.random() * laengeArray)));
			liste[i] = container;
		}
		//----------------------------------------------------------------------------------------------
		//unsortierte Liste ausgeben
		for (int i = 0; i < 10; i++) {
			System.out.print(liste[i].getKey() + " ");
		}
		System.out.println();
		//--------------------------------------------------------------------------------------------------------
		//sortieren-------------------------------------------------
		QuicksortFehler sortierer = new QuicksortFehler();
		sortierer.sort(liste);
		//sortieren-------------------------------------------------		
		
		for (int i = 0; i < 10; i++) {
			System.out.print(liste[i].getKey() + " ");
		}
		System.out.println("\nAnzahl Zaehler: " + sortierer.getOpCount());
	}

}

