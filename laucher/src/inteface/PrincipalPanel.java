package inteface;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PrincipalPanel extends JPanel {
    public PrincipalPanel(){
        JLabel mensagem = new JLabel(" Conteúdo do principal Panel");//CRIA A MENSAGEM
        
        this.add(mensagem);//ADICIONA A MENSAGEM NA TELA 
    }
}
