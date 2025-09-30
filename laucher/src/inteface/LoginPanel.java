package inteface;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LoginPanel extends JPanel implements ActionListener{// extende a jpanel e implementa a interface Action listener que possui o método actionPerformed
    private JPanel telas;//atributo
    private  CardLayout controleTela;
    public LoginPanel(JPanel telas) { //metodo contrutor
        this.telas = telas;
        this.controleTela =(CardLayout) telas.getLayout();// converte o telas para cardlayout e adiciona o metodo de trocar telas quando apertar o botão
        JLabel mensagem = new JLabel("Conteúdo do Login Panel");//CRIA UMA MENSAGEM
        JButton botao = new JButton("Fazer login"); //CRIA UM BOTÃO
        botao.addActionListener(this);//chama o método override

        this.add(mensagem);//ADICIONA A MENSAGEM NA TELA
        this.add(botao);// ADICIONA O BOTÃO NA TELA
    }

    @Override
    public void actionPerformed(ActionEvent e){
        controleTela.show(telas,"Tela Principal");//metodo para trocar de tela quando clicar
    }
}

