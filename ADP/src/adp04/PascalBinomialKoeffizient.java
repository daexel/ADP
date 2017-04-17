package adp04;

import Counter.Counter;
import java.lang.Math;

public class PascalBinomialKoeffizient extends Counter implements IPascalDreieck {

	/**
	 * binomFunction
	 * 
	 * berechnet die position (zeile/spalte) mithilfe des binomialkoeffizenten
	 * @param pot
	 * @return sum
	 */
	private double binomFunction(int zeile, int spalte) {
		if (spalte == 0 || zeile == spalte) {
			return 1;
		} else {
			return fakultaet(zeile) / (fakultaet(spalte) * fakultaet(zeile - spalte));
		}
	}

	@Override
	public void berechneZeile(int zeile) {
		for (int i = 0; i <= zeile; i++) {
			count();
			binomFunction(zeile, i);
		}
	}
	/**
	 * fakultaet
	 * 
	 * berechnet die fakultaet einer zahl
	 * @param n	zu berechnende zahl
	 * @return n!
	 */
	public double fakultaet(int n) {
		double result = 1;
		count();
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}

	public static void main(String[] args) {
		PascalBinomialKoeffizient pc = new PascalBinomialKoeffizient();
		pc.berechneZeile(30);
		
	}

}
