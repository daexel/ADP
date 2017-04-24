/**
 * 
 */
package adp05;

/**
 * @author Daexel
 *
 */
public class Quicksort {
	private Element  array[]; 
	private int pivot;
	public Quicksort(Element [] arry){
		this.array=arry;
	}
	public void quicksort(int ilinks, int irechts) { 
		if((ilinks>=0)&&(irechts>=0)&&(ilinks<=array.length)&&(irechts<=array.length)){
		int i;
		int j; 
		Element element; 
		if ( irechts > ilinks ) { 
			i = ilinks; 
			j = irechts-1; 
			pivot = array[irechts].getKey(); 
			while(true) { 
				while(array[i].getKey() < pivot) {
					i++; }
				while((array[j].getKey() > pivot)&&(j>0)){ 
					j--;
				}
				//Vorsicht: Stop-Element einbauen 
				if ( i >= j ){ 
					break;
					}
				//in der Mitte getroffen 
				swap(i,j);//vertauschen 
				} 
			swap(i,irechts);
			//Pivotelement in die Mitte tauschen 
			quicksort(ilinks,i-1); 
			quicksort(i+1,irechts); 
				}
		}
			}
		
	public void swap(int links, int rechts){
		Element elementTemp =null;
		elementTemp = array[links];
		array[links]=array[rechts];
		array[rechts]=elementTemp;
		
	}
	public Element[] getArray(){
		return this.array;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Element[] array= new Element[10];
		for (int i =0;i<10;i++){
			Element element = new Element((int) ((Math.random()*100)+1));
			array[i]=element;
		}
		System.out.println("Liste unsortiert:");
		for (int i=0;i<array.length;i++){
		 System.out.print(array[i].getKey()+" ");
		}
		Quicksort qs = new Quicksort(array);
		qs.quicksort(0, 8);
		System.out.println("\nListe sortiert:");
		for (int i=0;i<qs.getArray().length;i++){
			 System.out.print(qs.getArray()[i].getKey()+" ");
			}
	
	
}
}

