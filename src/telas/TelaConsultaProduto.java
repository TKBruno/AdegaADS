package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaConsultaProduto extends JFrame {

	private JPanel contentPane;
	private JTextField tfCodProduto;
	private JTextField tfNomeProduto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaConsultaProduto frame = new TelaConsultaProduto();
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
	public TelaConsultaProduto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 300);
		setTitle("Tela Consulta Produto");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btPesquisar = new JButton("PESQUISAR");
		btPesquisar.setBounds(124, 227, 105, 23);
		contentPane.add(btPesquisar);
		
		JButton btAlterar = new JButton("ALTERAR");
		btAlterar.setBounds(239, 227, 105, 23);
		contentPane.add(btAlterar);
		
		JButton btTelaCadastro = new JButton("CADASTRO");
		btTelaCadastro.setBounds(354, 227, 105, 23);
		contentPane.add(btTelaCadastro);
		
		JLabel lbCdProduto = new JLabel("C\u00F3d. Produto");
		lbCdProduto.setBounds(207, 88, 64, 14);
		contentPane.add(lbCdProduto);
		
		tfCodProduto = new JTextField();
		tfCodProduto.setColumns(10);
		tfCodProduto.setBounds(281, 85, 86, 20);
		contentPane.add(tfCodProduto);
		
		tfNomeProduto = new JTextField();
		tfNomeProduto.setColumns(10);
		tfNomeProduto.setBounds(281, 116, 86, 20);
		contentPane.add(tfNomeProduto);
		
		JLabel lbNomeProduto = new JLabel("Nome produto");
		lbNomeProduto.setBounds(203, 119, 68, 14);
		contentPane.add(lbNomeProduto);
	}

}
