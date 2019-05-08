package com.syntel.asset;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Testing {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Testing window = new Testing();
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
	public Testing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 766, 507);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblAsset = new JLabel("asset");
		lblAsset.setBounds(10, 11, 46, 14);
		frame.getContentPane().add(lblAsset);
		
		
		
		String asset[]= {"SPL","SYL","SL"};
		@SuppressWarnings("unchecked")
		JComboBox<?> comboBox = new JComboBox<Object>(asset);
		comboBox.setBounds(10, 33, 84, 22);
		frame.getContentPane().add(comboBox);
		frame.setVisible(true);
		frame.getContentPane().add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(503, 30, 247, 29);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblBuilding = new JLabel("building");
		lblBuilding.setBounds(120, 11, 46, 14);
		frame.getContentPane().add(lblBuilding);
		
		
		String building[]= {"S1","S2","S3","S4","S5","S6"};
		
		
		JComboBox<?> comboBox_1 = new JComboBox<Object>(building);
		comboBox_1.setBounds(120, 33, 69, 22);
		frame.getContentPane().add(comboBox_1);
		frame.setVisible(true);
		frame.getContentPane().add(comboBox_1);
		
		JRadioButton rdbtnDell = new JRadioButton("DELL");
		rdbtnDell.setBounds(214, 33, 56, 22);
		frame.getContentPane().add(rdbtnDell);
		
		String year[]= {"2014","2015","2016","2017","2018","2019","2020"};
		
		JComboBox<?> comboBox_2 = new JComboBox<Object>(year);
		comboBox_2.setBounds(295, 33, 69, 22);
		frame.getContentPane().add(comboBox_2);
		frame.setVisible(true);
		frame.getContentPane().add(comboBox_2);
		
		
		JLabel lblYear = new JLabel("Year");
		lblYear.setBounds(295, 11, 46, 14);
		frame.getContentPane().add(lblYear);
		
		textField_1 = new JTextField();
		textField_1.setBounds(399, 34, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnShow = new JButton("show");
		btnShow.addActionListener(new ActionListener() {
			/**
			 * 
			 */
			public void actionPerformed(ActionEvent arg0) {
			String ast=(String) comboBox.getItemAt(comboBox.getSelectedIndex());
			String building=(String) comboBox_1.getItemAt(comboBox_1.getSelectedIndex());
			String year=(String) comboBox_2.getItemAt(comboBox_2.getSelectedIndex());
			
			
		//	System.out.println(rdbtnDell.getText());
			textField.setText(ast+"/"+building+"/"+rdbtnDell.getText()+"/"+year+"/"+textField_1.getText());
			
			//textField.setText(building);
				
				
				
			}
		});
		btnShow.setBounds(513, 78, 89, 23);
		frame.getContentPane().add(btnShow);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"make", "Asset", "Serial no"
			}
		));
		table.setBounds(55, 438, 580, -210);
		frame.getContentPane().add(table);
		
	
	}
}
