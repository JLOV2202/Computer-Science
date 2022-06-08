package Interface;

import javax.swing.JToggleButton;
import java.awt.Font;

public class cardBtn extends JToggleButton {
    
    private int num;

    public cardBtn(int num) {
        this.num = num;
        setFont(new Font("Arial", Font.BOLD, 30));
    }

    public int getNum() {
        return num;
    }

    public void show() {
        setSelected(true);
        setText(Integer.toString(num));
    }

    public void hide() {
        setSelected(false);
        setText("");
    }
}
