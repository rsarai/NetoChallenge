import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Frame extends JFrame {
	

	private JPanel contentPane;
	private JTextField gerar12campo6;
	private final JLabel lblDigiteNmeros = new JLabel("Digite 12 n\u00FAmeros");
	private JTextField gerar13campo13;
	private JTextField gerar12campo7;
	private JTextField gerar12campo8;
	private JTextField gerar12campo9;
	private JTextField gerar12campo10;
	private JTextField gerar12campo11;
	private JTextField gerar12campo12;
	private JTextField gerar12campo5;
	private JTextField gerar12campo4;
	private JTextField gerar12campo3;
	private JTextField gerar12campo2;
	private JTextField gerar12campo1;
	private JTextField gerar13campo1;
	private JTextField gerar13campo2;
	private JTextField gerar13campo3;
	private JTextField gerar13campo4;
	private JTextField gerar13campo5;
	private JTextField gerar13campo6;
	private JTextField gerar13campo7;
	private JTextField gerar13campo8;
	private JTextField gerar13campo9;
	private JTextField gerar13campo10;
	private JTextField gerar13campo11;
	private JTextField gerar13campo12;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame frame = new Frame();
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
	public Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		gerar12campo6 = new JTextField();
		gerar12campo6.setBounds(488, 47, 23, 20);
		contentPane.add(gerar12campo6);
		gerar12campo6.setColumns(10);
		lblDigiteNmeros.setBounds(488, 11, 107, 31);
		contentPane.add(lblDigiteNmeros);
		
		JLabel lblDigiteNmeros_1 = new JLabel("Digite 13 n\u00FAmeros");
		lblDigiteNmeros_1.setBounds(479, 136, 125, 31);
		contentPane.add(lblDigiteNmeros_1);
		
		gerar13campo13 = new JTextField();
		gerar13campo13.setColumns(10);
		gerar13campo13.setBounds(719, 172, 23, 20);
		contentPane.add(gerar13campo13);
		
		gerar12campo7 = new JTextField();
		gerar12campo7.setColumns(10);
		gerar12campo7.setBounds(521, 47, 23, 20);
		contentPane.add(gerar12campo7);
		
		gerar12campo8 = new JTextField();
		gerar12campo8.setColumns(10);
		gerar12campo8.setBounds(554, 47, 23, 20);
		contentPane.add(gerar12campo8);
		
		gerar12campo9 = new JTextField();
		gerar12campo9.setColumns(10);
		gerar12campo9.setBounds(587, 47, 23, 20);
		contentPane.add(gerar12campo9);
		
		gerar12campo10 = new JTextField();
		gerar12campo10.setColumns(10);
		gerar12campo10.setBounds(620, 47, 23, 20);
		contentPane.add(gerar12campo10);
		
		gerar12campo11 = new JTextField();
		gerar12campo11.setColumns(10);
		gerar12campo11.setBounds(653, 47, 23, 20);
		contentPane.add(gerar12campo11);
		
		gerar12campo12 = new JTextField();
		gerar12campo12.setColumns(10);
		gerar12campo12.setBounds(686, 47, 23, 20);
		contentPane.add(gerar12campo12);
		
		gerar12campo5 = new JTextField();
		gerar12campo5.setColumns(10);
		gerar12campo5.setBounds(455, 47, 23, 20);
		contentPane.add(gerar12campo5);
		
		gerar12campo4 = new JTextField();
		gerar12campo4.setColumns(10);
		gerar12campo4.setBounds(422, 47, 23, 20);
		contentPane.add(gerar12campo4);
		
		gerar12campo3 = new JTextField();
		gerar12campo3.setColumns(10);
		gerar12campo3.setBounds(389, 47, 23, 20);
		contentPane.add(gerar12campo3);
		
		gerar12campo2 = new JTextField();
		gerar12campo2.setColumns(10);
		gerar12campo2.setBounds(356, 47, 23, 20);
		contentPane.add(gerar12campo2);
		
		gerar12campo1 = new JTextField();
		gerar12campo1.setColumns(10);
		gerar12campo1.setBounds(323, 47, 23, 20);
		contentPane.add(gerar12campo1);
		
		gerar13campo1 = new JTextField();
		gerar13campo1.setColumns(10);
		gerar13campo1.setBounds(323, 172, 23, 20);
		contentPane.add(gerar13campo1);
		
		gerar13campo2 = new JTextField();
		gerar13campo2.setColumns(10);
		gerar13campo2.setBounds(356, 172, 23, 20);
		contentPane.add(gerar13campo2);
		
		gerar13campo3 = new JTextField();
		gerar13campo3.setColumns(10);
		gerar13campo3.setBounds(389, 172, 23, 20);
		contentPane.add(gerar13campo3);
		
		gerar13campo4 = new JTextField();
		gerar13campo4.setColumns(10);
		gerar13campo4.setBounds(422, 172, 23, 20);
		contentPane.add(gerar13campo4);
		
		gerar13campo5 = new JTextField();
		gerar13campo5.setColumns(10);
		gerar13campo5.setBounds(455, 172, 23, 20);
		contentPane.add(gerar13campo5);
		
		gerar13campo6 = new JTextField();
		gerar13campo6.setColumns(10);
		gerar13campo6.setBounds(488, 172, 23, 20);
		contentPane.add(gerar13campo6);
		
		gerar13campo7 = new JTextField();
		gerar13campo7.setColumns(10);
		gerar13campo7.setBounds(521, 172, 23, 20);
		contentPane.add(gerar13campo7);
		
		gerar13campo8 = new JTextField();
		gerar13campo8.setColumns(10);
		gerar13campo8.setBounds(554, 172, 23, 20);
		contentPane.add(gerar13campo8);
		
		gerar13campo9 = new JTextField();
		gerar13campo9.setColumns(10);
		gerar13campo9.setBounds(587, 172, 23, 20);
		contentPane.add(gerar13campo9);
		
		gerar13campo10 = new JTextField();
		gerar13campo10.setColumns(10);
		gerar13campo10.setBounds(620, 172, 23, 20);
		contentPane.add(gerar13campo10);
		
		gerar13campo11 = new JTextField();
		gerar13campo11.setColumns(10);
		gerar13campo11.setBounds(653, 172, 23, 20);
		contentPane.add(gerar13campo11);
		
		gerar13campo12 = new JTextField();
		gerar13campo12.setColumns(10);
		gerar13campo12.setBounds(686, 172, 23, 20);
		contentPane.add(gerar13campo12);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel.setBounds(391, 282, 301, 98);
		contentPane.add(lblNewLabel);
		
		
		JButton btnGerar = new JButton("Gerar");
		btnGerar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText("Calculando combinações...");
				ArrayList<Integer> data = gerar13();
				JFrame parentFrame = new JFrame();
				
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setDialogTitle("Specify a file to save");    
				int userSelection = fileChooser.showSaveDialog(parentFrame);
				String path = null;
				
				if (userSelection == JFileChooser.APPROVE_OPTION) {
				    File fileToSave = fileChooser.getSelectedFile();
				    path = fileToSave.getAbsolutePath();
				    
				    criarFile(data, path);
				}
				
				lblNewLabel.setText("");
			}
			
		});
		btnGerar.setBounds(497, 202, 89, 23);
		contentPane.add(btnGerar);
		
		JButton button = new JButton("Gerar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText("Calculando combinações...");
				ArrayList<Integer> data = gerar12();
				JFrame parentFrame = new JFrame();
				 
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setDialogTitle("Specify a file to save");   
				int userSelection = fileChooser.showSaveDialog(parentFrame);
				 
			    String path = null;					
				if (userSelection == JFileChooser.APPROVE_OPTION) {
				    File fileToSave = fileChooser.getSelectedFile();
				    path = fileToSave.getAbsolutePath();
				    
				    criarFile2(data, path);
				}
				
				lblNewLabel.setText("");
				
			}
		});
		button.setBounds(497, 78, 89, 23);
		contentPane.add(button);
		
	}
	
	private void criarFile(ArrayList<Integer> data, String path) {
		try {
		    String str = AnaliseCombinatoria.gerarSolucoesPara13(data);
		    str = limparStrParaVisualizacao(str);
		    PrintWriter writer = new PrintWriter(path+".txt");
		    for(String s : str.split("\n")){
		    	writer.println(s);
		    }
		    writer.close();
		} catch (IOException iox) {
		    //do stuff with exception
		    iox.printStackTrace();
		}
	}

	private void criarFile2(ArrayList<Integer> data, String path) {
		try {
		    String str = AnaliseCombinatoria.gerarSolucoesPara12(data);
		    str = limparStrParaVisualizacao(str);
		    PrintWriter writer = new PrintWriter(path+".txt");
		    for(String s : str.split("\n")){
		    	writer.println(s);
		    }
		    writer.close();
		} catch (IOException iox) {
		    //do stuff with exception
		    iox.printStackTrace();
		}
	}
	
	private String limparStrParaVisualizacao(String str) {
		return str.replace("]", "").replace("[", "");
	}
	
	private ArrayList<Integer> gerar12() {
		ArrayList<Integer> inputData = new ArrayList<>();
		try{
			String numero = gerar12campo1.getText();
			if(numero == null || numero.isEmpty()){
				throw new NumberFormatException();
			}
			
			int n = Integer.parseInt(numero);
			
			inputData.add(n);
			
			numero = gerar12campo2.getText();
			if(numero == null || numero.isEmpty()){
				throw new NumberFormatException();
			}
			
			n = Integer.parseInt(numero);
			
			inputData.add(n);
			
			numero = gerar12campo3.getText();
			if(numero == null || numero.isEmpty()){
				throw new NumberFormatException();
			}
			
			n = Integer.parseInt(numero);
			
			inputData.add(n);
			
			numero = gerar12campo4.getText();
			if(numero == null || numero.isEmpty()){
				throw new NumberFormatException();
			}
			
			n = Integer.parseInt(numero);
			
			inputData.add(n);
			numero = gerar12campo5.getText();
			if(numero == null || numero.isEmpty()){
				throw new NumberFormatException();
			}
			
			n = Integer.parseInt(numero);
			
			inputData.add(n);
			numero = gerar12campo6.getText();
			if(numero == null || numero.isEmpty()){
				throw new NumberFormatException();
			}
			
			n = Integer.parseInt(numero);
			
			inputData.add(n);
			numero = gerar12campo7.getText();
			if(numero == null || numero.isEmpty()){
				throw new NumberFormatException();
			}
			
			n = Integer.parseInt(numero);
			
			inputData.add(n);
			numero = gerar12campo8.getText();
			if(numero == null || numero.isEmpty()){
				throw new NumberFormatException();
			}
			
			n = Integer.parseInt(numero);
			
			inputData.add(n);
			numero = gerar12campo9.getText();
			if(numero == null || numero.isEmpty()){
				throw new NumberFormatException();
			}
			
			n = Integer.parseInt(numero);
			
			inputData.add(n);
			numero = gerar12campo10.getText();
			if(numero == null || numero.isEmpty()){
				throw new NumberFormatException();
			}
			
			n = Integer.parseInt(numero);
			
			inputData.add(n);
			numero = gerar12campo11.getText();
			if(numero == null || numero.isEmpty()){
				throw new NumberFormatException();
			}
			
			n = Integer.parseInt(numero);
			
			inputData.add(n);
			numero = gerar12campo12.getText();
			if(numero == null || numero.isEmpty()){
				throw new NumberFormatException();
			}
			
			n = Integer.parseInt(numero);
			
			inputData.add(n);
			
		}catch(NumberFormatException e){
			JOptionPane.showMessageDialog(this, "Você digitou algo que não é número! Tente novamente.");
		}
		
		return inputData;
	}
	
	private ArrayList<Integer> gerar13() {
		ArrayList<Integer> inputData = new ArrayList<>();
		try{
			String numero = gerar13campo1.getText();
			if(numero == null || numero.isEmpty()){
				throw new NumberFormatException();
			}
			
			int n = Integer.parseInt(numero);
			
			inputData.add(n);
			
			numero = gerar13campo2.getText();
			if(numero == null || numero.isEmpty()){
				throw new NumberFormatException();
			}
			
			n = Integer.parseInt(numero);
			
			inputData.add(n);
			
			numero = gerar13campo3.getText();
			if(numero == null || numero.isEmpty()){
				throw new NumberFormatException();
			}
			
			n = Integer.parseInt(numero);
			
			inputData.add(n);
			
			numero = gerar13campo4.getText();
			if(numero == null || numero.isEmpty()){
				throw new NumberFormatException();
			}
			
			n = Integer.parseInt(numero);
			
			inputData.add(n);
			numero = gerar13campo5.getText();
			if(numero == null || numero.isEmpty()){
				throw new NumberFormatException();
			}
			
			n = Integer.parseInt(numero);
			
			inputData.add(n);
			numero = gerar13campo6.getText();
			if(numero == null || numero.isEmpty()){
				throw new NumberFormatException();
			}
			
			n = Integer.parseInt(numero);
			
			inputData.add(n);
			numero = gerar13campo7.getText();
			if(numero == null || numero.isEmpty()){
				throw new NumberFormatException();
			}
			
			n = Integer.parseInt(numero);
			
			inputData.add(n);
			numero = gerar13campo8.getText();
			if(numero == null || numero.isEmpty()){
				throw new NumberFormatException();
			}
			
			n = Integer.parseInt(numero);
			
			inputData.add(n);
			numero = gerar13campo9.getText();
			if(numero == null || numero.isEmpty()){
				throw new NumberFormatException();
			}
			
			n = Integer.parseInt(numero);
			
			inputData.add(n);
			numero = gerar13campo10.getText();
			if(numero == null || numero.isEmpty()){
				throw new NumberFormatException();
			}
			
			n = Integer.parseInt(numero);
			
			inputData.add(n);
			numero = gerar13campo11.getText();
			if(numero == null || numero.isEmpty()){
				throw new NumberFormatException();
			}
			
			n = Integer.parseInt(numero);
			
			inputData.add(n);
			numero = gerar13campo12.getText();
			if(numero == null || numero.isEmpty()){
				throw new NumberFormatException();
			}
			
			n = Integer.parseInt(numero);
			
			inputData.add(n);
			
			numero = gerar13campo13.getText();
			if(numero == null || numero.isEmpty()){
				throw new NumberFormatException();
			}
			
			n = Integer.parseInt(numero);
			
			inputData.add(n);
				
			
		}catch(NumberFormatException e){
			JOptionPane.showMessageDialog(this, "Você digitou algo que não é número! Tente novamente.");
		}
		return inputData;
	}
}
