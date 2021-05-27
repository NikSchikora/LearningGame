package dhbw.lernplattform.listeners;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

import dhbw.lernplattform.App;
import dhbw.lernplattform.panels.erklaerungen.ErklaerungAfrika;
import dhbw.lernplattform.panels.erklaerungen.ErklaerungEuropa;
import dhbw.lernplattform.panels.erklaerungen.ErklaerungNordamerika;

public class KlickLevelListener implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
	
		String name = e.getComponent().getName();
		if(name == null) name = "";
		switch (name.toLowerCase()) {

		case "afrika":
			if (App.getInstance().getSpieler().canCompleteLevel(3)) {
				App.getInstance().setContentPane(new ErklaerungAfrika());
			} else {
				JOptionPane.showMessageDialog(null, "Das Level ist noch nicht freigeschalten", "Fehler!", 0);
			}
			break;
			
		case "europa":
			if (App.getInstance().getSpieler().canCompleteLevel(2)) {
				App.getInstance().setContentPane(new ErklaerungEuropa());
			} else {
				JOptionPane.showMessageDialog(null, "Das Level ist noch nicht freigeschalten", "Fehler!", 0);
			}
			break;
			
		case "nordamerika":
			if (App.getInstance().getSpieler().canCompleteLevel(1)) {
				App.getInstance().setContentPane(new ErklaerungNordamerika());
			} else {
				JOptionPane.showMessageDialog(null, "Das Level ist noch nicht freigeschalten", "Fehler!", 0);
			}
			break;
			
			default:
				JOptionPane.showMessageDialog(null, "Hier gibts nix", "Fehler!", 0);

		}
		App.getInstance().revalidate();

	
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
