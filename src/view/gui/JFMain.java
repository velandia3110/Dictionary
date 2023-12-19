package view.gui;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class JFMain extends JFrame{
	
	private JPanel pnlBackground;
	private JPanel pnlBody;
	private JLabel lblTitle;
	private JButton btnAdd;
	private JButton btnSearch;
	private JButton btnModify;
	private JButton btnGetChar;
	private JButton btnGetList;
	
	
	public JFMain() {
					
			setSize(515,400);
			setLayout(null);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setResizable(false);
			this.getContentPane().setBackground(Color.white);
			
			lblTitle = new JLabel();
			pnlBackground = new JPanel();
			
			createHead();
			createBackground();
			
			add(lblTitle);
			add(pnlBackground);
			
			setVisible(true);
	}


	private void createBackground() {
		pnlBackground.setBounds(0, 230, 515, 120);
		pnlBackground.setBackground(Color.decode("#0070C0"));
		
	}


	private void createHead() {
		lblTitle.setBounds(0,0,500,117);
		lblTitle.setBackground(Color.black);
		lblTitle.setIcon(new ImageIcon("Resource/TilteDictionary.png"));	
	}
}
