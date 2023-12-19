package view.gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class JFMain extends JFrame implements ActionListener{
	
	private JPanel pnlBackground;
	private JLabel lblTitle;
	private JButton btnAdd;
	private JButton btnSearch;
	private JButton btnModify;
	private JButton btnDelete;
	private JButton btnGetListChar;
	private JButton btnGetOrderList;
	
	
	public JFMain() {
					
			setSize(515,400);
			setLayout(null);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setResizable(false);
			this.getContentPane().setBackground(Color.white);
			
			lblTitle = new JLabel();
			pnlBackground = new JPanel();

			btnAdd = new JButton();
			btnSearch = new JButton();
			btnModify = new JButton();
			btnDelete = new JButton();
			btnGetListChar = new JButton();
			btnGetOrderList = new JButton();
			
			createHead();
			createBackground();
			createButton();
			
			add(lblTitle);
			add(pnlBackground);
			add(btnAdd);
			add(btnSearch);
			add(btnModify);
			add(btnDelete);
			pnlBackground.add(btnGetListChar);
			pnlBackground.add(btnGetOrderList);
			
			setVisible(true);
	}


	private void createButton() {
		btnAdd.setBackground(Color.decode("#0070C0"));
		btnAdd.setForeground(Color.white);
		btnAdd.setText("AGREGAR PALABRA");
		btnAdd.setBounds(20,110,200,50);
		
		btnSearch.setBackground(Color.decode("#0070C0"));
		btnSearch.setForeground(Color.white);
		btnSearch.setText("CONSULTAR PALABRA");
		btnSearch.setBounds(280,110,200,50);
		
		btnModify.setBackground(Color.decode("#0070C0"));
		btnModify.setForeground(Color.white);
		btnModify.setText("MODIFICAR PALABRA");
		btnModify.setBounds(20,170,200,50);
		
		btnDelete.setBackground(Color.decode("#0070C0"));
		btnDelete.setForeground(Color.white);
		btnDelete.setText("ELIMINAR PALABRA");
		btnDelete.setBounds(280,170,200,50);
		
		btnGetListChar.setBackground(Color.white);
		btnGetListChar.setForeground(Color.decode("#0070C0"));
		btnGetListChar.setText("OBTENER LISTA POR LETRA");
		btnGetListChar.setBounds(20,32,200,50);
		
		btnGetOrderList.setBackground(Color.white);
		btnGetOrderList.setForeground(Color.decode("#0070C0"));
		btnGetOrderList.setText("OBTENER LISTA ORDENADA");
		btnGetOrderList.setBounds(280,32,200,50);
	}

	private void createBackground() {
		pnlBackground.setLayout(null);
		pnlBackground.setBounds(0, 230, 515, 120);
		pnlBackground.setBackground(Color.decode("#0070C0"));
	}
	

	private void createHead() {
		lblTitle.setBounds(0,0,500,117);
		lblTitle.setBackground(Color.black);
		lblTitle.setIcon(new ImageIcon("Resource/TilteDictionary.png"));	
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
