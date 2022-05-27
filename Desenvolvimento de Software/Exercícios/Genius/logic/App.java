package logica;

import javax.swing.JOptionPane;

import grafica.FrmGenius;

public class App {
    public static void main(String[] args) throws Exception {
        Genius logicaGenius = new Genius();
        FrmGenius frm = new FrmGenius(logicaGenius);
        frm.setVisible(true);
        do {
            int rodada = 1;
            logicaGenius.limparCoresSorteadas();
            do{
                JOptionPane.showMessageDialog(frm, String.format("Rodada: %d", rodada), "Genius",  JOptionPane.INFORMATION_MESSAGE);
                logicaGenius.sortearCor();
                frm.animarBotoes();
                logicaGenius.limparCoresJogador();
                while (logicaGenius.isAguardandoCores()) {
                    Thread.sleep(200);
                }
                rodada++;
            } while (logicaGenius.compararSequencias());
            JOptionPane.showMessageDialog(frm, "Perdeu, Fim de Jogo!", "Genius", JOptionPane.INFORMATION_MESSAGE);
        } while (JOptionPane.showOptionDialog(frm, "Deseja tentar novamente?", "Genius", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null) == JOptionPane.YES_OPTION);

        frm.setVisible(false);
        frm.dispose();
    }
}
