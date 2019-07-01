import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIIspiti extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIIspiti frame = new GUIIspiti();
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
	public GUIIspiti() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnDodajIspitStudenta = new JButton("Dodaj ispit studenta");
		btnDodajIspitStudenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDodajIspitStudenta.setBounds(23, 38, 154, 34);
		contentPane.add(btnDodajIspitStudenta);
		
		JButton button = new JButton("Obrisi ispit studenta");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(241, 38, 154, 34);
		contentPane.add(button);
		
		JButton NazadBTN = new JButton("Nazad");
		NazadBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				System.out.println("BTN nazad clicked");
				
			}
		});
		NazadBTN.setBounds(155, 147, 122, 34);
		contentPane.add(NazadBTN);
	}
}
