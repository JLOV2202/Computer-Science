package logic;

import java.util.Random;

import graphic.cardBtn;

public class Memorize {

    private int[] board;
    private int score;
    private boolean wait;
    private cardBtn selecCard;

    public Memorize() {
        board = new int[16];
        for (int i = 0; i < 16; i++)
            board[i] = sortNum();
    }

    private int sortNum() {
        while (true) {
            int num = new Random().nextInt(8) + 1;
            int cnt = 0;
            for (int i = 0; i < 16; i++) {
                if (num == board[i])
                    cnt++;
            }
            if (cnt < 2)
                return num;
        }
    }

    public void setWait(boolean wait) {
        this.wait = wait;
    }

    public void setSelecCard(cardBtn selecCard) {
        this.selecCard = selecCard;
    }

    public int[] getBoard() {
        return board;
    }

    public int getScore() {
        return score;
    }

    public cardBtn getSelecCard() {
        return selecCard;
    }

    public void upScore() {
        score += 5;
    }

    public void dwnScore() {
        score -= 3;
    }

    public boolean isWait() {
        return wait;
    }
}
