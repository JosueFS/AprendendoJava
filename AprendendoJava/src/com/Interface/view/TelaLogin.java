package com.Interface.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaLogin extends JFrame {
    private JPanel contentPane;
    private JTextField txtLogin;
    private JPasswordField txtSenha;
    private JButton entrarButton;

    public TelaLogin() {
        setContentPane(contentPane);
        getRootPane().setDefaultButton(entrarButton);
        entrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtLogin.getText().equals("admin")&&txtSenha.getText().equals("0511")){
                    JOptionPane.showMessageDialog(null,"Login Efetuado com Sucesso!");
                }else {
                    JOptionPane.showMessageDialog(null,"Acesso Negado!");
                }

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("TelaLogin");
        frame.setContentPane(new TelaLogin().contentPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
    }
}
