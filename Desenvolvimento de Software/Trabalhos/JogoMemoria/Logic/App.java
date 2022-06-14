package logic;

import graphic.FrmMemorize;

public class App {
    public static void main(String[] args) throws Exception {
        FrmMemorize window = new FrmMemorize();
        window.showBoard();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        window.hideBoard();
    }
}
