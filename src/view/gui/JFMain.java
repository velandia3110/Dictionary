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
			pnlBody = new JPanel();
			
			btnAdd = new JButton("Añadir palabra");
			btnSearch = new JButton("Buscar palabra");
			btnModify = new JButton("Editar palabra");
			btnGetList = new JButton("Listar diccionario");
			btnGetChar = new JButton("Listar por letra");
			
			createHead();
			createBackground();
			createBody();
			
			add(lblTitle);
			add(pnlBackground);
			add(pnlBody);
			
			
			pnlBody.add(btnAdd);
			pnlBody.add(btnSearch);
			pnlBody.add(btnModify);
			pnlBody.add(btnGetList);
			pnlBody.add(btnGetChar);
			
			setVisible(true);
	}


	private void createBackground() {
		pnlBackground.setBounds(0, 230, 515, 120);
		pnlBackground.setBackground(Color.decode("#0070C0"));
		
		
	}

	private void createBody() {
		pnlBody.setBounds(0, 100, 500, 163);
		btnAdd.setBounds(100, 50, 200, 50);
		btnSearch.setBounds(100, 120, 200, 50);
		btnModify.setBounds(100, 190, 200, 50);
		btnGetList.setBounds(100, 260, 200, 50);
		btnGetChar.setBounds(100, 330, 200, 50);
	}

	private void createHead() {
		lblTitle.setBounds(0,0,500,117);
		lblTitle.setBackground(Color.black);
		lblTitle.setIcon(new ImageIcon("Resource/TilteDictionary.png"));	
	}
}
