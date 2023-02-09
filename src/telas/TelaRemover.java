package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class TelaRemover extends JFrame {

	private JPanel contentPane;
	private JTextField tfCodProduto;
	private JTextField tfQuantidade;
	private JTextField tfLote;
	private JTextField tfValidade;
	private JTextField tfDataCompra;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaRemover frame = new TelaRemover();
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
	public TelaRemover() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 300);
		setTitle("Tela Remover");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btPesquisar = new JButton("PESQUISAR");
		btPesquisar.setBounds(128, 227, 105, 23);
		contentPane.add(btPesquisar);
		
		JButton btnAlterar = new JButton("ALTERAR");
		btnAlterar.setBounds(243, 227, 105, 23);
		contentPane.add(btnAlterar);
		
		JButton btTelaEstoque = new JButton("ESTOQUE");
		btTelaEstoque.setBounds(358, 227, 105, 23);
		contentPane.add(btTelaEstoque);
		
		tfCodProduto = new JTextField();
		tfCodProduto.setColumns(10);
		tfCodProduto.setBounds(262, 23, 86, 20);
		contentPane.add(tfCodProduto);
		
		tfQuantidade = new JTextField();
		tfQuantidade.setColumns(10);
		tfQuantidade.setBounds(262, 54, 86, 20);
		contentPane.add(tfQuantidade);
		
		tfLote = new JTextField();
		tfLote.setColumns(10);
		tfLote.setBounds(262, 85, 86, 20);
		contentPane.add(tfLote);
		
		tfValidade = new JTextField();
		tfValidade.setColumns(10);
		tfValidade.setBounds(262, 116, 86, 20);
		contentPane.add(tfValidade);
		
		tfDataCompra = new JTextField();
		tfDataCompra.setColumns(10);
		tfDataCompra.setBounds(262, 147, 86, 20);
		contentPane.add(tfDataCompra);
		
		JLabel lblNewLabel = new JLabel("C\u00F3d. Produto");
		lblNewLabel.setBounds(188, 26, 64, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Quantidade");
		lblNewLabel_1.setBounds(196, 57, 56, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Lote");
		lblNewLabel_2.setBounds(231, 88, 21, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Validade");
		lblNewLabel_3.setBounds(212, 119, 40, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Data compra");
		lblNewLabel_4.setBounds(188, 150, 64, 14);
		contentPane.add(lblNewLabel_4);
	}

}
