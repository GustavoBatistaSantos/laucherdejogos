package inteface;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.*;

public class LoginPanel extends JPanel implements ActionListener{// extende a jpanel e implementa a interface Action listener que possui o método actionPerformed
    public LoginPanel() {
        JLabel mensagem = new JLabel("Conteúdo do Login Panel");//CRIA UMA MENSAGEM
        JButton botao = new JButton("Fazer login"); //CRIA UM BOTÃO

        this.add(mensagem);//ADICIONA A MENSAGEM NA TELA
        this.add(botao);// ADICIONA O BOTÃO NA TELA
    }

    @override
}

