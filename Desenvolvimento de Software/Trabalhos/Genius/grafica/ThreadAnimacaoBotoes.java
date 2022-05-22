package grafica;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import logica.Genius;
import logica.Genius.*;

import java.awt.Color;

public class ThreadAnimacaoBotoes extends Thread {
    private JButton btnVerde, btnVermelho, btnAzul, btnAmarelo;
    private Genius logicaGenius;
    public ThreadAnimacaoBotoes (JButton btnVerde, JButton btnVermelho, JButton btnAzul, JButton btnAmarelo, Genius logicaGenius){
        this.btnVerde = btnVerde;
        this.btnVermelho = btnVermelho;
        this.btnAzul = btnAzul;
        this.btnAmarelo = btnAmarelo;
        this.logicaGenius = logicaGenius;
    }
    @Override
    public void run(){
        try {
            for (Cor cor : logicaGenius.getCoresSorteadas() ){
                switch (cor){
                    case VERMELHO:
                        btnVermelho.setBackground(Color.GRAY);
                        sleep(500);
                        btnVermelho.setBackground(Color.RED);
                        sleep(200);
                        break;
                    case VERDE:
                        btnVerde.setBackground(Color.GRAY);
                        sleep(500);
                        btnVerde.setBackground(Color.GREEN);
                        sleep(200);
                        break;
                    case AZUL:
                        btnAzul.setBackground(Color.GRAY);
                        sleep(500);
                        btnAzul.setBackground(Color.BLUE);
                        sleep(200);
                        break;
                    case AMARELO:
                        btnAmarelo.setBackground(Color.GRAY);
                        sleep(500);
                        btnAmarelo.setBackground(Color.YELLOW);
                        sleep(200);
                        break;
                } 
            }
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(), "REEO", JOptionPane.ERROR_MESSAGE);
        }
    }
}