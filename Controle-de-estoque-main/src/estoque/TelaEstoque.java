package estoque;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class TelaEstoque {

	private JFrame frame;
	private JTextField textField_Nome;
	private JTable table;
	private JTextField textField_Quantidade;
	private JTextField textField_Valor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaEstoque window = new TelaEstoque();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaEstoque() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 255));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_Titulo = new JLabel("Controle de Estoque");
		lblNewLabel_Titulo.setForeground(new Color(255, 255, 255));
		lblNewLabel_Titulo.setFont(new Font("Wide Latin", Font.BOLD, 16));
		lblNewLabel_Titulo.setBackground(new Color(0, 128, 255));
		lblNewLabel_Titulo.setBounds(61, 22, 309, 14);
		frame.getContentPane().add(lblNewLabel_Titulo);
		
		JLabel lblNewLabel_Nome = new JLabel("Nome");
		lblNewLabel_Nome.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_Nome.setBackground(new Color(0, 128, 255));
		lblNewLabel_Nome.setBounds(25, 57, 63, 14);
		frame.getContentPane().add(lblNewLabel_Nome);
		
		textField_Nome = new JTextField();
		textField_Nome.setBounds(80, 53, 86, 20);
		frame.getContentPane().add(textField_Nome);
		textField_Nome.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(37, 141, 373, 75);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nome", "Quantidade", "Valor", "Total"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnNewButton_Cadastrar = new JButton("Cadastrar");		
		btnNewButton_Cadastrar.setForeground(new Color(255, 255, 255));
		btnNewButton_Cadastrar.setBackground(new Color(0, 128, 192));
		btnNewButton_Cadastrar.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		btnNewButton_Cadastrar.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        // Capturando a tela
		    	// Produto produto = new Produto();
		        String nomeProduto = textField_Nome.getText();
		        String quantidadeProduto = textField_Quantidade.getText();
		        String valorTela = textField_Valor.getText();

		        // Verificando se os campos estão preenchidos
		        if (nomeProduto.isEmpty() || quantidadeProduto.isEmpty() || valorTela.isEmpty()) {
		            // Exibir uma mensagem de erro ou tomar alguma ação apropriada
		            System.out.println("Preencha todos os campos antes de cadastrar.");
		            return;
		        }

		        // Convertendo valores para os tipos apropriados
		        float valorFloat;
		        float quantInt;
		        try {
		            valorFloat = Float.parseFloat(valorTela);
		            quantInt = Integer.parseInt(quantidadeProduto);
		        } catch (NumberFormatException ex) {
		            // Tratar erro de conversão
		            System.out.println("O valor deve ser numérico.");
		            return;
		        }
		        
		        // calculando o total
		        float total = quantInt * valorFloat;

		        // Adicionando uma linha à tabela
		        DefaultTableModel tabela = (DefaultTableModel) table.getModel();
		        tabela.addRow(new Object[]{nomeProduto, quantidadeProduto, Float.toString(valorFloat), Float.toString(total)});
		        //DefaultTableModel tabela = (DefaultTableModel) table.getModel();
		        //tabela.addRow(new Object[]{nomeProduto, quantidadeProduto, valorTela, "1"});
		    }
		});

		
		btnNewButton_Cadastrar.setBounds(281, 91, 109, 23);
		frame.getContentPane().add(btnNewButton_Cadastrar);
		
		JButton btnNewButton_Adicionar = new JButton("Adicionar");
		btnNewButton_Adicionar.setForeground(new Color(255, 255, 255));
		btnNewButton_Adicionar.setBackground(new Color(0, 255, 255));
		btnNewButton_Adicionar.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	int selectedRow = table.getSelectedRow();

		        if (selectedRow >= 0) {
		            DefaultTableModel tabela = (DefaultTableModel) table.getModel();
		            int quantidadeAtual = Integer.parseInt((String) tabela.getValueAt(selectedRow, 1));

		            // Capturando a quantidade a ser adicionada
		            String quantidadeAdicionalStr = JOptionPane.showInputDialog(frame, "Digite a quantidade a ser adicionada:", "Adicionar Quantidade", JOptionPane.QUESTION_MESSAGE);

		            // Verificando se o usuário cancelou a entrada
		            if (quantidadeAdicionalStr != null) {
		                // Verificando se a entrada é um número válido
		                try {
		                    int quantidadeAdicional = Integer.parseInt(quantidadeAdicionalStr);

		                    // Adicionando a quantidade à quantidade existente
		                    quantidadeAtual += quantidadeAdicional;

		                    // Atualizando a quantidade na tabela
		                    tabela.setValueAt(Integer.toString(quantidadeAtual), selectedRow, 1);
		                    
		                    // Atualizando o valor total
		                    float valorUnitario = Float.parseFloat((String) tabela.getValueAt(selectedRow, 2));
		                    float novoValorTotal = quantidadeAtual * valorUnitario;
		                    tabela.setValueAt(Float.toString(novoValorTotal), selectedRow, 3);	
		                } catch (NumberFormatException ex) {
		                    // Tratar erro de conversão
		                    JOptionPane.showMessageDialog(frame, "Por favor, insira um número válido para a quantidade.", "Erro", JOptionPane.ERROR_MESSAGE);
		                }
		            }
		        } else {
		            JOptionPane.showMessageDialog(frame, "Selecione uma linha para adicionar quantidade.", "Aviso", JOptionPane.WARNING_MESSAGE);
		        }  	    	    
		    	    	
		    	  

		    }
		});
		btnNewButton_Adicionar.setBounds(80, 228, 89, 23);
		frame.getContentPane().add(btnNewButton_Adicionar);
		
		JButton btnNewButton_Retirar = new JButton("Retirar");
		btnNewButton_Retirar.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		btnNewButton_Retirar.setForeground(new Color(255, 255, 255));
		btnNewButton_Retirar.setBackground(new Color(255, 0, 0));
		btnNewButton_Retirar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectedRow = table.getSelectedRow();

		        if (selectedRow >= 0) {
		            DefaultTableModel tabela = (DefaultTableModel) table.getModel();
		            int quantidadeAtual = Integer.parseInt((String) tabela.getValueAt(selectedRow, 1));

		            // Capturando a quantidade a ser retirada
		            String quantidadeRetiradaStr = JOptionPane.showInputDialog(frame, "Digite a quantidade a ser retirada:", "Retirar Quantidade", JOptionPane.QUESTION_MESSAGE);

		            // Verificando se o usuário cancelou a entrada
		            if (quantidadeRetiradaStr != null) {
		                // Verificando se a entrada é um número válido
		                try {
		                    int quantidadeRetirada = Integer.parseInt(quantidadeRetiradaStr);

		                    // Verificando se a quantidade a ser retirada não é maior que a quantidade atual
		                    if (quantidadeRetirada <= quantidadeAtual) {
		                        // Subtraindo a quantidade da quantidade existente
		                        quantidadeAtual -= quantidadeRetirada;

		                        // Atualizando a quantidade na tabela
		                        tabela.setValueAt(Integer.toString(quantidadeAtual), selectedRow, 1);

		                        // Atualizando o valor total
		                        float valorUnitario = Float.parseFloat((String) tabela.getValueAt(selectedRow, 2));
		                        float novoValorTotal = quantidadeAtual * valorUnitario;
		                        tabela.setValueAt(Float.toString(novoValorTotal), selectedRow, 3);
		                    } else {
		                        JOptionPane.showMessageDialog(frame, "A quantidade a ser retirada é maior que a quantidade existente.", "Erro", JOptionPane.ERROR_MESSAGE);
		                    }
		                } catch (NumberFormatException ex) {
		                    // Tratar erro de conversão
		                    JOptionPane.showMessageDialog(frame, "Por favor, insira um número válido para a quantidade.", "Erro", JOptionPane.ERROR_MESSAGE);
		                }
		            }
		        } else {
		            JOptionPane.showMessageDialog(frame, "Selecione uma linha para retirar quantidade.", "Aviso", JOptionPane.WARNING_MESSAGE);
		        }
			}
		});
		btnNewButton_Retirar.setBounds(281, 227, 89, 23);
		frame.getContentPane().add(btnNewButton_Retirar);
		
		JLabel lblNewLabel_Quantidade = new JLabel("Quantidade");
		lblNewLabel_Quantidade.setBackground(new Color(0, 128, 255));
		lblNewLabel_Quantidade.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_Quantidade.setBounds(224, 57, 70, 14);
		frame.getContentPane().add(lblNewLabel_Quantidade);
		
		textField_Quantidade = new JTextField();
		textField_Quantidade.setBounds(304, 54, 86, 20);
		frame.getContentPane().add(textField_Quantidade);
		textField_Quantidade.setColumns(10);
		
		JLabel lblNewLabel_Valor = new JLabel("Valor");
		lblNewLabel_Valor.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_Valor.setBackground(new Color(0, 128, 255));
		lblNewLabel_Valor.setBounds(25, 96, 46, 14);
		frame.getContentPane().add(lblNewLabel_Valor);
		
		textField_Valor = new JTextField();
		textField_Valor.setBounds(80, 90, 86, 20);
		frame.getContentPane().add(textField_Valor);
		textField_Valor.setColumns(10);
		
		JLabel lblNewLabel_TituloTabela = new JLabel("Tabela Estoque");
		lblNewLabel_TituloTabela.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_TituloTabela.setBackground(new Color(0, 128, 255));
		lblNewLabel_TituloTabela.setForeground(new Color(255, 255, 255));
		lblNewLabel_TituloTabela.setBounds(159, 116, 100, 14);
		frame.getContentPane().add(lblNewLabel_TituloTabela);
	}

}
