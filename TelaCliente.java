package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class TelaCliente {

	private JFrame frmClientes;
	private JTextField jTFCodigo;
	private JTextField jTFNome;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField jTFEmail;
	private JTextField jTFLimite;
	private JTextField jTFDisplay;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCliente window = new TelaCliente();
					window.frmClientes.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaCliente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmClientes = new JFrame();
		frmClientes.setTitle("Clientes");
		frmClientes.setBounds(100, 100, 450, 427);
		frmClientes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmClientes.getContentPane().setLayout(null);
		
		JLabel jLCodigo = new JLabel("Código");
		jLCodigo.setBounds(10, 11, 46, 14);
		frmClientes.getContentPane().add(jLCodigo);
		
		jTFCodigo = new JTextField();
		jTFCodigo.setBounds(10, 36, 86, 20);
		frmClientes.getContentPane().add(jTFCodigo);
		jTFCodigo.setColumns(10);
		
		JLabel jLNome = new JLabel("Nome");
		jLNome.setBounds(10, 69, 46, 14);
		frmClientes.getContentPane().add(jLNome);
		
		jTFNome = new JTextField();
		jTFNome.setBounds(10, 94, 390, 20);
		frmClientes.getContentPane().add(jTFNome);
		jTFNome.setColumns(10);
		
		JLabel jLSexo = new JLabel("Sexo");
		jLSexo.setBounds(10, 125, 46, 14);
		frmClientes.getContentPane().add(jLSexo);
		
		JRadioButton jRBMasc = new JRadioButton("Masculino");
		buttonGroup.add(jRBMasc);
		jRBMasc.setBounds(10, 146, 109, 23);
		frmClientes.getContentPane().add(jRBMasc);
		
		JRadioButton jRBFem = new JRadioButton("Feminino");
		buttonGroup.add(jRBFem);
		jRBFem.setBounds(121, 146, 109, 23);
		frmClientes.getContentPane().add(jRBFem);
		
		JRadioButton jRBOutros = new JRadioButton("Outros");
		buttonGroup.add(jRBOutros);
		jRBOutros.setBounds(232, 146, 109, 23);
		frmClientes.getContentPane().add(jRBOutros);
		
		JLabel jLEmail = new JLabel("Email");
		jLEmail.setBounds(10, 178, 46, 14);
		frmClientes.getContentPane().add(jLEmail);
		
		jTFEmail = new JTextField();
		jTFEmail.setBounds(10, 203, 390, 20);
		frmClientes.getContentPane().add(jTFEmail);
		jTFEmail.setColumns(10);
		
		JLabel jLLimite = new JLabel("Limite");
		jLLimite.setBounds(10, 234, 46, 14);
		frmClientes.getContentPane().add(jLLimite);
		
		jTFLimite = new JTextField();
		jTFLimite.setHorizontalAlignment(SwingConstants.RIGHT);
		jTFLimite.setBounds(10, 259, 145, 20);
		frmClientes.getContentPane().add(jTFLimite);
		jTFLimite.setColumns(10);
		
		JButton jBPrimeiro = new JButton("|<");
		jBPrimeiro.setBounds(10, 290, 46, 23);
		frmClientes.getContentPane().add(jBPrimeiro);
		
		JButton jBAnterior = new JButton("<");
		jBAnterior.setBounds(66, 290, 46, 23);
		frmClientes.getContentPane().add(jBAnterior);
		
		JButton jBProximo = new JButton(">");
		jBProximo.setBounds(184, 290, 46, 23);
		frmClientes.getContentPane().add(jBProximo);
		
		JButton jBUltimo = new JButton(">|");
		jBUltimo.setBounds(239, 290, 46, 23);
		frmClientes.getContentPane().add(jBUltimo);
		
		jTFDisplay = new JTextField();
		jTFDisplay.setHorizontalAlignment(SwingConstants.CENTER);
		jTFDisplay.setText("1");
		jTFDisplay.setBounds(128, 290, 46, 20);
		frmClientes.getContentPane().add(jTFDisplay);
		jTFDisplay.setColumns(10);
		
		JButton jBCadastrar = new JButton("Cadastrar");
		jBCadastrar.setBounds(7, 324, 112, 23);
		frmClientes.getContentPane().add(jBCadastrar);
		
		JButton jBLimpar = new JButton("Limpar");
		jBLimpar.setBounds(173, 324, 112, 23);
		frmClientes.getContentPane().add(jBLimpar);
	}
	private void limpar() {
		jTFCodigo.setText("");
		jTFNome.setText("");
		jTFEmail.setText("");
		jTFLimite.setText("");
		buttonGroup.clearSelection();
		jTFCodigo.requestFocus();
		
	}
}
