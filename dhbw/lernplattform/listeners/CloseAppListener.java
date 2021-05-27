package dhbw.lernplattform.listeners;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class CloseAppListener implements WindowListener {

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent e) {
		ImageIcon icon = new ImageIcon(new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB));
		int beenden = JOptionPane.showConfirmDialog(null,
				"Willst du das Spiel wirklich beenden? Dein aktueller Stand wird nicht gespeichert!", "Warnung?!",
				JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, icon);

		if (beenden == JOptionPane.YES_OPTION) {
			System.exit(0);
		}

	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

}
