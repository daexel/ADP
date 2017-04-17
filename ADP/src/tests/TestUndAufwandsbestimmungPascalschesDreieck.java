package tests;

import org.junit.Test;

import adp04.PascalBinomialKoeffizient;
import adp04.PascalIterativ;
import adp04.PascalRekursiv;

public class TestUndAufwandsbestimmungPascalschesDreieck {
	private final int test1 = 1;
	private final int test2 = 2;
	private final int test3 = 3;
	private final int test4 = 4;
	private final int test5 = 5;
	private final int test6 = 10;
	private final int test7 = 15;
	private final int test8 = 20;
	private final int test9 = 25;
	private final int test10 = 30;

	@Test
	public void testPascal() {
		PascalBinomialKoeffizient PB = new PascalBinomialKoeffizient();
		PascalRekursiv PR = new PascalRekursiv();
		PascalIterativ PI = new PascalIterativ();
		
		//PASCALBINOM
		PB.berechneZeile(test1);
		System.out.println();
		System.out.println("Aufwandsbestimmung PascalBinom für Zeile" + test1 + ": " + PB.getOpCount());
		PB.reset();
		
		PB.berechneZeile(test2);
		System.out.println();
		System.out.println("Aufwandsbestimmung PascalBinom für Zeile" + test2 + ": " + PB.getOpCount());
		PB.reset();
		
		PB.berechneZeile(test3);
		System.out.println();
		System.out.println("Aufwandsbestimmung PascalBinom für Zeile" + test3 + ": " + PB.getOpCount());
		PB.reset();

		PB.berechneZeile(test4);
		System.out.println();
		System.out.println("Aufwandsbestimmung PascalBinom für Zeile" + test4 + ": " + PB.getOpCount());
		PB.reset();
		
		PB.berechneZeile(test5);
		System.out.println();
		System.out.println("Aufwandsbestimmung PascalBinom für Zeile" + test5 + ": " + PB.getOpCount());
		PB.reset();
		
		PB.berechneZeile(test6);
		System.out.println();
		System.out.println("Aufwandsbestimmung PascalBinom für Zeile" + test6 + ": " + PB.getOpCount());
		PB.reset();
		
		PB.berechneZeile(test7);
		System.out.println();
		System.out.println("Aufwandsbestimmung PascalBinom für Zeile" + test7 + ": " + PB.getOpCount());
		PB.reset();
		
		PB.berechneZeile(test8);
		System.out.println();
		System.out.println("Aufwandsbestimmung PascalBinom für Zeile" + test8 + ": " + PB.getOpCount());
		PB.reset();

		PB.berechneZeile(test9);
		System.out.println();
		System.out.println("Aufwandsbestimmung PascalBinom für Zeile" + test9 + ": " + PB.getOpCount());
		PB.reset();
		
		PB.berechneZeile(test10);
		System.out.println();
		System.out.println("Aufwandsbestimmung PascalBinom für Zeile" + test10 + ": " + PB.getOpCount());
		PB.reset();
		
		System.out.println("***************************************************************");
		
		//PASCALREKURSIV
		PR.berechneZeile(test1);
		System.out.println();
		System.out.println("Aufwandsbestimmung PascalRekursiv für Zeile" + test1 + ": " + PR.getOpCount());
		PR.reset();
		
		PR.berechneZeile(test2);
		System.out.println();
		System.out.println("Aufwandsbestimmung PascalRekursiv für Zeile" + test2 + ": " + PR.getOpCount());
		PR.reset();
		
		PR.berechneZeile(test3);
		System.out.println();
		System.out.println("Aufwandsbestimmung PascalRekursiv für Zeile" + test3 + ": " + PR.getOpCount());
		PR.reset();

		PR.berechneZeile(test4);
		System.out.println();
		System.out.println("Aufwandsbestimmung PascalRekursiv für Zeile" + test4 + ": " + PR.getOpCount());
		PR.reset();
		
		PR.berechneZeile(test5);
		System.out.println();
		System.out.println("Aufwandsbestimmung PascalRekursiv für Zeile" + test5 + ": " + PR.getOpCount());
		PR.reset();
		
		PR.berechneZeile(test6);
		System.out.println();
		System.out.println("Aufwandsbestimmung PascalRekursiv für Zeile" + test6 + ": " + PR.getOpCount());
		PR.reset();
		
		PR.berechneZeile(test7);
		System.out.println();
		System.out.println("Aufwandsbestimmung PascalRekursiv für Zeile" + test7 + ": " + PR.getOpCount());
		PR.reset();
		
		PR.berechneZeile(test8);
		System.out.println();
		System.out.println("Aufwandsbestimmung PascalRekursiv für Zeile" + test8 + ": " + PR.getOpCount());
		PR.reset();

		PR.berechneZeile(test9);
		System.out.println();
		System.out.println("Aufwandsbestimmung PascalRekursiv für Zeile" + test9 + ": " + PR.getOpCount());
		PR.reset();
		
		PR.berechneZeile(test10);
		System.out.println();
		System.out.println("Aufwandsbestimmung PascalRekursiv für Zeile" + test10 + ": " + PR.getOpCount());
		PR.reset();
		
		System.out.println("***************************************************************");
		
		//PASCALITERATIV
		PI.berechneZeile(test1);
		System.out.println();
		System.out.println("Aufwandsbestimmung PascalIterativ für Zeile" + test1 + ": " + PI.getOpCount());
		PI.reset();
		
		PI.berechneZeile(test2);
		System.out.println();
		System.out.println("Aufwandsbestimmung PascalIterativ für Zeile" + test2 + ": " + PI.getOpCount());
		PI.reset();
		
		PI.berechneZeile(test3);
		System.out.println();
		System.out.println("Aufwandsbestimmung PascalIterativ für Zeile" + test3 + ": " + PI.getOpCount());
		PI.reset();

		PI.berechneZeile(test4);
		System.out.println();
		System.out.println("Aufwandsbestimmung PascalIterativ für Zeile" + test4 + ": " + PI.getOpCount());
		PI.reset();
		
		PI.berechneZeile(test5);
		System.out.println();
		System.out.println("Aufwandsbestimmung PascalIterativ für Zeile" + test5 + ": " + PI.getOpCount());
		PI.reset();
		
		PI.berechneZeile(test6);
		System.out.println();
		System.out.println("Aufwandsbestimmung PascalIterativ für Zeile" + test6 + ": " + PI.getOpCount());
		PI.reset();
		
		PI.berechneZeile(test7);
		System.out.println();
		System.out.println("Aufwandsbestimmung PascalIterativ für Zeile" + test7 + ": " + PI.getOpCount());
		PI.reset();
		
		PI.berechneZeile(test8);
		System.out.println();
		System.out.println("Aufwandsbestimmung PascalIterativ für Zeile" + test8 + ": " + PI.getOpCount());
		PI.reset();

		PI.berechneZeile(test9);
		System.out.println();
		System.out.println("Aufwandsbestimmung PascalIterativ für Zeile" + test9 + ": " + PI.getOpCount());
		PI.reset();
		
		PI.berechneZeile(test10);
		System.out.println();
		System.out.println("Aufwandsbestimmung PascalIterativ für Zeile" + test10+ ": " + PI.getOpCount());
		PI.reset();
	}
}
