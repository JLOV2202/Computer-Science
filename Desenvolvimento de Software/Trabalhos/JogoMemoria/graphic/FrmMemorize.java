package graphic;

import javax.swing.JFrame;

import logic.Memorize;

import java.awt.GridLayout;

public class FrmMemorize extends JFrame{

	private cardBtn[] board;
	private Memorize game;

    public FrmMemorize(){

		super("Jogo da Memória");
		this.setBounds(100, 100, 500, 500);
		this.setDefaultCloseOperation(3);
		this.setVisible(true);

		board = new cardBtn[16];
		game = new Memorize();

		getContentPane().setLayout(new GridLayout(4, 4, 4, 4));
		cardGen();
				
    }

	private void cardGen(){
		Action act = new Action(board, game);

		for (int i = 0; i < 16; i++){
			int num = game.getBoard()[i];
			cardBtn btn = new cardBtn(num);
			board[i] = btn;
			add(btn);
			btn.addActionListener(act);
		}
	}

	public void showBoard (){
		for (int i = 0; i < 16; i++){
			board[i].show();
		}
	}

	public void hideBoard (){
		for (int i = 0; i < 16; i++){
			board[i].hide();
		}
	}

}
