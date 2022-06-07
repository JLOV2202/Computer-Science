package Interface;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

public class FrmSimpleCalc extends JFrame{

    public JFrame frame;
    private JTextField txtX;
    private JTextField txtY;

    public FrmSimpleCalc (){
        initialize();
    }

    public void initialize(){
        frame = new JFrame();
		frame.getContentPane().setFont(new Font("Arial", Font.PLAIN, 12));
		frame.setBounds(100, 100, 450, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel xLabel = new JLabel("X:");
		xLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		xLabel.setBounds(10, 20, 30, 30);
		frame.getContentPane().add(xLabel);
		
		// Entrada X
		txtX = new JTextField();
		txtX.setFont(new Font("Arial", Font.PLAIN, 20));
		txtX.setBounds(50, 20, 150, 30);
		frame.getContentPane().add(txtX);
		txtX.setColumns(10);
		
		JLabel yLabel = new JLabel("Y:");
		yLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		yLabel.setBounds(221, 20, 30, 30);
		frame.getContentPane().add(yLabel);
		
		// Entrada Y
		txtY = new JTextField();
		txtY.setFont(new Font("Arial", Font.PLAIN, 20));
		txtY.setBounds(258, 20, 150, 30);
		frame.getContentPane().add(txtY);
		txtY.setColumns(10);
		
		JLabel opLabel = new JLabel("Opera\u00E7\u00E3o:");
		opLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		opLabel.setBounds(10, 61, 100, 30);
		frame.getContentPane().add(opLabel);
		
		// Box com as Opções
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Soma", "Subtração", "Divisão", "Multiplicação"}));
		comboBox.setFont(new Font("Arial", Font.PLAIN, 20));
		comboBox.setBounds(128, 61, 150, 30);
		frame.getContentPane().add(comboBox);
		
		// Botão para Calcular
		JButton btcCalc = new JButton("Calcular");
		btcCalc.setFont(new Font("Arial", Font.PLAIN, 20));
		btcCalc.setBounds(288, 61, 120, 30);
		frame.getContentPane().add(btcCalc);
    }
}
