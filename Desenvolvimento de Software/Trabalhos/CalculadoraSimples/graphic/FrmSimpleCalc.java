package graphic;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class FrmSimpleCalc extends JFrame {

	private JTextField txtX;
	private JTextField txtY;

	public FrmSimpleCalc() {

		getContentPane().setFont(new Font("Arial", Font.PLAIN, 12));
		setBounds(100, 100, 450, 150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JLabel xLabel = new JLabel("X:");
		xLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		xLabel.setBounds(10, 20, 30, 30);
		getContentPane().add(xLabel);

		// Entrada X
		txtX = new JTextField();
		txtX.setFont(new Font("Arial", Font.PLAIN, 20));
		txtX.setBounds(50, 20, 150, 30);
		getContentPane().add(txtX);
		txtX.setColumns(10);

		JLabel yLabel = new JLabel("Y:");
		yLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		yLabel.setBounds(221, 20, 30, 30);
		getContentPane().add(yLabel);

		// Entrada Y
		txtY = new JTextField();
		txtY.setFont(new Font("Arial", Font.PLAIN, 20));
		txtY.setBounds(258, 20, 150, 30);
		getContentPane().add(txtY);
		txtY.setColumns(10);

		JLabel opLabel = new JLabel("Opera\u00E7\u00E3o:");
		opLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		opLabel.setBounds(10, 61, 100, 30);
		getContentPane().add(opLabel);

		// Box com as Opções
		String[] op = { "Soma", "Subtração", "Divisão", "Multiplicação" };
		JComboBox<String> comboBox = new JComboBox<String>(op);
		comboBox.setFont(new Font("Arial", Font.PLAIN, 20));
		comboBox.setBounds(128, 61, 150, 30);
		getContentPane().add(comboBox);

		// Botão para Calcular
		JButton btnCalc = new JButton("Calcular");
		btnCalc.setFont(new Font("Arial", Font.PLAIN, 20));
		btnCalc.setBounds(288, 61, 120, 30);
		getContentPane().add(btnCalc);

		Action action = new Action(txtX, txtY, comboBox);
		btnCalc.addActionListener(action);

	}
}
