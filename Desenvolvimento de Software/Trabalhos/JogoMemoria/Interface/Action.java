package Interface;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;

import Logic.Memorize;

public class Action extends AbstractAction {

    private cardBtn[] board;
    private Memorize game;

    public Action(cardBtn[] board, Memorize game) {
        this.board = board;
        this.game = game;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        cardBtn btn = (cardBtn) e.getSource();
        int num = btn.getNum();

        if (game.isWait()) {
            if (btn == game.getSelecCard()) {
                game.getSelecCard().show();
                return;
            }
            if (num == game.getSelecCard().getNum()) {

                game.upScore();
                game.setWait(false);
                btn.show();

                if (isEnd()) {
                    JOptionPane.showMessageDialog(null, String.format("Pontuação final %d", game.getScore()),
                            "Jogo da Memória", JOptionPane.INFORMATION_MESSAGE);
                }

                btn.setEnabled(false);
                game.getSelecCard().setEnabled(false);
            } else {
                game.dwnScore();
                game.setWait(false);
                new Thread() {
                    public void run() {
                        btn.show();
                        try {
                            Thread.sleep(200);
                        } catch (InterruptedException ex) {
                            ex.printStackTrace();
                        }
                        btn.hide();
                        game.getSelecCard().hide();
                    }
                }.start();
            }
        } else {
            game.setSelecCard(btn);
            game.setWait(true);
            btn.show();
        }
    }

    private boolean isEnd() {
        int cnt = 0;
        for (int i = 0; i < 16; i++)
            if (board[i].isSelected())
                cnt++;
        return (cnt == 16) ? true : false;
    }
}
