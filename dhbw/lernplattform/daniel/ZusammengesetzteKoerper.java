/**
 * 
 */
package dhbw.lernplattform.daniel;

/**
 * @author durst-clau
 *
 */
public class ZusammengesetzteKoerper {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Wahl der Aufgabe durch die Auswahlzahl + Zufallswerte
		wahlderAufg(Verteiler.zufallAufgabe(), Dreieck.hoeheZufall(), Dreieck.grundflaecheZufall());

	}// End main

	private static void wahlderAufg(int zufallAufgabe, int hoeheZufall, int grundflaecheZufall) {
		// TODO

		switch (zufallAufgabe) {
		case 0:
			Verteiler.message
					.setText("L�se nun folgende Aufgabe 1: " + hoeheZufall + " + " + grundflaecheZufall + " = ");
			break;
		case 1:
			Verteiler.message
					.setText("L�se nun folgende Aufgabe 2: " + hoeheZufall + " + " + grundflaecheZufall + " = ");
			break;
		case 2:
			Verteiler.message
					.setText("L�se nun folgende Aufgabe 3: " + hoeheZufall + " + " + grundflaecheZufall + " = ");
			break;
		case 3:
			Verteiler.message
					.setText("L�se nun folgende Aufgabe 4: " + hoeheZufall + " + " + grundflaecheZufall + " = ");
			break;
		case 4:
			Verteiler.message
					.setText("L�se nun folgende Aufgabe 5: " + hoeheZufall + " + " + grundflaecheZufall + " = ");
			break;
		}
	}
}
