package br.com.abc.javaSwing.aula01;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OlamundoJava extends JFrame {
    private JPanel contentPane;
    private JButton btnClick;
    private JLabel lblMensagem;

    public OlamundoJava() {
        setContentPane(contentPane);
        getRootPane().setDefaultButton(btnClick);
        btnClick.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblMensagem.setText("Olá, Mundo!");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("OlamundoJava");
        frame.setContentPane(new OlamundoJava().contentPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
