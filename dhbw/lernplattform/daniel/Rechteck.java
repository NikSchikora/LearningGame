package dhbw.lernplattform.daniel;

import javax.swing.*;

public class Rechteck {


	private JLabel aufgabe;
	private double loesungDesAnwenders;

	public Rechteck() {
		aufgabe = new JLabel();
		WahlderAufg(0, hoeheZufall(), grundflaecheZufall());
	}

	public JLabel getAufgabenLabel() {
		return aufgabe;
	}

	/*
	public static void main(String[] args) {
		// TODO

		// Wahl der Aufgabe durch die Auswahlzahl + Zufallswerte
		WahlderAufg(Verteiler.zufallAufgabe(), hoeheZufall(), grundflaecheZufall());

	}// End main
	*/

	private void WahlderAufg(int zufallAufgabe, int hoeheZufall, int grundflaecheZufall) {
		// TODO
		loesungDesAnwenders = 0.0;

		switch (zufallAufgabe) {
		case 0: // Done
			aufgabe.setText("<html><body> Thema Rechteck <br> Aufgabe 1: <br> Berechnen Sie den Umfang <br> Höhe: " + hoeheZufall
					+ "<br> Grundfläche: " + grundflaecheZufall + "</body></html>");

			// Verteiler.message.setText("L�se nun folgende Aufgabe 1: berechenen sie den
			// Umfang des Dreiecks." + "\n"
			// + "Folgende Werte sind gegeben: \n" + "Hoehe: " + hoeheZufall + "\n" +
			// "Grundflaeche: "
			// + grundflaecheZufall);

			loesungDesAnwenders = berechnungUmfang(hoeheZufall, grundflaecheZufall);
			//Verteiler.eingabeundAuswertung(loesungDesAnwenders);

			break;

		case 1: // Done
			Verteiler.message.setText("<html><body> Thema Rechteck <br> Aufgabe 2: <br> Berechnen Sie den Umfang <br> H�he: " + hoeheZufall
					+ "<br> Grundfl�che: " + grundflaecheZufall + "</body></html>");

			// System.out.println("L�se nun folgende Aufgabe 2: Berechnen Sie den Umfang des
			// angebenen Rechtecks \n"
			// + "Gegebene Laenge: " + grundflaecheZufall + "\n" + "Gegebene Hohe: " +
			// hoeheZufall);

			loesungDesAnwenders = berechnungUmfang(hoeheZufall, grundflaecheZufall);
			Verteiler.eingabeundAuswertung(loesungDesAnwenders);

			break;

		case 2: // Done

			Verteiler.message.setText("<html><body> Thema Rechteck <br> Aufgabe 3: <br> Berechnen Sie die Fl�ache <br> H�he: " + hoeheZufall
					+ "<br> Grundfl�che: " + grundflaecheZufall + "</body></html>");

			loesungDesAnwenders = berechnungUmfang(hoeheZufall, grundflaecheZufall);
			Verteiler.eingabeundAuswertung(loesungDesAnwenders);

			break;

		case 3: // Flaggenbeispiel Afrika FEHLT
			Verteiler.message.setText("<html><body> Thema Rechteck <br> Aufgabe 4: <br><body><html>");
			break;
		case 4: // Beispiel Afrika FEHLT
			Verteiler.message.setText("<html><body> Thema Rechteck <br> Aufgabe 5: <br><body><html>");
			break;
		}
	}

	public String testValidate(double ergebnis) {
		String message = "";
		System.out.println("Debug");
		if(this.loesungDesAnwenders == ergebnis)  {
			message = "Joa richtig";
		} else message = "Eher Falsch";
		return message;
	}

	private static int hoeheZufall() {
		// TODO

		int hoehe = 0;
		hoehe = (int) (Math.random() * 20);
		return hoehe;
	}

	private static int grundflaecheZufall() {
		// TODO
		int grundflaeche = 0;
		grundflaeche = (int) (Math.random() * 20);
		return grundflaeche;
	}

	public static int berechnungUmfang(int laengeA, int laengeB) {

		int umfang = 0;
		umfang = 2 * laengeA + 2 * laengeB;
		return umfang;
	}

	public static double berechnungFlaeche(int hoehe, int breite) {

		double flaeche = 0.0;
		flaeche = breite * hoehe;
		return flaeche;
	}

}
