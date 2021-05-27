package dhbw.lernplattform.daniel;

public class Kreis {

	public Kreis() {
	}

	public static void main(String[] args) {
		// Wahl der Aufgabe durch die Auswahlzahl + Zufallswerte
		wahlderAufg(Verteiler.zufallAufgabe(), radiusZufall());

	}// End main

	private static void wahlderAufg(int zufallAufgabe, int radiusZufall) {
		// TODO

		switch (zufallAufgabe) {
		case 0:
			Verteiler.message.setText("L�se nun folgende Aufgabe 1: " + radiusZufall + " = " + flaecheninhaltKreis(radiusZufall)
					+ " // " + umfangKreis(radiusZufall));
			break;
		case 1:
			Verteiler.message.setText("L�se nun folgende Aufgabe 2: " + radiusZufall + " = " + flaecheninhaltKreis(radiusZufall));
			break;
		case 2:
			Verteiler.message.setText("L�se nun folgende Aufgabe 3: " + radiusZufall + " = " + flaecheninhaltKreis(radiusZufall));
			break;
		case 3:
			Verteiler.message.setText("L�se nun folgende Aufgabe 4: " + radiusZufall + " = " + flaecheninhaltKreis(radiusZufall));
			break;
		case 4:
			Verteiler.message.setText("L�se nun folgende Aufgabe 5: " + radiusZufall + " = " + flaecheninhaltKreis(radiusZufall));
			break;
		}
	}

	private static int radiusZufall() {
		// TODO

		int radius = 0;
		radius = (int) (Math.random() * 20);

		return radius;
	}

	private static double flaecheninhaltKreis(int radiusZufall) {

		System.out.println(radiusZufall);
		double flaecheninhalt = 0.0;
		flaecheninhalt = Math.PI * ((radiusZufall) * (radiusZufall));
		return flaecheninhalt;
	}

	private static double umfangKreis(int radiusZufall) {

		double umfang = 0;
		umfang = 2 * Math.PI * radiusZufall;
		return umfang;

	}

}