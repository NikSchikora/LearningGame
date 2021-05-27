package dhbw.lernplattform.level;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import dhbw.lernplattform.daniel.Rechteck;
import dhbw.lernplattform.listeners.BackMenuListener;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class LevelAfrika extends JPanel {

	/**
	 * Create the panel.
	 */
	private Rechteck rechteck;

	public LevelAfrika() {

		setLayout(new BorderLayout());
		setSize(1200, 750);

		rechteck = new Rechteck();

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

		JLabel aufgabe = rechteck.getAufgabenLabel();
		aufgabe.setBounds(6, 100, 587, 80);
		panel.add(aufgabe);


		JLabel antwortLabel = new JLabel("Deine Antwort: ");
		antwortLabel.setBounds(6, 190, 291, 26);
		panel.add(antwortLabel);

		JTextField txtDeineAntwort = new JTextField();
		txtDeineAntwort.setBounds(6, 200, 291, 26);
		panel.add(txtDeineAntwort);
		txtDeineAntwort.setColumns(10);


		JLabel ergebnisMessage = new JLabel();
		ergebnisMessage.setBounds(6, 220, 226, 26);
		panel.add(ergebnisMessage);
		
		JButton weiterButton = new JButton("Weiter");
		weiterButton.setBounds(946, 660, 226, 42);
		weiterButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ergebnisMessage.setText(rechteck.testValidate(Double.parseDouble(txtDeineAntwort.getText())));
			}
		});
		main.add(weiterButton);
		 

		

	}
}
