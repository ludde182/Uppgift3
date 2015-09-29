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
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class GUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private String[] label = new String[] { "100 NOK", "Biggest Currency - SEK", "Address - Fotograferna AB",
			"Medical History - Employee", "Relative Data - Employees", "Andreas Berglund - Customers",
			"Bankkonton - kund #10 000", "All Customers", "All Employees" };
	private String[] docType = new String [] {"Microsoft Word" , "Microsoft Excel" , "Microsoft Access" };
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
		setResizable(false);
		getContentPane().setLayout(null);
		

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 305);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox<String> formatBox = new JComboBox<String>(docType);
		formatBox.setBounds(15, 156, 179, 26);
		contentPane.add(formatBox);

		JComboBox<String> comboBox = new JComboBox<String>(label);
		comboBox.setBounds(15, 90, 179, 26);
		contentPane.add(comboBox);

		JButton btnOpenDoc = new JButton("Open Document");
		btnOpenDoc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selectedItem = (String) comboBox.getSelectedItem();
				String selectedFormat = (String) formatBox.getSelectedItem();
				if (selectedItem.equals(label) && selectedFormat.equals("Microsoft Word")) {
					System.out.println("Inget dokument hittades!");
				}
				
				if (selectedItem.equals(label[7]) && selectedFormat.equals(docType[0])) {
					ctrl.openDocument("C:\\Uppgift3\\Uppgift2.1AllaKunder.docx");
				}

				if (selectedItem.equals(label[7]) && selectedFormat.equals(docType[1])) {
					ctrl.openDocument("C:\\Uppgift3\\uppg2.1AllaKunder.xlsx");
				}
				
				if (selectedItem.equals(label[7]) && selectedFormat.equals(docType[2])) {
					ctrl.openDocument("C:\\Uppgift3\\Access\\Uac2.1AllaKunder.accdb");
				}
				
				if (selectedItem.equals(label[8]) && selectedFormat.equals(docType[0])) {
					ctrl.openDocument("C:\\Uppgift3\\Uppgift2.2AllaAnstellda.docx");
				}

				if (selectedItem.equals(label[8]) && selectedFormat.equals(docType[1])) {
					ctrl.openDocument("C:\\Uppgift3\\uppg2.2AllaAnstellda.xlsx");
				}
				
				if (selectedItem.equals(label[8]) && selectedFormat.equals(docType[2])) {
					ctrl.openDocument("C:\\Uppgift3\\Access\\Uac2.2AllaAnstellda.accdb");
				}
				
//				if (selectedItem.equals(label[1]) && selectedFormat.equals(docType[2])) {
//					ctrl.openDocument("C:\\Uppgift3\\uppg1.2.xlsx");
//				}
//				
//				if (selectedItem.equals(label[2]) && selectedFormat.equals(docType[2])) {
//					ctrl.openDocument("C:\\Uppgift3\\uppg1.3.xlsx");
//				}
//				
//				if (selectedItem.equals(label[3]) && selectedFormat.equals(docType[2])) {
//					ctrl.openDocument("C:\\Uppgift3\\uppg1.4.xlsx");
//				}
//				
//				if (selectedItem.equals(label[4]) && selectedFormat.equals(docType[2])) {
//					ctrl.openDocument("C:\\Uppgift3\\uppg1.5.xlsx");
//				}
//				
//				if (selectedItem.equals(label[5]) && selectedFormat.equals(docType[1])); {
//					ctrl.openDocument("C:\\Uppgift3\\uppg1.6.xlsx");
//				}
//				
//				if (selectedItem.equals(label[5]) && selectedFormat.equals(docType[2])) {
//					ctrl.openDocument("C:\\Uppgift3\\Uppgift2.1AllaKunder.docx");
//				}
//				
//				if (selectedItem.equals(label[6]) && selectedFormat.equals(docType[2])) {
//					ctrl.openDocument("C:\\Uppgift3\\uppg1.7.xlsx");
//				}
//				if (selectedItem.equals(label[7])) {
//					ctrl.openDocument("C:\\Uppgift3\\uppg2.1AllaKunder.xlsx");
//				}
//				if (selectedItem.equals(label[8])) {
//					ctrl.openDocument("C:\\Uppgift3\\uppg2.2AllaAnstellda.xlsx");
//				}
			}
			
		});
		btnOpenDoc.setBounds(209, 90, 157, 26);
		contentPane.add(btnOpenDoc);
		

		
		JLabel lblInfo = new JLabel("Select document type");
		lblInfo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblInfo.setBounds(15, 132, 134, 20);
		contentPane.add(lblInfo);
		
		JLabel lblSelectDocument = new JLabel("Select document ");
		lblSelectDocument.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSelectDocument.setBounds(15, 66, 147, 20);
		contentPane.add(lblSelectDocument);

	}
}
