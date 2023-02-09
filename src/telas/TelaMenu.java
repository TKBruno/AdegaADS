package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class TelaMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaMenu frame = new TelaMenu();
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
	public TelaMenu() {
		setResizable(false);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 290);
		setTitle("Tela Menu");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JButton btCarrinho = new JButton("CARRINHO");
		btCarrinho.setBounds(154, 110, 114, 38);
		contentPane.add(btCarrinho);
		
		JButton btEstoque = new JButton("ESTOQUE");
		btEstoque.setBounds(291, 110, 104, 38);
		contentPane.add(btEstoque);
		
		JButton btFornecedor = new JButton("FORNECEDOR");
		btFornecedor.setBounds(154, 170, 114, 31);
		contentPane.add(btFornecedor);
		
		JButton btProdutos = new JButton("PRODUTOS");
		btProdutos.setBounds(291, 170, 104, 31);
		contentPane.add(btProdutos);
		
		JButton btRelatorio = new JButton("RELAT\u00D3RIO");
		btRelatorio.setBounds(434, 219, 100, 31);
		contentPane.add(btRelatorio);
		
			JLabel lblNewLabel = new JLabel("");
			ImageIcon icon = new ImageIcon("C:\\Users\\bruno\\OneDrive\\Área de Trabalho\\Adega(telas) com botões\\Slide2.PNG");
			Image img = icon.getImage();
			Image imgScale =img.getScaledInstance(544, 261, Image.SCALE_SMOOTH);
			lblNewLabel.setIcon(new ImageIcon(imgScale));
			lblNewLabel.setBounds(0, 0, 544, 261);
			contentPane.add(lblNewLabel);
	}

}
