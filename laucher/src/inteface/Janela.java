package inteface;

import javax.swing.JFrame;

public class Janela extends JFrame {// vai herdar a classe usada em java teste
    public Janela() {//método contrutor
        this.setBounds(0,0,1920,1080);//método importado de jframe
        LoginPanel loginPanel = new LoginPanel(); //chama o método
        PrincipalPanel principalPanel = new PrincipalPanel();
        this.add(loginPanel);//para adicionar na tela, fazer com o principal panel



        this.setVisible(true); //método importado de jframe e sempre adicionar no final 

        // essa janela vai ser a principal e o conteudo vai trocar dentro da janela como se ela fosse a tv e as outras janelas os canais, sendo chamados de painel
    }
}
