package Interface;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JToggleButton;
import java.awt.Font;

public class FrmMemorize {

    public JFrame frame;
 
    public FrmMemorize() {
		initialize();
	}

    private void initialize(){
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(4, 4, 4, 4));
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("01");
		tglbtnNewToggleButton.setFont(new Font("Arial", Font.BOLD, 30));
		frame.getContentPane().add(tglbtnNewToggleButton);
		
		JToggleButton tglbtnNewToggleButton_1 = new JToggleButton("02");
		tglbtnNewToggleButton_1.setFont(new Font("Arial", Font.BOLD, 30));
		frame.getContentPane().add(tglbtnNewToggleButton_1);
		
		JToggleButton tglbtnNewToggleButton_2 = new JToggleButton("03");
		tglbtnNewToggleButton_2.setFont(new Font("Arial", Font.BOLD, 30));
		frame.getContentPane().add(tglbtnNewToggleButton_2);
		
		JToggleButton tglbtnNewToggleButton_3 = new JToggleButton("04");
		tglbtnNewToggleButton_3.setFont(new Font("Arial", Font.BOLD, 30));
		frame.getContentPane().add(tglbtnNewToggleButton_3);
		
		JToggleButton tglbtnNewToggleButton_4 = new JToggleButton("05");
		tglbtnNewToggleButton_4.setFont(new Font("Arial", Font.BOLD, 30));
		frame.getContentPane().add(tglbtnNewToggleButton_4);
		
		JToggleButton tglbtnNewToggleButton_5 = new JToggleButton("06");
		tglbtnNewToggleButton_5.setFont(new Font("Arial", Font.BOLD, 30));
		frame.getContentPane().add(tglbtnNewToggleButton_5);
		
		JToggleButton tglbtnNewToggleButton_6 = new JToggleButton("07");
		tglbtnNewToggleButton_6.setFont(new Font("Arial", Font.BOLD, 30));
		frame.getContentPane().add(tglbtnNewToggleButton_6);
		
		JToggleButton tglbtnNewToggleButton_7 = new JToggleButton("08");
		tglbtnNewToggleButton_7.setFont(new Font("Arial", Font.BOLD, 30));
		frame.getContentPane().add(tglbtnNewToggleButton_7);
		
		JToggleButton tglbtnNewToggleButton_8 = new JToggleButton("09");
		tglbtnNewToggleButton_8.setFont(new Font("Arial", Font.BOLD, 30));
		frame.getContentPane().add(tglbtnNewToggleButton_8);
		
		JToggleButton tglbtnNewToggleButton_9 = new JToggleButton("10");
		tglbtnNewToggleButton_9.setFont(new Font("Arial", Font.BOLD, 30));
		frame.getContentPane().add(tglbtnNewToggleButton_9);
		
		JToggleButton tglbtnNewToggleButton_10 = new JToggleButton("11");
		tglbtnNewToggleButton_10.setFont(new Font("Arial", Font.BOLD, 30));
		frame.getContentPane().add(tglbtnNewToggleButton_10);
		
		JToggleButton tglbtnNewToggleButton_11 = new JToggleButton("12");
		tglbtnNewToggleButton_11.setFont(new Font("Arial", Font.BOLD, 30));
		frame.getContentPane().add(tglbtnNewToggleButton_11);
		
		JToggleButton tglbtnNewToggleButton_12 = new JToggleButton("13");
		tglbtnNewToggleButton_12.setFont(new Font("Arial", Font.BOLD, 30));
		frame.getContentPane().add(tglbtnNewToggleButton_12);
		
		JToggleButton tglbtnNewToggleButton_13 = new JToggleButton("14");
		tglbtnNewToggleButton_13.setFont(new Font("Arial", Font.BOLD, 30));
		frame.getContentPane().add(tglbtnNewToggleButton_13);
		
		JToggleButton tglbtnNewToggleButton_14 = new JToggleButton("15");
		tglbtnNewToggleButton_14.setFont(new Font("Arial", Font.BOLD, 30));
		frame.getContentPane().add(tglbtnNewToggleButton_14);
		
		JToggleButton tglbtnNewToggleButton_15 = new JToggleButton("16");
		tglbtnNewToggleButton_15.setFont(new Font("Arial", Font.BOLD, 30));
		frame.getContentPane().add(tglbtnNewToggleButton_15);
    }

}
