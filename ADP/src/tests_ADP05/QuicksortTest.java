/**
 * 
 */
package tests_ADP05;
import static org.junit.Assert.*;



import org.junit.Test;

import adp05.Container;
import adp05.QuickSortFirstTry;


/**
 * @author Daexel
 *
 */
public class QuicksortTest {
	
	//Erstellen von TestElementen
	private Container element1 = new Container(1);
	private Container element2 = new Container(2);
	private Container element3 = new Container(3);
	private Container element4 = new Container(4);
	private Container element5 = new Container(5);

	//Erstellen von TestArrays
	Container [] expectedResult={element1, element2, element3, element4, element5};
	Container [] arrayQuick1={element1,element2,element5,element4,element3};
	Container [] arrayQuick2={element5, element4, element3, element2, element1};
	
	
	@Test
	public void quickSortFirstTest(){
	
	QuickSortFirstTry qs = new QuickSortFirstTry();
	qs.quickSort(arrayQuick1,0, 4,"first");
	
	for (int i=0; i<expectedResult.length;i++){
		assertTrue(arrayQuick1[i].getKey()== expectedResult[i].getKey());
	}
	
	QuickSortFirstTry qs2 = new QuickSortFirstTry();
	qs2.quickSort(arrayQuick2,0, 4,"first");
	
	for (int i=0; i<expectedResult.length;i++){
		assertTrue(arrayQuick2[i].getKey()== expectedResult[i].getKey());
	}
	}
	
	@Test
	public void quickSortLastTest(){
		QuickSortFirstTry qs = new QuickSortFirstTry();
		qs.quickSort(arrayQuick1,0, 4,"last");
		
		for (int i=0; i<expectedResult.length;i++){
			assertTrue(arrayQuick1[i].getKey()== expectedResult[i].getKey());
		}
		
		QuickSortFirstTry qs2 = new QuickSortFirstTry();
		qs2.quickSort(arrayQuick2,0, 4,"last");
		
		for (int i=0; i<expectedResult.length;i++){
			assertTrue(arrayQuick2[i].getKey()== expectedResult[i].getKey());
		}
	}
	
	@Test
	public void quickSortMiddleTest(){
		QuickSortFirstTry qs = new QuickSortFirstTry();
		qs.quickSort(arrayQuick1,0, 4,"middle");
		
		for (int i=0; i<expectedResult.length;i++){
			assertTrue(arrayQuick1[i].getKey()== expectedResult[i].getKey());
		}
		
		QuickSortFirstTry qs2 = new QuickSortFirstTry();
		qs2.quickSort(arrayQuick2,0, 4,"middle");
		
		for (int i=0; i<expectedResult.length;i++){
			assertTrue(arrayQuick2[i].getKey()== expectedResult[i].getKey());
		}
		
	}
	
	@Test
	public void quickSortRandomTest(){
		QuickSortFirstTry qs = new QuickSortFirstTry();
		qs.quickSort(arrayQuick1,0, 4,"random");
		
		for (int i=0; i<expectedResult.length;i++){
			assertTrue(arrayQuick1[i].getKey()== expectedResult[i].getKey());
		}
		
		QuickSortFirstTry qs2 = new QuickSortFirstTry();
		qs2.quickSort(arrayQuick2,0, 4,"random");
		
		for (int i=0; i<expectedResult.length;i++){
			assertTrue(arrayQuick2[i].getKey()== expectedResult[i].getKey());
		}
	}
}
