package dhbw.lernplattform.panels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import dhbw.lernplattform.listeners.KlickLevelListener;

@SuppressWarnings("serial")
public class Startoberflaeche extends JPanel {
	private JLabel afrika;
	private JLabel nordamerika;
	private JLabel suedamerika;
	private JLabel groenland;
	private JLabel europa;
	private JLabel asien;
	private JLabel australien;
//	private JLabel welt;

	/**
	 * Create the panel.
	 */
	public Startoberflaeche() {
		setLayout(new BorderLayout());
		setSize(1200, 750);
		
		JPanel main = new JPanel();
		main.setBackground(Color.WHITE);
		main.setSize(1200,700);
		add(main);
		main.setLayout(null);
		
		JButton btnNewButton = new JButton("Klicke den freigeschaltenen Kontinen an, um das Spiel zu starten");
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 16));
		btnNewButton.setBounds(648, 670, 546, 44);
		main.add(btnNewButton);
		
//		Welt
//		ImageIcon icon = new ImageIcon("/Users/leonie/Documents/Eclipse/Mathe_Lernplattform/Weltkarte.png");
//		Image img = icon.getImage();
//		Image newImg = img.getScaledInstance(1200, 700, Image.SCALE_FAST);
//		icon = new ImageIcon(newImg);
//		welt = new JLabel(icon);
//		welt.setBounds(0, 0, 1200, 700);
	
//		main.add(welt);
		
//		Afrika
		ImageIcon iconAfrika = new ImageIcon(getClass().getResource("../images/Afrika.png"));
		Image imgAfrika = iconAfrika.getImage();
		Image newImgAfrika = imgAfrika.getScaledInstance(278, 326, Image.SCALE_FAST);
		iconAfrika = new ImageIcon(newImgAfrika);
		afrika = new JLabel(iconAfrika);
		afrika.setName("Afrika");
		afrika.setBounds(485, 288, 278, 326);
		afrika.addMouseListener(new KlickLevelListener());
	
		main.add(afrika);
		
//		Nordamerika
		ImageIcon iconNordamerika = new ImageIcon(getClass().getResource("../images/Nordamerika.png"));
		Image imgNordamerika = iconNordamerika.getImage();
		Image newImgNordamerika = imgNordamerika.getScaledInstance(399, 326, Image.SCALE_FAST);
		iconNordamerika = new ImageIcon(newImgNordamerika);
		nordamerika = new JLabel(iconNordamerika);
		nordamerika.setName("Nordamerika");
		nordamerika.setBounds(0, 81, 399, 326);
		nordamerika.addMouseListener(new KlickLevelListener());
		
		main.add(nordamerika);
		
//		Europa
		ImageIcon iconEuropa = new ImageIcon(getClass().getResource("../images/Europa.png"));
		Image imgEuropa = iconEuropa.getImage();
		Image newImgEuropa = imgEuropa.getScaledInstance(205, 187, Image.SCALE_FAST);
		iconEuropa = new ImageIcon(newImgEuropa);
		europa = new JLabel(iconEuropa);
		europa.setName("Europa");
		europa.setBounds(518, 102, 205, 187);
		europa.addMouseListener(new KlickLevelListener());
		
		main.add(europa);
		
//		Suedamerika
		ImageIcon iconSuedamerika = new ImageIcon(getClass().getResource("../images/Suedamerika.png"));
		Image imgSuedamerika = iconSuedamerika.getImage();
		Image newImgSuedamerika = imgSuedamerika.getScaledInstance(301, 293, Image.SCALE_FAST);
		iconSuedamerika = new ImageIcon(newImgSuedamerika);
		suedamerika = new JLabel(iconSuedamerika);
		suedamerika.setBounds(252, 380, 301, 293);
		suedamerika.addMouseListener(new KlickLevelListener());
		
		
		main.add(suedamerika);
		
//		Groenland
		ImageIcon iconGroenland = new ImageIcon(getClass().getResource("../images/Groenland.png"));
		Image imgGroenland = iconGroenland.getImage();
		Image newImgGroenland = imgGroenland.getScaledInstance(156, 166, Image.SCALE_FAST);
		iconGroenland = new ImageIcon(newImgGroenland);
		groenland = new JLabel(iconGroenland);
		groenland.setBounds(362, 6, 156, 166);
		groenland.addMouseListener(new KlickLevelListener());
		
		
		main.add(groenland);
		
		
//		Asien
		ImageIcon iconAsien = new ImageIcon(getClass().getResource("../images/Asien.png"));
		Image imgAsien = iconAsien.getImage();
		Image newImgAsien = imgAsien.getScaledInstance(546, 423, Image.SCALE_FAST);
		iconAsien = new ImageIcon(newImgAsien);
		asien = new JLabel(iconAsien);
		asien.setBounds(654, 62, 546, 423);
		asien.addMouseListener(new KlickLevelListener());
		
		main.add(asien);
		
//		Australien
		ImageIcon iconAustralien = new ImageIcon(getClass().getResource("../images/Australien.png"));
		Image imgAustralien = iconAustralien.getImage();
		Image newImgAustralien = imgAustralien.getScaledInstance(168, 146, Image.SCALE_FAST);
		iconAustralien = new ImageIcon(newImgAustralien);
		australien = new JLabel(iconAustralien);
		australien.setBounds(957, 480, 168, 146);
		australien.addMouseListener(new KlickLevelListener());
		
		main.add(australien);
		
	}
}
