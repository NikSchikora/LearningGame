package dhbw.lernplattform;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import dhbw.lernplattform.listeners.CloseAppListener;
import dhbw.lernplattform.panels.Startoberflaeche;
import dhbw.lernplattform.spieler.Spieler;

@SuppressWarnings("serial")
public class App extends JFrame {

	private JPanel contentPane;
	private Spieler spieler;
	
	public static App getInstance() {
		return instance;
	}
	
	private static App instance;
	
	private Startoberflaeche start;
	public Startoberflaeche getStartoberflaeche() {
		return this.start;
	}
	
	public Spieler getSpieler() {
		return this.spieler;
	}
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App frame = new App();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public App() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		addWindowListener(new CloseAppListener());
		setTitle("Lernplattform");
		setBounds(100, 100, 1200, 760);
		setResizable(false);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		start= new Startoberflaeche();
		contentPane.add(this.start);
		
		instance = this;
		
		setLocationRelativeTo(null);
		String name = "";
		
		name = JOptionPane.showInputDialog(null, "Gib dein Name ein", "Spielername", JOptionPane.QUESTION_MESSAGE);
		spieler = new Spieler(name);
		
	}

}
