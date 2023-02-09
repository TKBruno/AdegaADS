package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaProduto extends JFrame {

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
					TelaProduto frame = new TelaProduto();
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
	public TelaProduto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 300);
		setTitle("Tela Produto");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btSalvar = new JButton("SALVAR");
		btSalvar.setBounds(49, 227, 105, 23);
		contentPane.add(btSalvar);
		
		JButton btnAlterar = new JButton("ALTERAR");
		btnAlterar.setBounds(164, 227, 105, 23);
		contentPane.add(btnAlterar);
		
		JButton btnDeletar = new JButton("DELETAR");
		btnDeletar.setBounds(279, 227, 105, 23);
		contentPane.add(btnDeletar);
		
		JButton btMenuProdutos = new JButton("MENU");
		btMenuProdutos.setBounds(394, 227, 89, 23);
		contentPane.add(btMenuProdutos);
		
		JLabel lbCdProduto = new JLabel("C\u00F3d. Produto");
		lbCdProduto.setBounds(189, 88, 64, 14);
		contentPane.add(lbCdProduto);
		
		tfCodProduto = new JTextField();
		tfCodProduto.setColumns(10);
		tfCodProduto.setBounds(263, 85, 86, 20);
		contentPane.add(tfCodProduto);
		
		tfNomeProduto = new JTextField();
		tfNomeProduto.setColumns(10);
		tfNomeProduto.setBounds(263, 116, 86, 20);
		contentPane.add(tfNomeProduto);
		
		JLabel lbNomeProduto = new JLabel("Nome produto");
		lbNomeProduto.setBounds(185, 119, 68, 14);
		contentPane.add(lbNomeProduto);
		
		JButton btConsultaProdutos = new JButton("CONSULTAR");
		btConsultaProdutos.setBounds(469, 11, 105, 23);
		contentPane.add(btConsultaProdutos);
	}

}
