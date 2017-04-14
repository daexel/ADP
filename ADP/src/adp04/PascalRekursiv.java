/**
 * 
 */
package adp04;

/**
 * @author Michel Gerlach
 * 
 * Rekursive Berechnung des Pascalschen Dreiecks
 *
 */
public class PascalRekursiv implements IPascalDreieck {
	
	private int aufwandsZaehler=0;
	
	public int getAufwand(){
		return this.aufwandsZaehler;
	}
	
	/**
	 * Funktion für die Berechnung des Pascalschen Dreiecks
	 * 
	 * @param zeile des Dreiecks
	 * @param spalte des Dreiecks
	 * 
	 * @return Wert der jeweiligen Zeile und Spalte
	 */
	public int function_pascal(int zeile, int spalte) {
		if (spalte==0 || spalte==zeile){
			aufwandsZaehler++;
			return 1;
		}
		aufwandsZaehler++;
		return function_pascal(zeile-1,spalte) + function_pascal(zeile-1,spalte-1);
		}
	/**
	 * Ausgabe der N-ten Zeile des Pascalschen Dreiecks
	 * 
	 * @param zeile
	 */
	public void berechneZeile(int zeile){
		for(int spalte=0; spalte<=zeile; spalte++){
			aufwandsZaehler++;
			System.out.print(function_pascal(zeile, spalte) + " ");
		}
	}
		public static void main(String[] args) {
		PascalRekursiv berechnungRekursiv = new PascalRekursiv();
		berechnungRekursiv.berechneZeile(22);
		System.out.println("\nAufwand: "+berechnungRekursiv.getAufwand());
		}
}
