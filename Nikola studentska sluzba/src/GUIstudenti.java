import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import javax.swing.JTree;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class GUIstudenti extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIstudenti frame = new GUIstudenti();
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
	public GUIstudenti() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 572, 379);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnDodaj = new JButton("Dodaj");
		btnDodaj.setBounds(109, 11, 89, 23);
		contentPane.add(btnDodaj);
		
		JButton btnNazad = new JButton(" Nazad");
		btnNazad.setBounds(10, 11, 89, 23);
		contentPane.add(btnNazad);
		
		JButton btnPrikaziSve = new JButton("Prikazi sve");
		btnPrikaziSve.setBounds(206, 11, 126, 23);
		contentPane.add(btnPrikaziSve);
		
		JButton btnIzmeni = new JButton("Izmeni");
		btnIzmeni.setBounds(342, 11, 89, 23);
		contentPane.add(btnIzmeni);
		
		JButton btnObrisi = new JButton("Obrisi");
		btnObrisi.setBounds(441, 11, 89, 23);
		contentPane.add(btnObrisi);
		
		JButton btnTrazi = new JButton("Trazi");
		btnTrazi.setBounds(58, 84, 89, 23);
		contentPane.add(btnTrazi);
		
		JLabel lblKriterijumPretrage = new JLabel("Kriterijum pretrage:");
		lblKriterijumPretrage.setBounds(159, 88, 135, 14);
		contentPane.add(lblKriterijumPretrage);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(274, 85, 69, 20);
		contentPane.add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(362, 85, 126, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnSortiraj = new JButton("Sortiraj");
		btnSortiraj.setBounds(145, 134, 89, 23);
		contentPane.add(btnSortiraj);
		
		JLabel label = new JLabel("Kriterijum pretrage:");
		label.setBounds(244, 138, 135, 14);
		contentPane.add(label);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(353, 135, 62, 20);
		contentPane.add(comboBox_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 180, 536, 150);
		contentPane.add(textArea);
	}
}
