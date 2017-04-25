/**
 * 
 */
package tests_ADP05;
import static org.junit.Assert.*;



import org.junit.Test;

import adp05.Element;
import adp05.QuickSortV2;


/**
 * @author Daexel
 *
 */
public class QuicksortTest {
	
	//Erstellen von TestElementen
	private Element element1 = new Element(1);
	private Element element2 = new Element(2);
	private Element element3 = new Element(3);
	private Element element4 = new Element(4);
	private Element element5 = new Element(5);

	//Erstellen von TestArrays
	Element [] expectedResult={element1, element2, element3, element4, element5};
	Element [] arrayQuick1={element1,element2,element5,element4,element3};
	Element [] arrayQuick2={element5, element4, element3, element2, element1};
	
	
	@Test
	public void quickSortFirstTest(){
	
	QuickSortV2 qs = new QuickSortV2();
	qs.quickSort(arrayQuick1,0, 4,"first");
	
	for (int i=0; i<expectedResult.length;i++){
		assertTrue(arrayQuick1[i].getKey()== expectedResult[i].getKey());
	}
	
	QuickSortV2 qs2 = new QuickSortV2();
	qs2.quickSort(arrayQuick2,0, 4,"first");
	
	for (int i=0; i<expectedResult.length;i++){
		assertTrue(arrayQuick2[i].getKey()== expectedResult[i].getKey());
	}
	}
	
	@Test
	public void quickSortLastTest(){
		QuickSortV2 qs = new QuickSortV2();
		qs.quickSort(arrayQuick1,0, 4,"last");
		
		for (int i=0; i<expectedResult.length;i++){
			assertTrue(arrayQuick1[i].getKey()== expectedResult[i].getKey());
		}
		
		QuickSortV2 qs2 = new QuickSortV2();
		qs2.quickSort(arrayQuick2,0, 4,"last");
		
		for (int i=0; i<expectedResult.length;i++){
			assertTrue(arrayQuick2[i].getKey()== expectedResult[i].getKey());
		}
	}
	
	@Test
	public void quickSortMiddleTest(){
		QuickSortV2 qs = new QuickSortV2();
		qs.quickSort(arrayQuick1,0, 4,"middle");
		
		for (int i=0; i<expectedResult.length;i++){
			assertTrue(arrayQuick1[i].getKey()== expectedResult[i].getKey());
		}
		
		QuickSortV2 qs2 = new QuickSortV2();
		qs2.quickSort(arrayQuick2,0, 4,"middle");
		
		for (int i=0; i<expectedResult.length;i++){
			assertTrue(arrayQuick2[i].getKey()== expectedResult[i].getKey());
		}
		
	}
	
	@Test
	public void quickSortRandomTest(){
		QuickSortV2 qs = new QuickSortV2();
		qs.quickSort(arrayQuick1,0, 4,"random");
		
		for (int i=0; i<expectedResult.length;i++){
			assertTrue(arrayQuick1[i].getKey()== expectedResult[i].getKey());
		}
		
		QuickSortV2 qs2 = new QuickSortV2();
		qs2.quickSort(arrayQuick2,0, 4,"random");
		
		for (int i=0; i<expectedResult.length;i++){
			assertTrue(arrayQuick2[i].getKey()== expectedResult[i].getKey());
		}
	}
}
