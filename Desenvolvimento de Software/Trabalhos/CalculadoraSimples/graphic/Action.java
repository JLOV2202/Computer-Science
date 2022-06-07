package graphic;

import java.awt.event.ActionEvent;
import java.awt.Font;

import javax.swing.AbstractAction;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

import logic.SimpleCalc;

public class Action extends AbstractAction{
    
    private JTextField txtX, txtY;
    private JComboBox<String> comboBox;
    
    public Action(JTextField txtX, JTextField txtY, JComboBox<String> comboBox){
        this.txtX = txtX;
        this.txtY = txtY;
        this.comboBox = comboBox;
    }
    @Override
    public void actionPerformed(ActionEvent e){

        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Arial", Font.PLAIN, 20)));

        try{
            double x = Double.parseDouble(txtX.getText());
            double y = Double.parseDouble(txtY.getText());
            double res;
            String op = comboBox.getSelectedItem().toString();

            if (op.equals("Soma")){
                res = SimpleCalc.sum(x, y);
                JOptionPane.showMessageDialog(null, String.format("%.2f + %.2f = %.2f", x, y, res),"Calculadora Simples", JOptionPane.INFORMATION_MESSAGE);
            } else if (op.equals("Subtração")){
                res = SimpleCalc.sub(x, y);
                JOptionPane.showMessageDialog(null, String.format("%.2f - %.2f = %.2f", x, y, res),"Calculadora Simples", JOptionPane.INFORMATION_MESSAGE);
            } else if (op.equals("Divisão")){
                if (y != 0){
                    res = SimpleCalc.div(x, y);
                    JOptionPane.showMessageDialog(null, String.format("%.2f / %.2f = %.2f", x, y, res),"Calculadora Simples", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Valor Inválido!", "ERRO", JOptionPane.ERROR_MESSAGE);
                }
            } else if (op.equals("Multiplicação")){
                res = SimpleCalc.mul(x, y);
                JOptionPane.showMessageDialog(null, String.format("%.2f * %.2f = %.2f", x, y, res),"Calculadora Simples", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Valor Inválido!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
}
