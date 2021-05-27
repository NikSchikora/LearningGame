package dhbw.lernplattform.panels.erklaerungen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import dhbw.lernplattform.listeners.BackMenuListener;
import dhbw.lernplattform.listeners.KlickLevelListener;
import dhbw.lernplattform.listeners.StartLevelListener;

@SuppressWarnings("serial")
public class ErklaerungAfrika extends JPanel {
	private JLabel afrika;
	/**
	 * Create the panel.
	 */
	public ErklaerungAfrika() {
		setLayout(new BorderLayout());
		setSize(1200, 750);
		
		JPanel main = new JPanel();
		main.setBackground(Color.WHITE);
		main.setSize(1200,700);
		add(main);
		main.setLayout(null);
		
		ImageIcon icon = new ImageIcon("/Users/leonie/Documents/Eclipse/Mathe_Lernplattform/Afrika.png");
		Image img = icon.getImage();
		Image newImg = img.getScaledInstance(454, 541, Image.SCALE_FAST);
		icon = new ImageIcon(newImg);
		afrika = new JLabel(icon);
		afrika.setBounds(0, 130, 454, 541);
		afrika.addMouseListener(new KlickLevelListener());
		
		main.add(afrika);
		
		JLabel level = new JLabel("Level 3: Geometrische Formen");
		level.setFont(new Font("Arial", Font.BOLD, 20));
		level.setBounds(6, 40, 299, 42);
		main.add(level);
		
		JButton levelStart = new JButton("Klick um das Level zu starten ");
		levelStart.setFont(new Font("Arial", Font.BOLD, 16));
		levelStart.setBounds(648, 670, 546, 44);
		levelStart.addActionListener(new StartLevelListener());
		
		main.add(levelStart);
		
		JButton back = new JButton("Zurück");
		back.setBounds(6, 6, 117, 29);
		back.addActionListener(new BackMenuListener());
			
		main.add(back);
	}

}
