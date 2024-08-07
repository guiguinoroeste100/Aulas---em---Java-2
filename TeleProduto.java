package view;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import entities.Produto;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TeleProduto {

	private JFrame frmProdutos;
	private JTextField jTFId;
	private JTextField jTFNome;
	private JTextField jTFCategoria;
	private JTextField jTFQuantidade;
	private JTextField jTFPreco;
	private JTextField jTFDisplay;
	private Produto[] produtos = new Produto[1000];
	private int i = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeleProduto window = new TeleProduto();
					window.frmProdutos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TeleProduto() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmProdutos = new JFrame();
		frmProdutos.setTitle("Produtos");
		frmProdutos.setBounds(100, 100, 415, 381);
		frmProdutos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmProdutos.getContentPane().setLayout(null);
		
		JLabel jLId = new JLabel("Id");
		jLId.setBounds(10, 11, 46, 14);
		frmProdutos.getContentPane().add(jLId);
		
		jTFId = new JTextField();
		jTFId.setText("");
		jTFId.setBounds(10, 29, 58, 20);
		frmProdutos.getContentPane().add(jTFId);
		jTFId.setColumns(10);
		
		JLabel jLNome = new JLabel("Nome");
		jLNome.setBounds(10, 60, 46, 14);
		frmProdutos.getContentPane().add(jLNome);
		
		jTFNome = new JTextField();
		jTFNome.setText("");
		jTFNome.setColumns(10);
		jTFNome.setBounds(10, 78, 279, 20);
		frmProdutos.getContentPane().add(jTFNome);
		
		JLabel jLCategoria = new JLabel("Categoria");
		jLCategoria.setBounds(10, 109, 86, 14);
		frmProdutos.getContentPane().add(jLCategoria);
		
		jTFCategoria = new JTextField();
		jTFCategoria.setText("");
		jTFCategoria.setColumns(10);
		jTFCategoria.setBounds(10, 127, 279, 20);
		frmProdutos.getContentPane().add(jTFCategoria);
		
		JLabel lblNewLabel_2_1 = new JLabel("Quantidade");
		lblNewLabel_2_1.setBounds(10, 160, 72, 14);
		frmProdutos.getContentPane().add(lblNewLabel_2_1);
		
		jTFQuantidade = new JTextField();
		jTFQuantidade.setText("");
		jTFQuantidade.setColumns(10);
		jTFQuantidade.setBounds(10, 178, 86, 20);
		frmProdutos.getContentPane().add(jTFQuantidade);
		
		JLabel jLPreco = new JLabel("Preço");
		jLPreco.setBounds(10, 209, 46, 14);
		frmProdutos.getContentPane().add(jLPreco);
		
		jTFPreco = new JTextField();
		jTFPreco.setText("");
		jTFPreco.setColumns(10);
		jTFPreco.setBounds(10, 227, 86, 20);
		frmProdutos.getContentPane().add(jTFPreco);
		
		JButton jBPrimeiro = new JButton("|<");
		jBPrimeiro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jTFDisplay.setText("1");
				mostrar();
			}
		});
		jBPrimeiro.setBounds(10, 275, 46, 23);
		frmProdutos.getContentPane().add(jBPrimeiro);
		
		JButton jBAnterior = new JButton("<");
		jBAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = Integer.parseInt(jTFDisplay.getText());
				if(x > 1) {
					jTFDisplay.setText(String.valueOf(--x));
					mostrar();
				}
				
			}
		});
		jBAnterior.setBounds(66, 275, 46, 23);
		frmProdutos.getContentPane().add(jBAnterior);
		
		JButton jBProximo = new JButton(">");
		jBProximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = Integer.parseInt(jTFDisplay.getText());
				if(x < i) {
					jTFDisplay.setText(String.valueOf(++x));
					mostrar();
				}
			}
		});
		jBProximo.setBounds(159, 275, 46, 23);
		frmProdutos.getContentPane().add(jBProximo);
		
		JButton jBUltimo = new JButton(">|");
		jBUltimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jTFDisplay.setText(String.valueOf(i));
				mostrar();
			}
		});
		jBUltimo.setBounds(222, 275, 46, 23);
		frmProdutos.getContentPane().add(jBUltimo);
		
		JButton jBNovo = new JButton("Novo");
		jBNovo.setBounds(278, 275, 77, 23);
		frmProdutos.getContentPane().add(jBNovo);
		
		jTFDisplay = new JTextField();
		jTFDisplay.setHorizontalAlignment(SwingConstants.CENTER);
		jTFDisplay.setText("1");
		jTFDisplay.setColumns(10);
		jTFDisplay.setBounds(122, 276, 28, 20);
		frmProdutos.getContentPane().add(jTFDisplay);
		
		JButton jBCadastrar = new JButton("Cadastrar");
		jBCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadastrar();
			}
		});
		jBCadastrar.setBounds(122, 226, 89, 23);
		frmProdutos.getContentPane().add(jBCadastrar);
		
		JButton jBLimpar = new JButton("Limpar");
		jBLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		jBLimpar.setBounds(222, 226, 89, 23);
		frmProdutos.getContentPane().add(jBLimpar);
	}
	private void cadastrar() {
		Produto p = new Produto();
		p.setId(Integer.parseInt(jTFId.getText()));
		p.setNome(jTFNome.getText());
		p.setCategoria(jTFCategoria.getText());
		p.setQuantidade(Integer.parseInt(jTFQuantidade.getText()));
		p.setPreco(Double.parseDouble(jTFPreco.getText()));
		produtos[i] = p;
		i++;
		limpar();
		
	}
	private void limpar() {
		jTFId.setText("");
		jTFNome.setText("");
		jTFCategoria.setText("");
		jTFPreco.setText("");
		jTFQuantidade.setText("");
		jTFId.requestFocus();
	}
	private void mostrar() {
		int i = Integer.parseInt(jTFDisplay.getText());
		i = i - 1;
		Produto p = produtos[i];
		jTFId.setText(String.valueOf(p.getId()));
		jTFNome.setText(p.getNome());
		jTFCategoria.setText(p.getCategoria());
		jTFPreco.setText(String.valueOf(p.getPreco()));
		jTFQuantidade.setText(String.valueOf(p.getQuantidade()));
		
	}
	
}
