package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TelaCarrinho extends JFrame {

	private JPanel contentPane;
	private JTextField tfCodProduto;
	private JTextField tfNomeProduto;
	private JTextField tfValor;
	private JTextField tfQuantidade;
	private JTextField tfLote;
	private JTextField tfDesconto;
	private JTextField tfTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCarrinho frame = new TelaCarrinho();
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
	public TelaCarrinho() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 300);
		setTitle("Tela Carrinho");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbCodProduto = new JLabel("C\u00F3d. Produto");
		lbCodProduto.setBounds(93, 34, 73, 14);
		contentPane.add(lbCodProduto);
		
		tfCodProduto = new JTextField();
		tfCodProduto.setColumns(10);
		tfCodProduto.setBounds(178, 31, 86, 20);
		contentPane.add(tfCodProduto);
		
		JLabel lbNomeProduto = new JLabel("Nome produto");
		lbNomeProduto.setBounds(88, 62, 80, 14);
		contentPane.add(lbNomeProduto);
		
		tfNomeProduto = new JTextField();
		tfNomeProduto.setColumns(10);
		tfNomeProduto.setBounds(178, 59, 86, 20);
		contentPane.add(tfNomeProduto);
		
		JLabel lbValor = new JLabel("Valor R$");
		lbValor.setBounds(118, 89, 54, 14);
		contentPane.add(lbValor);
		
		tfValor = new JTextField();
		tfValor.setColumns(10);
		tfValor.setBounds(178, 87, 86, 20);
		contentPane.add(tfValor);
		
		JLabel lbQuantidade = new JLabel("Quantidade");
		lbQuantidade.setBounds(103, 119, 65, 14);
		contentPane.add(lbQuantidade);
		
		tfQuantidade = new JTextField();
		tfQuantidade.setColumns(10);
		tfQuantidade.setBounds(178, 116, 86, 20);
		contentPane.add(tfQuantidade);
		
		JLabel lbLote = new JLabel("Lote");
		lbLote.setBounds(358, 30, 25, 14);
		contentPane.add(lbLote);
		
		tfLote = new JTextField();
		tfLote.setColumns(10);
		tfLote.setBounds(396, 27, 86, 20);
		contentPane.add(tfLote);
		
		JLabel lbDesconto = new JLabel("Desconto");
		lbDesconto.setBounds(329, 58, 54, 14);
		contentPane.add(lbDesconto);
		
		tfDesconto = new JTextField();
		tfDesconto.setColumns(10);
		tfDesconto.setBounds(396, 55, 86, 20);
		contentPane.add(tfDesconto);
		
		JLabel lbPorcent = new JLabel("%");
		lbPorcent.setBounds(484, 58, 11, 14);
		contentPane.add(lbPorcent);
		
		JLabel lbTotal = new JLabel("Total R$");
		lbTotal.setBounds(337, 86, 61, 14);
		contentPane.add(lbTotal);
		
		tfTotal = new JTextField();
		tfTotal.setColumns(10);
		tfTotal.setBounds(396, 83, 86, 20);
		contentPane.add(tfTotal);
		
		JButton btFinalizar = new JButton("FINALIZAR");
		btFinalizar.setBounds(81, 227, 101, 23);
		contentPane.add(btFinalizar);
		
		JButton btDesconto = new JButton("DESCONTO");
		btDesconto.setBounds(190, 227, 101, 23);
		contentPane.add(btDesconto);
		
		JButton btRemover = new JButton("REMOVER");
		btRemover.setBounds(299, 227, 101, 23);
		contentPane.add(btRemover);
		
		JButton btMenuCarrinho = new JButton("MENU");
		btMenuCarrinho.setBounds(408, 227, 101, 23);
		contentPane.add(btMenuCarrinho);
	}

}
