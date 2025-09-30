package inteface;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PrincipalPanel extends JPanel implements ActionListener{
    private JPanel telas;
    private  CardLayout controleTela;
    public PrincipalPanel(JPanel telas){//jpanel telas para ser exibido na trca de telas
        this.telas = telas;
        this.controleTela =(CardLayout) telas.getLayout();// converte o telas para cardlayout e adiciona o metodo de trocar telas quando apertar o botão
        JLabel mensagem = new JLabel(" Conteúdo do principal Panel");//CRIA A MENSAGEM
        JButton botao = new JButton("voltar"); //CRIA UM BOTÃO
        botao.addActionListener(this);//chama o método override

        this.add(botao);
        this.add(mensagem);//ADICIONA A MENSAGEM NA TELA 
    }

    @Override
    public void actionPerformed(ActionEvent e){
        controleTela.show(telas,"Tela Login");//método de troca de tela

    }
}
