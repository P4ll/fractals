package fractals;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.EventQueue;

public class Visualization {

	private JFrame frame;
	private JTextField angleCountField;
	private static volatile int angleCount = -1;

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
		frame.setBounds(100, 100, 520, 430);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		MyPanel panel = new MyPanel(new Point(100, 10), new Point(20, 100), new Point(100, 200));
		panel.setBounds(10, 141, 414, 239);
		frame.getContentPane().add(panel);
		
		angleCountField = new JTextField();
		angleCountField.setBounds(92, 11, 86, 20);
		frame.getContentPane().add(angleCountField);
		angleCountField.setColumns(10);
		
		JLabel label = new JLabel("\u041A\u043E\u043B-\u0432\u043E \u0443\u0433\u043B\u043E\u0432");
		label.setBounds(10, 14, 77, 14);
		frame.getContentPane().add(label);
		
		JButton btnSetPoint = new JButton("\u0417\u0430\u0434\u0430\u0442\u044C \u0442\u043E\u0447\u043A\u0438");
		btnSetPoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				angleCount = Integer.parseInt(angleCountField.getText());
				Thread inputWindow = new Thread(new Runnable() {
					private JFrame fr;
					@Override
					public void run() {
						fr = new JFrame();
						fr.setBounds(100, 100, 520, 430);
						fr.getContentPane().setLayout(null);
						fr.setVisible(true);
					}
					
				});
				inputWindow.setName("inputWindow Thread");
				inputWindow.start();
			}
		});
		btnSetPoint.setBounds(10, 42, 168, 44);
		frame.getContentPane().add(btnSetPoint);
	}
}
