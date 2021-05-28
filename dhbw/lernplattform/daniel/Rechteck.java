package dhbw.lernplattform.daniel;

import dhbw.lernplattform.tasks.Task;

import javax.swing.*;
import java.util.ArrayList;

public class Rechteck  {


	private double loesungDesAnwenders;
	private ArrayList<Task> tasks;

	public Rechteck() {
		tasks = new ArrayList<>();
		for(int i = 0; i < 2; i++) {
			tasks.add(wahlderAufg(0, hoeheZufall(), grundflaecheZufall(), i));
			System.out.println("Added task " + i);
		}

	}

	public ArrayList<Task> getTasks() {
		return tasks;
	}


	/*
	public static void main(String[] args) {
		// TODO

		// Wahl der Aufgabe durch die Auswahlzahl + Zufallswerte
		WahlderAufg(Verteiler.zufallAufgabe(), hoeheZufall(), grundflaecheZufall());

	}// End main
	*/

	public Task wahlderAufg(int zufallAufgabe, int hoeheZufall, int grundflaecheZufall, int index) {
		// TODO
		loesungDesAnwenders = 0.0;

		Task task = new Task();

		switch (zufallAufgabe) {
		case 0: // Done

			task.setMessage("<html><body> Thema Rechteck Aufgabe " + index + ":  Berechnen Sie den Umfang  Höhe: " + hoeheZufall
					+ " Grundfläche: " + grundflaecheZufall + "</body></html>");

			// Verteiler.message.setText("L�se nun folgende Aufgabe 1: berechenen sie den
			// Umfang des Dreiecks." + "\n"
			// + "Folgende Werte sind gegeben: \n" + "Hoehe: " + hoeheZufall + "\n" +
			// "Grundflaeche: "
			// + grundflaecheZufall);

			task.setAnswer(berechnungUmfang(hoeheZufall, grundflaecheZufall));
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
		return task;
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
