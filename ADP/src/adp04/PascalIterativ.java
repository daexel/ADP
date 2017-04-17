/**
 * 
 */
package adp04;

import Counter.Counter;

/**
 * @author daexel
 *
 *Berechnung des Pascalschen Dreiecks iterativ.
 *
 */
public class PascalIterativ extends Counter implements IPascalDreieck {
	private int anzahl_zeilen;
	private int[][] dreieck;
/**
 * 
 * Berechnet die N-te Zeile des Pascalschen Dreiecks
 * 
 * @param int zeile: Die zu berechnende Zeile
 * 
 */
	public void berechneZeile(int zeile) {
		this.anzahl_zeilen = zeile;
		this.dreieck = new int[zeile + 2][zeile];
		int i, j;

		dreieck[1][0] = 1;
		
		for (j = 1; j < zeile; j++) {
			count();
			for (i = 1; i < j + 2; i++) {
				count();
				dreieck[i][j] = dreieck[i - 1][j - 1] + dreieck[i][j - 1];
			}
		}
	}
/**
 * Gibt das gesamte Dreieck bis zur N-ten Zeile auf der Konsole aus
 */
	public void dreieck_ausgeben() {
		int i, j;

		for (j = 0; j < anzahl_zeilen; j++) {
			for (i = 1; i < j + 2; i++) {
				System.out.print(dreieck[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}



	public static void main(String[] args) {
		PascalIterativ iterPascal = new PascalIterativ();
		iterPascal.berechneZeile(5);
		iterPascal.dreieck_ausgeben();
	}
}
