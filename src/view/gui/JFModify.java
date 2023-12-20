package view.gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import logic.control.Handling;
import logic.model.Word;

public class JFModify extends JFrame implements ActionListener{
	private Handling hndl;
	private JFMain main;
	
	private JPanel pnlBackground;
	private JLabel lblTitle;
	
	private JButton btnBack;
	private JButton btnSave;
	private JButton btnSearch;
	
	private JLabel lblWord;
	private JLabel lblTranslate;
	private JLabel lblDescription;
	private JTextField txtSearch;
	private JTextField txtWord;
	private JTextField txtTranslate;
	private JTextArea txtDescription;
	private JScrollPane scrollPane;
    
	
	public JFModify(Handling hand, JFMain main) {
		
		setSize(515,400);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		this.getContentPane().setBackground(Color.white);
		
		hndl = hand;
		this.main = main;
		
		lblTitle = new JLabel();
		pnlBackground = new JPanel();
		
		btnSearch = new JButton();
		lblWord = new JLabel();
		lblTranslate = new JLabel();
		lblDescription = new JLabel();
		
		txtSearch = new JTextField();
		txtWord = new JTextField();
		txtTranslate = new JTextField();
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
		add(btnSearch);
		add(lblWord);
		add(lblTranslate);
		add(lblDescription);
		add(txtSearch);
		add(txtWord);
		add(txtTranslate);
		add(scrollPane);
		pnlBackground.add(btnBack);
		pnlBackground.add(btnSave);
		
		setVisible(true);
		setLocationRelativeTo(null);
	}

	private void createLabel() {
		
		lblWord.setBounds(20,140,200,50);
		lblWord.setText("PALABRA");
		
		lblTranslate.setBounds(20,180,200,50);
		lblTranslate.setText("TRADUCCIÓN");
		
		lblDescription.setBounds(20,220,200,50);
		lblDescription.setText("DESCRIPCIÓN");
	}

	private void createTextBox() {
		txtSearch.setBounds(200,110,275,30);
		txtSearch.setEditable(true);
		txtWord.setBounds(200,150,275,30);
		txtWord.setEditable(false);
		txtTranslate.setBounds(200,190,275,30);
	  	txtDescription.setLineWrap(true);
	 	txtDescription.setWrapStyleWord(true);
	 	scrollPane.setBounds(200,230,275,30);
	}
		
	private void createButton() {
		
		btnSearch.setBackground(Color.decode("#0070C0"));
		btnSearch.setForeground(Color.white);
		btnSearch.setText("BUSCAR");
		btnSearch.setBounds(20,110,150,30);
		
		btnBack.setBackground(Color.white);
		btnBack.setForeground(Color.decode("#0070C0"));
		btnBack.setText("VOLVER");
		btnBack.setBounds(20,15,200,50);
		
		btnSave.setBackground(Color.white);
		btnSave.setForeground(Color.decode("#0070C0"));
		btnSave.setText("MODIFICAR");
		btnSave.setBounds(280,15,200,50);
		
		btnSearch.addActionListener(this);
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
			main.setVisible(true);
			this.setVisible(false);
		} else if (e.getSource() == btnSave) {
			if(txtWord.getText().equals("") || txtTranslate.getText().equals("") || txtDescription.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Asegurese de llenar todos los campos.");
			} else {
				Word w = new Word(txtWord.getText().toUpperCase(),txtTranslate.getText(),txtDescription.getText());
				txtSearch.setEditable(true);
				hndl.modifyWord(txtSearch.getText().toUpperCase(), w);
				JOptionPane.showMessageDialog(null, "Modificado con éxito.");
			}
		} else if (e.getSource() == btnSearch) {
			Word w = hndl.takeWord(txtSearch.getText().toUpperCase());
			if(w == null) {
				JOptionPane.showMessageDialog(null, "Palabra no encontrada");
			}else {
				txtSearch.setEditable(false);
				txtWord.setText(w.getWord());
				txtTranslate.setText(w.getTranslate());
				txtDescription.setText(w.getDescription());
			}
			
		}
	}
}
