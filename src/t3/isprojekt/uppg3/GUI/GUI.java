package t3.isprojekt.uppg3.GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import t3.isprojekt.uppg3.controller.Controller;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class GUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private String[] label = new String[] { "100 NOK", "Biggest Currency - SEK", "Address - Fotograferna AB",
			"Medical History - Employee", "Relative Data - Employees", "Andreas Berglund - Customers",
			"Bankkonton - kund #10 000" };
	private Controller ctrl = new Controller();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JComboBox<String> comboBox = new JComboBox<String>(label);
		comboBox.setBounds(114, 67, 179, 26);
		contentPane.add(comboBox);

		JButton btnppnaDokument = new JButton("Open Document");
		btnppnaDokument.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selectedItem = (String) comboBox.getSelectedItem();
				if (selectedItem.equals(label[0])) {
					ctrl.openDocument("");
				}
				
				if (selectedItem.equals(label[1])) {
					ctrl.openDocument("");
				}
				
				if (selectedItem.equals(label[2])) {
					ctrl.openDocument("");
				}
				
				if (selectedItem.equals(label[3])) {
					ctrl.openDocument("");
				}
				
				if (selectedItem.equals(label[4])) {
					ctrl.openDocument("");
				}
				
				if (selectedItem.equals(label[5])) {
					ctrl.openDocument("");
				}
				
				if (selectedItem.equals(label[6])) {
					ctrl.openDocument("");
				}
			}
			
		});
		btnppnaDokument.setBounds(114, 108, 179, 29);
		contentPane.add(btnppnaDokument);

	}
}
