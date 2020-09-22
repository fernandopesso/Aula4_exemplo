package br.com.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.controller.UserLoger;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginUser extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldLogin;
	private JTextField textFieldSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginUser frame = new LoginUser();
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
	public LoginUser() {
		setTitle("Janela de login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login:");
		lblNewLabel.setBounds(57, 70, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Senha:");
		lblNewLabel_1.setBounds(57, 95, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textFieldLogin = new JTextField();
		textFieldLogin.setBounds(91, 67, 86, 20);
		contentPane.add(textFieldLogin);
		textFieldLogin.setColumns(10);
		
		textFieldSenha = new JTextField();
		textFieldSenha.setBounds(91, 92, 86, 20);
		contentPane.add(textFieldSenha);
		textFieldSenha.setColumns(10);
		
		JButton btnLogar = new JButton("Logar");
		btnLogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				UserLoger us = new UserLoger();
				
				if (us.validacaoLogin(textFieldLogin.getText(), textFieldSenha.getText())) {
					JOptionPane.showMessageDialog(contentPane, "ok, " + textFieldLogin.getText() + "Login efetuado!");
				} else {
					JOptionPane.showMessageDialog(contentPane, "Falha ao logar", "Falha", JOptionPane.ERROR_MESSAGE);
				}
							
				textFieldLogin.setText("");
				textFieldSenha.setText("");
				
				/*JOptionPane.showMessageDialog(contentPane, "Login com sucesso");*/
			}
		});
		btnLogar.setBounds(91, 120, 89, 23);
		contentPane.add(btnLogar);
	}
}
