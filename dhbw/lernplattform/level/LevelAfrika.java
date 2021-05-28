package dhbw.lernplattform.level;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import dhbw.lernplattform.App;
import dhbw.lernplattform.daniel.Kreis;
import dhbw.lernplattform.daniel.Rechteck;
import dhbw.lernplattform.listeners.BackMenuListener;
import dhbw.lernplattform.tasks.Level;
import dhbw.lernplattform.tasks.Task;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class LevelAfrika extends JPanel {

	/**
	 * Create the panel.
	 */
	private ArrayList<Task> allTasks;

	public LevelAfrika() {
		
		//GEt tasks
		allTasks = new ArrayList<>();
		allTasks.addAll(new Rechteck().getTasks());
		allTasks.addAll(new Kreis().getTasks());
		

		setLayout(new BorderLayout());
		setSize(1200, 750);

		JPanel main = new JPanel();
		main.setBackground(Color.WHITE);
		main.setSize(1200, 700);
		add(main);
		main.setLayout(null);

		JButton back = new JButton("Zurück");
		back.setBounds(6, 6, 117, 29);
		back.addActionListener(new BackMenuListener());
		main.add(back);

		JLabel level = new JLabel("Level 3: Geometrische Formen");
		level.setFont(new Font("Arial", Font.BOLD, 20));
		level.setBounds(6, 40, 299, 42);
		main.add(level);

		

		JPanel panel = new JPanel();
		panel.setBounds(16, 127, 1156, 290);
		main.add(panel);
		panel.setLayout(null);

		JLabel alert = new JLabel();
		alert.setBounds(6, 6, 300, 40);
		panel.add(alert);
		
		
		
		JLabel[] tasks = new JLabel[allTasks.size()];
		JTextField[] inputs = new JTextField[allTasks.size()];

		for(int i = 0; i < allTasks.size(); i++) {
			//Add Labels with messages
			tasks[i] = new JLabel(allTasks.get(i).getMessage());
			tasks[i].setBounds(6, 20 + (60 * i), 750, 50);

			//Add Inputs
			inputs[i] = new JTextField();
			inputs[i].setBounds(800, 20 + (60*i), 80, 20);

			panel.add(inputs[i]);
			panel.add(tasks[i]);
		}
		
		JButton weiterButton = new JButton("Weiter");
		weiterButton.setBounds(946, 660, 226, 42);
		weiterButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//Check for all answers
				for(JTextField field : inputs) {
					try {
						Double.parseDouble(field.getText());
					} catch (Exception ex) {
						alert.setText("Fehler: Fülle alle Felder mit einem Ergebnis aus.");
						return;
					}
				}
				int correct = 0;
				//Check answers
				for(int i = 0; i < tasks.length; i++) {
					System.out.println("Checking : " + i);
					Task cors = allTasks.get(i);
					System.out.println("Answer: " + cors.getAnswer());
					System.out.println("Eingabe: " + Double.parseDouble(inputs[i].getText()));
					if(cors.getAnswer() == Double.parseDouble(inputs[i].getText())) {
						correct++;
						System.out.println(correct);
					}
				}
				System.out.println("----");
				if(correct == (allTasks.size())) {
					alert.setText("Alles richtig brudi");
					App.getInstance().getSpieler().levelgeschafft();
				}

			}
		});
		main.add(weiterButton);
		 

		

	}
}
