package de.hgs.itg23.scheduling.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class View extends JFrame {

	 JPanel contentPane;
	 JTable table;
	 JButton btnNewButton_1;
	 JButton btnNewButton;
    public JTable getTable() {
    		
    		return table;
    };
    

	public View() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setBounds(5, 5, 474, 128);
		contentPane.add(table);
		
		btnNewButton = new JButton("Delete");
		btnNewButton.setBounds(267, 139, 109, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Append");
	
		btnNewButton_1.setBounds(111, 138, 109, 23);
		contentPane.add(btnNewButton_1);
	}
}
