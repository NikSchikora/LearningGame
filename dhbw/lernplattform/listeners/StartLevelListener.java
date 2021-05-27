package dhbw.lernplattform.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dhbw.lernplattform.App;
import dhbw.lernplattform.level.LevelAfrika;

public class StartLevelListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		App.getInstance().setContentPane(new LevelAfrika());
		App.getInstance().revalidate();
	}

}
