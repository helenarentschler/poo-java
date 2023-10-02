package gui;

import java.awt.EventQueue;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import entidades.Aluno;

public class AlunoGUI extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	
	public void cadastrar() {
		
		Aluno novoAluno = new Aluno();
		
		novoAluno.setRA(Integer.parseInt(this.txt_ra.getText()));
		novoAluno.setNome(this.txt_nome.getText());
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlunoGUI frame = new AlunoGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	/**
	 * Create the frame.
	 */
	public AlunoGUI() {
		
		this.initComponents();
	}	
	public void initComponents() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 544, 415);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 528, 28);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Arquivo");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Sair");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_1 = new JMenu("Ajuda");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Sobre");
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 36, 508, 214);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(52, 11, 288, 22);
		panel.add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("Registro Acadêmico");
		
		TextField txt_ra = new TextField();
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_1)
					.addGap(7)
					.addComponent(txt_ra, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(txt_ra, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(4)
							.addComponent(lblNewLabel_1)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(52, 49, 404, 22);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		TextField txt_nome = new TextField();
		txt_nome.setBounds(68, 0, 336, 22);
		panel_2.add(txt_nome);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(26, 4, 36, 14);
		panel_2.add(lblNewLabel);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "Sexo", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(52, 84, 115, 104);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Masculino");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(6, 21, 95, 23);
		panel_3.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Feminino");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(6, 47, 93, 23);
		panel_3.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNoInformar = new JRadioButton("Não informar");
		buttonGroup.add(rdbtnNoInformar);
		rdbtnNoInformar.setBounds(6, 75, 103, 23);
		panel_3.add(rdbtnNoInformar);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(255, 82, 201, 22);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JComboBox combo_curso = new JComboBox();
		combo_curso.setBounds(41, 0, 160, 22);
		panel_4.add(combo_curso);
		
		JLabel lblNewLabel_2 = new JLabel("Curso");
		lblNewLabel_2.setBounds(0, 4, 45, 14);
		panel_4.add(lblNewLabel_2);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(177, 113, 175, 22);
		panel.add(panel_1_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Data de Ingresso");
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		GroupLayout gl_panel_1_1 = new GroupLayout(panel_1_1);
		gl_panel_1_1.setHorizontalGroup(
			gl_panel_1_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_1_1)
					.addGap(18)
					.addComponent(formattedTextField, GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
		);
		gl_panel_1_1.setVerticalGroup(
			gl_panel_1_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1_1.createSequentialGroup()
					.addGroup(gl_panel_1_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(formattedTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1_1))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_1_1.setLayout(gl_panel_1_1);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(362, 115, 94, 20);
		panel.add(panel_5);
		panel_5.setLayout(null);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(64, 0, 30, 20);
		panel_5.add(spinner);
		
		JLabel lblNewLabel_3 = new JLabel("Período");
		lblNewLabel_3.setBounds(10, 3, 55, 14);
		panel_5.add(lblNewLabel_3);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBounds(221, 146, 131, 22);
		panel.add(panel_1_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("Coeficiente");
		
		TextField textField_2 = new TextField();
		GroupLayout gl_panel_1_2 = new GroupLayout(panel_1_2);
		gl_panel_1_2.setHorizontalGroup(
			gl_panel_1_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_1_2)
					.addGap(7)
					.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
		);
		gl_panel_1_2.setVerticalGroup(
			gl_panel_1_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1_2.createSequentialGroup()
					.addGroup(gl_panel_1_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1_2.createSequentialGroup()
							.addGap(4)
							.addComponent(lblNewLabel_1_2))
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_1_2.setLayout(gl_panel_1_2);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadastrar();
			}
		});
		btnNewButton.setBounds(205, 179, 113, 23);
		panel.add(btnNewButton);
		
		JButton btnLimparCampos = new JButton("Limpar Campos");
		btnLimparCampos.setBounds(328, 179, 128, 23);
		panel.add(btnLimparCampos);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new TitledBorder(null, "Alunos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_6.setBounds(11, 261, 507, 104);
		contentPane.add(panel_6);
		panel_6.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 22, 487, 68);
		panel_6.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setColumnSelectionAllowed(true);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"Nome", "Curso", "Per\u00EDodo", "RA", "Sexo", "Coeficiente", "Ingresso"
			}
		));
	}
}
