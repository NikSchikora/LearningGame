package dhbw.lernplattform.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import dhbw.lernplattform.App;

public class BackMenuListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		ImageIcon icon = new ImageIcon(new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB));
		int beenden = JOptionPane.showConfirmDialog(null, "Willst du das Level beenden? Dein aktueller Stand wird nicht gespeichert!", "Warnung?!",
				JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, icon);
		
		if (beenden == JOptionPane.YES_OPTION) {
			App.getInstance().setContentPane(App.getInstance().getStartoberflaeche());
			App.getInstance().revalidate();
		}

	}

}
