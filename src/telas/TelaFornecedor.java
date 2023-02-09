package telas;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaFornecedor extends JFrame {

	private JPanel contentPane;
	private JTextField tfCodFornecedor;
	private JTextField tfRazaoSocial;
	private JTextField tfCNPJ;
	private JTextField tfEndereco;
	private JTextField tfNumero;
	private JTextField tfBairro;
	private JTextField tfTelefone;
	private JTextField tfCelular;
	private JTextField tfEmail;
	private JTextField tfContato;
	private JTextField tfEstado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaFornecedor frame = new TelaFornecedor();
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
	public TelaFornecedor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 300);
		setTitle("Tela Fornecedor");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btConsulta = new JButton("CONSULTA");
		btConsulta.setBounds(470, 11, 105, 23);
		contentPane.add(btConsulta);
		
		JButton btSalvar = new JButton("SALVAR");
		btSalvar.setBounds(81, 227, 105, 23);
		contentPane.add(btSalvar);
		
		JButton btAlterar = new JButton("ALTERAR");
		btAlterar.setBounds(196, 227, 105, 23);
		contentPane.add(btAlterar);
		
		JButton btDeletar = new JButton("DELETAR");
		btDeletar.setBounds(311, 227, 105, 23);
		contentPane.add(btDeletar);
		
		JButton btMenuFornecedor = new JButton("MENU");
		btMenuFornecedor.setBounds(426, 227, 89, 23);
		contentPane.add(btMenuFornecedor);
		
		JLabel lbCodFornecedor = new JLabel("C\u00F3d. Fornecedor");
		lbCodFornecedor.setBounds(10, 62, 81, 14);
		contentPane.add(lbCodFornecedor);
		
		tfCodFornecedor = new JTextField();
		tfCodFornecedor.setColumns(10);
		tfCodFornecedor.setBounds(100, 59, 86, 20);
		contentPane.add(tfCodFornecedor);
		
		tfRazaoSocial = new JTextField();
		tfRazaoSocial.setColumns(10);
		tfRazaoSocial.setBounds(100, 90, 86, 20);
		contentPane.add(tfRazaoSocial);
		
		tfCNPJ = new JTextField();
		tfCNPJ.setColumns(10);
		tfCNPJ.setBounds(100, 121, 86, 20);
		contentPane.add(tfCNPJ);
		
		JLabel lbEndereco = new JLabel("Endere\u00E7o");
		lbEndereco.setBounds(242, 62, 45, 14);
		contentPane.add(lbEndereco);
		
		tfEndereco = new JTextField();
		tfEndereco.setColumns(10);
		tfEndereco.setBounds(297, 59, 86, 20);
		contentPane.add(tfEndereco);
		
		tfNumero = new JTextField();
		tfNumero.setColumns(10);
		tfNumero.setBounds(297, 90, 86, 20);
		contentPane.add(tfNumero);
		
		tfBairro = new JTextField();
		tfBairro.setColumns(10);
		tfBairro.setBounds(297, 121, 86, 20);
		contentPane.add(tfBairro);
		
		JLabel lbTelefone = new JLabel("Telefone");
		lbTelefone.setBounds(434, 62, 45, 14);
		contentPane.add(lbTelefone);
		
		tfTelefone = new JTextField();
		tfTelefone.setColumns(10);
		tfTelefone.setBounds(489, 59, 86, 20);
		contentPane.add(tfTelefone);
		
		tfCelular = new JTextField();
		tfCelular.setColumns(10);
		tfCelular.setBounds(489, 90, 86, 20);
		contentPane.add(tfCelular);
		
		tfEmail = new JTextField();
		tfEmail.setColumns(10);
		tfEmail.setBounds(489, 121, 86, 20);
		contentPane.add(tfEmail);
		
		JLabel lbRazoSocial = new JLabel("Raz\u00E3o Social");
		lbRazoSocial.setBounds(31, 93, 60, 14);
		contentPane.add(lbRazoSocial);
		
		JLabel lbCnpj = new JLabel("CNPJ");
		lbCnpj.setBounds(65, 124, 25, 14);
		contentPane.add(lbCnpj);
		
		JLabel lbNumero = new JLabel("N\u00FAmero");
		lbNumero.setBounds(248, 93, 39, 14);
		contentPane.add(lbNumero);
		
		JLabel lbBairro = new JLabel("Bairro");
		lbBairro.setBounds(259, 124, 28, 14);
		contentPane.add(lbBairro);
		
		JLabel lbCelular = new JLabel("Celular");
		lbCelular.setBounds(444, 93, 39, 14);
		contentPane.add(lbCelular);
		
		JLabel lbEmail = new JLabel("E-mail");
		lbEmail.setBounds(451, 124, 28, 14);
		contentPane.add(lbEmail);
		
		JLabel lbContato = new JLabel("Contato");
		lbContato.setBounds(52, 155, 39, 14);
		contentPane.add(lbContato);
		
		tfContato = new JTextField();
		tfContato.setColumns(10);
		tfContato.setBounds(100, 152, 86, 20);
		contentPane.add(tfContato);
		
		JLabel lbEstado = new JLabel("Estado");
		lbEstado.setBounds(254, 155, 33, 14);
		contentPane.add(lbEstado);
		
		tfEstado = new JTextField();
		tfEstado.setColumns(10);
		tfEstado.setBounds(297, 152, 86, 20);
		contentPane.add(tfEstado);
	}

}
