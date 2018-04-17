package fractals;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Visualization {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Visualization window = new Visualization();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Visualization() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		MyPanel panel = new MyPanel(new Point(100, 10), new Point(20, 100), new Point(100, 200));
		panel.setBounds(10, 11, 414, 239);
		frame.getContentPane().add(panel);
	}
}
