package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class TelaAdicionar extends JFrame {

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
					TelaAdicionar frame = new TelaAdicionar();
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
	public TelaAdicionar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 300);
		setTitle("Tela Adicionar");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btSalvar = new JButton("SALVAR");
		btSalvar.setBounds(184, 227, 105, 23);
		contentPane.add(btSalvar);
		
		JButton btTelaEstoque = new JButton("ESTOQUE");
		btTelaEstoque.setBounds(299, 227, 105, 23);
		contentPane.add(btTelaEstoque);
		
		tfCodProduto = new JTextField();
		tfCodProduto.setColumns(10);
		tfCodProduto.setBounds(258, 23, 86, 20);
		contentPane.add(tfCodProduto);
		
		tfQuantidade = new JTextField();
		tfQuantidade.setColumns(10);
		tfQuantidade.setBounds(258, 54, 86, 20);
		contentPane.add(tfQuantidade);
		
		tfLote = new JTextField();
		tfLote.setColumns(10);
		tfLote.setBounds(258, 85, 86, 20);
		contentPane.add(tfLote);
		
		tfValidade = new JTextField();
		tfValidade.setColumns(10);
		tfValidade.setBounds(258, 116, 86, 20);
		contentPane.add(tfValidade);
		
		tfDataCompra = new JTextField();
		tfDataCompra.setColumns(10);
		tfDataCompra.setBounds(258, 147, 86, 20);
		contentPane.add(tfDataCompra);
		
		JLabel lbCodProduto = new JLabel("C\u00F3d. Produto");
		lbCodProduto.setBounds(184, 26, 64, 14);
		contentPane.add(lbCodProduto);
		
		JLabel lbQuantidade = new JLabel("Quantidade");
		lbQuantidade.setBounds(192, 57, 56, 14);
		contentPane.add(lbQuantidade);
		
		JLabel lbLote = new JLabel("Lote");
		lbLote.setBounds(227, 88, 21, 14);
		contentPane.add(lbLote);
		
		JLabel lbValidade = new JLabel("Validade");
		lbValidade.setBounds(208, 119, 40, 14);
		contentPane.add(lbValidade);
		
		JLabel lbDataCompra = new JLabel("Data compra");
		lbDataCompra.setBounds(184, 150, 64, 14);
		contentPane.add(lbDataCompra);
	}
}
