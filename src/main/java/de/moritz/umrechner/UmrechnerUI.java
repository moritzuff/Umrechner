package de.moritz.umrechner;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class UmrechnerUI {
    private JFrame fenster;
    private JLabel labelFahrenheit;
    private JTextField textFahrenheit;
    private JLabel labelCelsius;
    private JTextField textCelsius;
    private JButton cmdUmrechnen;
    private JButton cmdClear;
    
    public UmrechnerUI() {
        
        fenster = new JFrame(); 
        fenster.setSize(600, 450);
        fenster.setLayout(null);
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        labelFahrenheit = new JLabel();
        labelFahrenheit.setText("Grad Fahrenheit:");
        labelFahrenheit.setBounds(110, 60, 150, 30);
        fenster.add(labelFahrenheit);

        textFahrenheit = new JTextField();
        textFahrenheit.setBounds(260, 60, 150, 30);
        fenster.add(textFahrenheit);
        
        cmdUmrechnen = new JButton();
        cmdUmrechnen.setText("Umrechnen");
        cmdUmrechnen.setBounds(160, 140, 220, 25);
        cmdUmrechnen.addActionListener(this::load);
        fenster.add(cmdUmrechnen);
        
        labelCelsius = new JLabel();
        labelCelsius.setText("Grad Celsius:");
        labelCelsius.setBounds(110, 210, 150, 30);
        fenster.add(labelCelsius);

        textCelsius = new JTextField();
        textCelsius.setBounds(260, 210, 150, 30);
        fenster.add(textCelsius);
        
        /*
        cmdClear = new JButton();
        cmdClear.setText("Zurücksetzen");
        cmdClear.setBounds(160, 290, 220, 25);
        cmdUmrechnen.addActionListener(this::clearText);
        fenster.add(cmdClear);
        */
        
        fenster.setVisible(true);
    }
    
    /*
    public void clearText(ActionEvent actionEvent) {
        textFahrenheit.setText("");
        textCelsius.setText("");
        textFahrenheit.requestFocus();
    }
*/
    
    public void load(ActionEvent actionEvent) {
        Umrechner umrechner;
        double grad;
        umrechner = new Umrechner();
        grad = Double.parseDouble(textFahrenheit.getText());
        umrechner.setFahrenheit(grad);
        grad = umrechner.umrechnenInCelsius();
        textCelsius.setText(String.valueOf(grad));
    }
}
