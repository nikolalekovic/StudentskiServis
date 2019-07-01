import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

public class GUImain extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUImain frame = new GUImain();
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
	public GUImain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		GUIstudenti newFrame = new GUIstudenti();
		JButton btnStudenti = new JButton("Studenti");
		btnStudenti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 
				 if(!newFrame.isVisible())
					{newFrame.setVisible(true);}
				 }
				
			
		});
		btnStudenti.setBounds(176, 56, 89, 23);
		contentPane.add(btnStudenti);
		
		JButton btnPredmeti = new JButton("Predmeti");
		btnPredmeti.setBounds(176, 114, 89, 23);
		contentPane.add(btnPredmeti);
		
		GUIIspiti guii = new GUIIspiti();
		JButton btnIspiti = new JButton("Ispiti");
		btnIspiti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				 if(!guii.isVisible())
					{guii.setVisible(true);}
				 }
				
			
		});
		btnIspiti.setBounds(176, 175, 89, 23);
		contentPane.add(btnIspiti);
		
		
	}
}
