package dhbw.lernplattform.daniel;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Verteiler {

	public final static JLabel message = new JLabel();

	public static int fehlerAnzahl = 0; // Fehlervariable erstellen -> barucht bei der Methode eingabe und spaeter bei
										// der Auswertung
	public static int bestandenJaNein = 0; // Ja = 1 / Nein = 0

	public static void main(String[] args) {
		// TODO

		// Erklaerung
		Erklaerung.main(args);

		// Suche der Aufgaben
		for (int i = 1; i <= 3; i++) {
			System.out.println("1");
			//Rechteck.main(args);
		}

		for (int j = 1; j <= 3; j++) {
			System.out.println("2");
			//Kreis.main(args);
		}

		for (int d = 1; d <= 3; d++) {
			System.out.println("3");
			Dreieck.main(args);
		}

		for (int t = 1; t <= 3; t++) {
			System.out.println("4");
			ZusammengesetzteKoerper.main(args);
		} // Ende der Aufgaben

		// Ergebnis
		// BESTANDEN ODER NICHT
		bestandenJaNein(fehlerAnzahl);

	}// Ende Main

	private static void bestandenJaNein(int fehlerAnzahl) {
		// TODO

		if (fehlerAnzahl >= 2) {
			JOptionPane.showMessageDialog(null,
					"<html> <body> Sie haben nicht bestanden <br> Sie haben Fehler: " + fehlerAnzahl + "<body> <html>");
			bestandenJaNein = 0;

		} else {
			JOptionPane.showMessageDialog(null,
					"<html> <body> GL�CKWUNSCH! <br> Sie haben bestanden <br> Sie haben Fehler: " + fehlerAnzahl + "<body> <html>");
			bestandenJaNein = 1;
		}
	}

	public static void eingabeundAuswertung(double loesungDesAnwenders) {
		// TODO
		double eingabe = 0.0;

		// if ()) {
		// eingabe = Integer.parseInt(JOptionPane.showInputDialog(null, message));
		// }

		while (true) {
			try {

				eingabe = Integer.parseInt(JOptionPane.showInputDialog(null, message)); // Fenster erstellen das Aufgabe
																						// ausgibt und Eingabe einlie�t
				break;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Eingabe war keine Zahl!"); // rausfiltern von Eingaben die keine
																				// Zahlen
			}
		}

		if (eingabe != loesungDesAnwenders) {

			// message.setText("Das Ergebnis ist Falsch. Richtig w�re gewesen: " +
			// loesungDesAnwenders + "\n");

			fehlerAnzahl++;

		} else {
			// message.setText("Richtig");
		}
	}

	public static int zufallAufgabe() {
		// TODO

		int zufallsAufgabe = 0;
		zufallsAufgabe = (int) (Math.random() * 4);
		return zufallsAufgabe;
	}
}
