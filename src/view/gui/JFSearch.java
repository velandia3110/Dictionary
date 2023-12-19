package view.gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import logic.control.Handling;
import logic.model.Word;

public class JFSearch  extends JFrame implements ActionListener{
	
	private Handling hndl;
	
	private JPanel pnlBackground;
	private JLabel lblTitle;
	
	private JButton btnBack;
	private JButton btnSave;
	
	private JLabel lblWord;
	private JLabel lblDescription;
	
	private JTextField txtWord;
	private JTextArea txtDescription;
	private JScrollPane scrollPane;
	
	private JFMain vMain;
	
	public JFSearch(Handling hand, JFMain main) {
		
		setSize(515,400);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		this.getContentPane().setBackground(Color.white);
		
		hndl = hand;
		vMain = main;
		
		lblTitle = new JLabel();
		pnlBackground = new JPanel();
		
		lblWord = new JLabel();
		lblDescription = new JLabel();
		
		txtWord = new JTextField();
		txtDescription = new JTextArea();
		 scrollPane = new JScrollPane(txtDescription);
		
        btnBack = new JButton();
        btnSave = new JButton();
        
		createHead();
		createBackground();
		createLabel();
		createTextBox();
		createButton();
		
		add(lblTitle);
		add(pnlBackground);
		add(lblWord);
		add(lblDescription);
		add(txtWord);
		add(scrollPane);
		pnlBackground.add(btnBack);
		pnlBackground.add(btnSave);
		
		setVisible(true);
		setLocationRelativeTo(null);
	}

	private void createLabel() {
		lblWord.setBounds(20,100,200,50);
		lblWord.setText("INGRESE LA CONSULTA");
		
		lblDescription.setBounds(20,135,200,50);
		lblDescription.setText("CONSULTA:");
	}

	private void createTextBox() {
		txtWord.setBounds(200,110,275,30);
	 	
	  	txtDescription.setLineWrap(true);
	 	txtDescription.setWrapStyleWord(true);
	 	txtDescription.setEditable(false);
	 	scrollPane.setBounds(30,175,445,80);
	}
		
	private void createButton() {
		
		btnBack.setBackground(Color.white);
		btnBack.setForeground(Color.decode("#0070C0"));
		btnBack.setText("VOLVER");
		btnBack.setBounds(20,15,200,50);
		
		btnSave.setBackground(Color.white);
		btnSave.setForeground(Color.decode("#0070C0"));
		btnSave.setText("BUSCAR");
		btnSave.setBounds(280,15,200,50);
		
		btnBack.addActionListener(this);
		btnSave.addActionListener(this);
	}

	private void createBackground() {
		pnlBackground.setLayout(null);
		pnlBackground.setBounds(0, 270, 515, 80);
		pnlBackground.setBackground(Color.decode("#0070C0"));
	}


	private void createHead() {
		lblTitle.setBounds(0,0,500,117);
		lblTitle.setBackground(Color.black);
		lblTitle.setIcon(new ImageIcon("Resource/TilteDictionary.png"));	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnBack) {
			vMain.setVisible(true);
			this.setVisible(false);

		} else if (e.getSource() == btnSave) {
			txtDescription.setText(hndl.searchMeaning(txtWord.getText()));
		}
		
	}

}
