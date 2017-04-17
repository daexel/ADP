/**
 * 
 */
package adp04;

import Counter.Counter;

/**
 * @author Michel Gerlach
 * 
 *         Rekursive Berechnung des Pascalschen Dreiecks
 *
 */
public class PascalRekursiv extends Counter implements IPascalDreieck {

	// private int aufwandsZaehler=0; // abeglöst durch Counter klasse
	
	// public int getAufwand(){
	// return this.aufwandsZaehler;
	// }

	/**
	 * Funktion für die Berechnung des Pascalschen Dreiecks
	 * 
	 * @param zeile
	 *            des Dreiecks
	 * @param spalte
	 *            des Dreiecks
	 * 
	 * @return Wert der jeweiligen Zeile und Spalte
	 */
	public int function_pascal(int zeile, int spalte) {
		if (spalte == 0 || spalte == zeile) {
			count();
			return 1;
		}
		count();
		return function_pascal(zeile - 1, spalte) + function_pascal(zeile - 1, spalte - 1);
	}

	/**
	 * Ausgabe der N-ten Zeile des Pascalschen Dreiecks
	 * 
	 * @param zeile
	 */
	public void berechneZeile(int zeile) {
		for (int spalte = 0; spalte <= zeile; spalte++) {
			count();
			function_pascal(zeile, spalte);
		}
	}

	public static void main(String[] args) {
		PascalRekursiv berechnungRekursiv = new PascalRekursiv();
		for (int i = 0; i < 10; i++) {
			berechnungRekursiv.berechneZeile(i);
			System.out.println();
		}
		System.out.println("\nAufwand: " + berechnungRekursiv.getOpCount());
	}
}
