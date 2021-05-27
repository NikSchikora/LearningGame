package dhbw.lernplattform.daniel;

public class Dreieck {

	public Dreieck() {
	}

	public static void main(String[] args) {
		// TODO

		// Wahl der Aufgabe durch die Auswahlzahl + Zufallswerte
		wahlderAufg(Verteiler.zufallAufgabe(), hoeheZufall(), grundflaecheZufall());

	}// End main

	private static void wahlderAufg(int zufallAufgabe, int hoeheZufall, int grundflaecheZufall) {
		// TODO

		double loesungDesAnwenders = 0.0;

		switch (zufallAufgabe) {
		case 0:// Done Flaeche
			Verteiler.message.setText("L�se nun folgende Aufgabe 1: Berechnen Sie die Flaeche des Dreiecks");
			Verteiler.message.setText("Gegebene Hoehe: " + hoeheZufall);
			Verteiler.message.setText("Gegebene Grundflaeche: " + grundflaecheZufall);

			loesungDesAnwenders = flaecheninhaltDreieck(hoeheZufall, grundflaecheZufall);
			Verteiler.eingabeundAuswertung(loesungDesAnwenders);

			break;

		case 1:// Done Flaeche
			Verteiler.message.setText("L�se nun folgende Aufgabe 2: Berechnen Sie den Umfang des Dreieckes");
			Verteiler.message.setText("Gegebene Hoehe: " + hoeheZufall);
			Verteiler.message.setText("Gegebene Grundflaeche: " + grundflaecheZufall);

			loesungDesAnwenders = flaecheninhaltDreieck(hoeheZufall, grundflaecheZufall);
			Verteiler.eingabeundAuswertung(loesungDesAnwenders);

			break;

		case 2:// Done Umfang
			Verteiler.message.setText("L�se nun folgende Aufgabe 3: Berechnen Sie den Umfang des Dreiecks");
			Verteiler.message.setText("Gegebene Hoehe: " + hoeheZufall);
			Verteiler.message.setText("Gegebene Grundflaeche: " + grundflaecheZufall);

			loesungDesAnwenders = umfangDreieck(hoeheZufall, grundflaecheZufall);
			Verteiler.eingabeundAuswertung(loesungDesAnwenders);

			break;

		case 3:// Afrika Beispiel
			System.out.println("L�se nun folgende Aufgabe 4: " + hoeheZufall + " + " + grundflaecheZufall + " = ");
			break;
		case 4:// Afrika Beispiel
			System.out.println("L�se nun folgende Aufgabe 5: " + hoeheZufall + " + " + grundflaecheZufall + " = ");
			break;
		}
	}

	private static double umfangDreieck(int hoeheZufall, int grundflaecheZufall) {
		// TODO
		double umfang = 0.0;
		double hypothenuse = Math.hypot(hoeheZufall, grundflaecheZufall);

		umfang = hoeheZufall + grundflaecheZufall + hypothenuse;

		return umfang;
	}

	private static double flaecheninhaltDreieck(int hoeheZufall, int grundflaecheZufall) {
		// TODO

		double flaecheninhalt = 0.0;
		flaecheninhalt = (0.5 * hoeheZufall * grundflaecheZufall);
		return flaecheninhalt;

	}

	public static int hoeheZufall() {
		// TODO

		int hoehe = 0;
		hoehe = (int) (Math.random() * 20);
		return hoehe;
	}

	public static int grundflaecheZufall() {
		// TODO
		int grundflaeche = 0;
		grundflaeche = (int) (Math.random() * 20);
		return grundflaeche;
	}

}
