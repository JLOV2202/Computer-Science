package grafica;

import javax.swing.AbstractAction;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

import logica.Calculadora;
import logica.Calculadora.Operacao;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class FrmCalculadora extends JFrame {
    private JTextField txtDisplay;
    private Calculadora calculadora;
    public FrmCalculadora() {
        // Instanciar a Calculadora
        this.calculadora = new Calculadora();

        // Define layout do JFrame
        // Divide em 5 regiões: Norte, Sul, Leste, Oeste e Centro
        setLayout(new BorderLayout());

        // JPanel Norte
        JPanel pnlNorte = new JPanel(new BorderLayout());
        this.add(pnlNorte, BorderLayout.NORTH);
        this.txtDisplay = new JTextField();
        txtDisplay.setEditable(false);
        pnlNorte.add(this.txtDisplay, BorderLayout.CENTER);

        // JPanel Centro
        JPanel pnlCentro = new JPanel(new GridLayout(5, 4, 5, 5));
        this.add(pnlCentro, BorderLayout.CENTER);

        // Ler InputMap
        InputMap inputMap = pnlCentro.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);

        JButton btn = new JButton("C");
        btn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                txtDisplay.setText("");
                calculadora.setAguardando(false);
            }
        });
        pnlCentro.add(btn);
        inputMap.put(KeyStroke.getKeyStroke('c'), 'c');
        pnlCentro.getActionMap().put('c', (AbstractAction) btn.getActionListeners()[0]);

        btn = new JButton("*");
        btn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                String txtAntigo = txtDisplay.getText();
                calculadora.setOperando1(Double.parseDouble(txtAntigo.replace(",", ".")));
                calculadora.setOperacao(Operacao.MULTIPLICACAO);
                calculadora.setAguardando(true);
                txtDisplay.setText("");
            }
        });  
        pnlCentro.add(btn);
        inputMap.put(KeyStroke.getKeyStroke('*'), '*');
        pnlCentro.getActionMap().put('*', (AbstractAction) btn.getActionListeners()[0]);

        btn = new JButton("x\u00B2");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                String txtAntigo = txtDisplay.getText();
                calculadora.setOperando1(Double.parseDouble(txtAntigo.replace(",", ".")));
                calculadora.setOperacao(Operacao.POTENCIA);
                calculadora.setAguardando(true);
                txtDisplay.setText("");
            }
        });  
        pnlCentro.add(btn);

        btn = new JButton("<");
        btn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                String txtAntigo = txtDisplay.getText();
                if (txtAntigo.length() > 0) {
                    txtDisplay.setText(txtAntigo.substring(0, txtAntigo.length() - 1));
                }                
            }
        });         
        pnlCentro.add(btn);
        inputMap.put(KeyStroke.getKeyStroke("BACK_SPACE"), '<');
        pnlCentro.getActionMap().put('<', (AbstractAction) btn.getActionListeners()[0]);

        btn = new JButton("7");
        btn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                String txtAntigo = txtDisplay.getText();
                txtDisplay.setText(txtAntigo.concat("7"));
            }
        });        
        pnlCentro.add(btn);
        inputMap.put(KeyStroke.getKeyStroke('7'), '7');
        pnlCentro.getActionMap().put('7', (AbstractAction) btn.getActionListeners()[0]);

        btn = new JButton("8");
        btn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                String txtAntigo = txtDisplay.getText();
                txtDisplay.setText(txtAntigo.concat("8"));
            }
        });        
        pnlCentro.add(btn);
        inputMap.put(KeyStroke.getKeyStroke('8'), '8');
        pnlCentro.getActionMap().put('8', (AbstractAction) btn.getActionListeners()[0]);

        btn = new JButton("9");
        btn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                String txtAntigo = txtDisplay.getText();
                txtDisplay.setText(txtAntigo.concat("9"));
            }
        });        
        pnlCentro.add(btn);
        inputMap.put(KeyStroke.getKeyStroke('9'), '9');
        pnlCentro.getActionMap().put('9', (AbstractAction) btn.getActionListeners()[0]);

        btn = new JButton("/");
        btn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                String txtAntigo = txtDisplay.getText();
                calculadora.setOperando1(Double.parseDouble(txtAntigo.replace(",", ".")));
                calculadora.setOperacao(Operacao.DIVISAO);
                calculadora.setAguardando(true);
                txtDisplay.setText("");
            }
        });  
        pnlCentro.add(btn);
        inputMap.put(KeyStroke.getKeyStroke('/'), '/');
        pnlCentro.getActionMap().put('/', (AbstractAction) btn.getActionListeners()[0]);

        btn = new JButton("4");
        btn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                String txtAntigo = txtDisplay.getText();
                txtDisplay.setText(txtAntigo.concat("4"));
            }
        });        
        pnlCentro.add(btn);
        inputMap.put(KeyStroke.getKeyStroke('4'), '4');
        pnlCentro.getActionMap().put('4', (AbstractAction) btn.getActionListeners()[0]);

        btn = new JButton("5");
        btn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                String txtAntigo = txtDisplay.getText();
                txtDisplay.setText(txtAntigo.concat("5"));
            }
        });        
        pnlCentro.add(btn);
        inputMap.put(KeyStroke.getKeyStroke('5'), '5');
        pnlCentro.getActionMap().put('5', (AbstractAction) btn.getActionListeners()[0]);

        btn = new JButton("6");
        btn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                String txtAntigo = txtDisplay.getText();
                txtDisplay.setText(txtAntigo.concat("6"));
            }
        });        
        pnlCentro.add(btn);
        inputMap.put(KeyStroke.getKeyStroke('6'), '6');
        pnlCentro.getActionMap().put('6', (AbstractAction) btn.getActionListeners()[0]);

        btn = new JButton("+");
        btn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                String txtAntigo = txtDisplay.getText();
                calculadora.setOperando1(Double.parseDouble(txtAntigo.replace(",", ".")));
                calculadora.setOperacao(Operacao.SOMA);
                calculadora.setAguardando(true);
                txtDisplay.setText("");
            }
        });        
        pnlCentro.add(btn);
        inputMap.put(KeyStroke.getKeyStroke('+'), '+');
        pnlCentro.getActionMap().put('+', (AbstractAction) btn.getActionListeners()[0]);

        btn = new JButton("1");
        btn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                String txtAntigo = txtDisplay.getText();
                txtDisplay.setText(txtAntigo.concat("1"));
            }
        });
        pnlCentro.add(btn);
        inputMap.put(KeyStroke.getKeyStroke('1'), '1');
        pnlCentro.getActionMap().put('1', (AbstractAction) btn.getActionListeners()[0]);

        btn = new JButton("2");
        btn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                String txtAntigo = txtDisplay.getText();
                txtDisplay.setText(txtAntigo.concat("2"));
            }
        });
        pnlCentro.add(btn);
        inputMap.put(KeyStroke.getKeyStroke('2'), '2');
        pnlCentro.getActionMap().put('2', (AbstractAction) btn.getActionListeners()[0]);

        btn = new JButton("3");
        btn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                String txtAntigo = txtDisplay.getText();
                txtDisplay.setText(txtAntigo.concat("3"));
            }
        });        
        pnlCentro.add(btn);
        inputMap.put(KeyStroke.getKeyStroke('3'), '3');
        pnlCentro.getActionMap().put('3', (AbstractAction) btn.getActionListeners()[0]);

        btn = new JButton("-");
        btn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                String txtAntigo = txtDisplay.getText();
                calculadora.setOperando1(Double.parseDouble(txtAntigo.replace(",", ".")));
                calculadora.setOperacao(Operacao.SUBTRACAO);
                calculadora.setAguardando(true);
                txtDisplay.setText("");
            }
        });  
        pnlCentro.add(btn);
        inputMap.put(KeyStroke.getKeyStroke('-'), '-');
        pnlCentro.getActionMap().put('-', (AbstractAction) btn.getActionListeners()[0]);

        btn = new JButton("+/-");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                String txtAntigo = txtDisplay.getText();
                double num = Double.parseDouble(txtAntigo.replace(",", "."));
                num *= -1;
                txtDisplay.setText(String.format("%f", num));
            }
        });  
        pnlCentro.add(btn);

        btn = new JButton("0");
        btn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                String txtAntigo = txtDisplay.getText();
                txtDisplay.setText(txtAntigo.concat("0"));
            }
        });        
        pnlCentro.add(btn);
        inputMap.put(KeyStroke.getKeyStroke('0'), '0');
        pnlCentro.getActionMap().put('0', (AbstractAction) btn.getActionListeners()[0]);

        btn = new JButton(",");
        btn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                String txtAntigo = txtDisplay.getText();                
                if (!txtAntigo.contains(",")) {
                    txtDisplay.setText(txtAntigo.concat(","));
                }
            }
        });          
        pnlCentro.add(btn);
        inputMap.put(KeyStroke.getKeyStroke(','), ',');
        pnlCentro.getActionMap().put(',', (AbstractAction) btn.getActionListeners()[0]);

        btn = new JButton("=");
        btn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) { 
                if (calculadora.isAguardando()) {
                    String txtAntigo = txtDisplay.getText();
                    calculadora.setOperando2(Double.parseDouble(txtAntigo.replace(",", ".")));
                    txtDisplay.setText(String.format("%f", calculadora.calcular()));
                    calculadora.setAguardando(false);
                }
            }
        });         
        pnlCentro.add(btn);
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER,0), '=');
        pnlCentro.getActionMap().put('=', (AbstractAction) btn.getActionListeners()[0]);

        this.pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pnlCentro.requestFocus();
    }
}