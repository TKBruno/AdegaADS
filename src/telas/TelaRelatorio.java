package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TelaRelatorio extends JFrame {

	private JPanel contentPane;
	private JTextField tfDataInicio;
	private JTextField tfDataFim;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaRelatorio frame = new TelaRelatorio();
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
	public TelaRelatorio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 300);
		setTitle("Tela Relatório");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbDataInicio = new JLabel("Data in\u00EDcio:");
		lbDataInicio.setBounds(203, 85, 53, 14);
		contentPane.add(lbDataInicio);
		
		JLabel lbDataFim = new JLabel("Data fim:");
		lbDataFim.setBounds(210, 127, 46, 14);
		contentPane.add(lbDataFim);
		
		tfDataInicio = new JTextField();
		tfDataInicio.setColumns(10);
		tfDataInicio.setBounds(271, 82, 86, 20);
		contentPane.add(tfDataInicio);
		
		tfDataFim = new JTextField();
		tfDataFim.setColumns(10);
		tfDataFim.setBounds(271, 124, 86, 20);
		contentPane.add(tfDataFim);
		
		JButton btVencimentos = new JButton("VENCIMENTOS");
		btVencimentos.setBounds(77, 227, 105, 23);
		contentPane.add(btVencimentos);
		
		JButton btEntradas = new JButton("ENTRADAS");
		btEntradas.setBounds(192, 227, 105, 23);
		contentPane.add(btEntradas);
		
		JButton btSaidas = new JButton("SA\u00CDDAS");
		btSaidas.setBounds(307, 227, 105, 23);
		contentPane.add(btSaidas);
		
		JButton btMenuRelatorio = new JButton("MENU");
		btMenuRelatorio.setBounds(422, 227, 89, 23);
		contentPane.add(btMenuRelatorio);
	}

}
