package dhbw.lernplattform.daniel;

import java.util.ArrayList;

import dhbw.lernplattform.tasks.Task;

public class Kreis  {

	private double loesungDesAnwenders;
	private ArrayList<Task> tasks;

	public Kreis() {
		tasks = new ArrayList<>();
		for(int i = 0; i < 2; i++) {
			tasks.add(wahlderAufg(0, radiusZufall(), i));
		}
		
	}

	public ArrayList<Task> getTasks() {
		return tasks;
	}
		

	//public static void main(String[] args) {
		// Wahl der Aufgabe durch die Auswahlzahl + Zufallswerte
	//	wahlderAufg(Verteiler.zufallAufgabe(), radiusZufall());
	// End main


	
	public Task wahlderAufg(int zufallAufgabe, int radiusZufall, int index ) {
		// TODO
		loesungDesAnwenders=0;
		Task task = new Task();

		switch (zufallAufgabe) {
		case 0:
			task.setMessage("L�se nun folgende Aufgabe 1: " + radiusZufall + " = " + flaecheninhaltKreis(radiusZufall)
					+ " // " + umfangKreis(radiusZufall));

					task.setAnswer(umfangKreis(radiusZufall));
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