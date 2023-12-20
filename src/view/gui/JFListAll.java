package view.gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

import logic.control.Handling;
import logic.model.Word;

public class JFListAll extends JFrame implements ActionListener {

	private Handling hndl;

	private JPanel pnlBackground;
	private JLabel lblTitle;

	private JButton btnBack;
	private JButton btnSearch;

	private JLabel lblWord;
	private JTextField txtWord;
	
	private JTable JTInfoDictionary;
	private JScrollPane JSPTable;

	private JFMain vMain;

	public JFListAll(Handling hand, JFMain main) {
		setSize(515, 400);
		setLayout(null);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		this.getContentPane().setBackground(Color.white);

		hndl = hand;
		vMain = main;

		lblTitle = new JLabel();
		pnlBackground = new JPanel();

		lblWord = new JLabel();

		txtWord = new JTextField();

		btnBack = new JButton();
		btnSearch = new JButton();

		JTInfoDictionary = new JTable();
		JSPTable = new JScrollPane();
		
		createHead();
		createBackground();
		createLabel();
		createButton();
		createTextBox();
		createTable();
		
		add(lblTitle);
		add(pnlBackground);
		add(lblWord);
		add(txtWord);
		add(JSPTable);
		pnlBackground.add(btnBack);
		

		setVisible(true);
		setLocationRelativeTo(null);
	}

	private void createTable() {
		JSPTable.setBounds(20,160,400,100);
		JSPTable.setViewportView(JTInfoDictionary);
		JSPTable.setVisible(true);
		
		JTInfoDictionary.setModel(modelTable());
		JTInfoDictionary.setRowHeight(40);
		
		TableColumn columna1 = this.JTInfoDictionary.getColumn("Nombre");
		TableColumn columna2 = this.JTInfoDictionary.getColumn("Traduccion");
		TableColumn columna3 = this.JTInfoDictionary.getColumn("Descripcion");
		
		columna1.setPreferredWidth(70);
		columna2.setPreferredWidth(70);
		columna3.setPreferredWidth(120);
		
	}

	private TableModel modelTable() {
		DefaultTableModel model = new DefaultTableModel() {
			@Override
			public boolean isCellEditable(int row, int column) {
				return true;
			}
		};
		String head[] = { "Nombre", "Traduccion", "Descripcion"};
		model.setColumnIdentifiers(head);
		Object[] fila;
		HashMap<String,List<Word>>  fullList = hndl.getOrderList();
		for(Map.Entry<String,List<Word>> listM: fullList.entrySet()) {
			for (Word d : listM.getValue()) {

				fila = new Object[3];
				fila[0] = d.getWord();
				fila[1] = d.getTranslate();
				fila[2] = d.getDescription();
				model.addRow(fila);

			}
		}
		
		return model;
	}

	private void createTextBox() {
		txtWord.setBounds(200,110,70,30);
		
	}

	private void createLabel() {
		lblWord.setBounds(20, 100, 200, 50);
		lblWord.setText("INGRESE LA CONSULTA");

	}

	private void createButton() {

		btnBack.setBackground(Color.white);
		btnBack.setForeground(Color.decode("#0070C0"));
		btnBack.setText("VOLVER");
		btnBack.setBounds(20, 15, 200, 50);
		
		btnSearch.setBounds(350, 110, 100, 30);
		btnSearch.setText("BUSCAR");
		
		btnBack.addActionListener(this);
		btnSearch.addActionListener(this);
	}

	private void createBackground() {
		pnlBackground.setLayout(null);
		pnlBackground.setBounds(0, 270, 515, 80);
		pnlBackground.setBackground(Color.decode("#0070C0"));
	}

	private void createHead() {
		lblTitle.setBounds(0, 0, 500, 117);
		lblTitle.setBackground(Color.black);
		lblTitle.setIcon(new ImageIcon("Resource/TilteDictionary.png"));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == btnBack) {
			vMain.setVisible(true);
			this.setVisible(false);

		}
	}

}

