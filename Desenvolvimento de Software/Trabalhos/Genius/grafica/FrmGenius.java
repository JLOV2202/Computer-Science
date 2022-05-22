package grafica;

import logica.Genius;
import logica.Genius.Cor;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.GridLayout;
import java.awt.Dimension;
import java.awt.Color;

public class FrmGenius extends JFrame{
    private Genius logicaGenius;
    private JButton btnVermelho;
    private JButton btnVerde;
    private JButton btnAzul;
    private JButton btnAmarelo;

    public FrmGenius(Genius logicaGenius){
        this.logicaGenius = logicaGenius;
        this.setLayout(new GridLayout(2, 2, 10, 10));

        btnVermelho = new JButton();
        btnVermelho.setBackground(Color.RED);
        this.add(btnVermelho);

        btnVerde = new JButton();
        btnVerde.setBackground(Color.GREEN);
        this.add(btnVerde);

        btnAzul = new JButton();
        btnAzul.setBackground(Color.BLUE);
        this.add(btnAzul);

        btnAmarelo = new JButton();
        btnAmarelo.setBackground(Color.YELLOW);
        this.add(btnAmarelo);

        this.setSize(new Dimension(600, 600));;
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btnVerde.addActionListener(new ActionBotao(Cor.VERDE, logicaGenius));
        btnVermelho.addActionListener(new ActionBotao(Cor.VERMELHO, logicaGenius));
        btnAzul.addActionListener(new ActionBotao(Cor.AZUL, logicaGenius));
        btnAmarelo.addActionListener(new ActionBotao(Cor.AMARELO, logicaGenius));
    }

    public void animarBotoes(){
        ThreadAnimacaoBotoes animacao = new ThreadAnimacaoBotoes(btnVerde, btnVermelho, btnAzul, btnAmarelo, logicaGenius);
        animacao.start();
    }
}
