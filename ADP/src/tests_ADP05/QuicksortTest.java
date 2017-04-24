/**
 * 
 */
package tests_ADP05;
import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import adp05.Element;
import adp05.Quicksort;
import junit.framework.AssertionFailedError;

/**
 * @author Daexel
 *
 */
public class QuicksortTest {
	private Element element1 = new Element(1);
	private Element element2 = new Element(2);
	private Element element3 = new Element(3);
	private Element element4 = new Element(4);
	private Element element5 = new Element(5);
	
	public static Element[] arrayRandom(int groesse){
		Element[] array =new Element[groesse];
	for (int i =0;i<groesse;i++){
		Element element = new Element((int) ((Math.random()*100)+1));
		array[i]=element;
	}
	return array;
	}
	public static Element[] arrayVorwaertsSortiert(int groesse){
		Element[] array =new Element[groesse];
		for (int i =0;i<groesse;i++){
			Element element = new Element(i+1);
			array[i]=element;
		}
		return array;
		}
	public static Element[] arrayRueckwaertsSortiert(int groesse){
		Element[] array =new Element[groesse];
		for (int i =groesse;i<=0;i--){
			Element element = new Element(i+1);
			array[i]=element;
		}
		return array;
		
	}
	@Test
	public void quicksortTest(){
	
	
	Element [] expectedResult={element1, element2, element3, element4, element5};
	Element [] arrayQuick1={element1,element2,element5,element4,element3};
	Element [] arrayQuick2={element5, element4, element3, element2, element1};
	
	
	Element [] sortiert1;
	
	Quicksort qs = new Quicksort(arrayQuick1);
	qs.quicksort(0, 4);
	sortiert1 = qs.getArray();
	for (int i=0; i<expectedResult.length;i++){
		assertTrue(sortiert1[i].getKey()== expectedResult[i].getKey());
	}
	Element [] sortiert2;
	
	Quicksort qs2 = new Quicksort(arrayQuick2);
	qs.quicksort(0, 4);
	sortiert2 = qs.getArray();
	for (int i=0; i<expectedResult.length;i++){
		assertTrue(sortiert2[i].getKey()== expectedResult[i].getKey());
	}
	}
	

	
}
