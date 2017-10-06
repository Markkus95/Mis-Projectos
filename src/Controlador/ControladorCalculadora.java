
package Controlador;

import Modelo.Calculadora;
import Vista.CalculadoraVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Marc
 */
public class ControladorCalculadora implements ActionListener {
    CalculadoraVista vista;
    Calculadora calc=new Calculadora();
    private final JLabel display=new JLabel();

    public ControladorCalculadora (CalculadoraVista vistav) {
        this.vista=vistav;
        
        this.vista.Cero.addActionListener(this);
        this.vista.Uno.addActionListener(this);
        this.vista.Dos.addActionListener(this);
        this.vista.Tres.addActionListener(this);
        this.vista.Cuatro.addActionListener(this);
        this.vista.Cinco.addActionListener(this);
        this.vista.Seis.addActionListener(this);
        this.vista.Siete.addActionListener(this);
        this.vista.Ocho.addActionListener(this);
        this.vista.Nueve.addActionListener(this);
        this.vista.Suma.addActionListener(this);
        this.vista.Resta.addActionListener(this);
        this.vista.Multiplicacion.addActionListener(this);
        this.vista.Division.addActionListener(this);
        this.vista.Igual.addActionListener(this);
        this.vista.Texto.addActionListener(this);
        this.vista.Borrar.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JPanel panell = new JPanel() ;
        panell.add(display);
        
        JButton boto = (JButton) e.getSource();  
        JButton Cero = vista.Cero;
        JButton Uno = vista.Uno;
        JButton Dos = vista.Dos;
        JButton Tres = vista.Tres;
        JButton Cuatro = vista.Cuatro;
        JButton Cinco = vista.Cinco;
        JButton Seis = vista.Seis;
        JButton Siete = vista.Siete;
        JButton Ocho = vista.Ocho;
        JButton Nueve = vista.Nueve;
        JButton Suma = vista.Suma;
        JButton Resta = vista.Resta;
        JButton Multiplicar = vista.Multiplicacion;
        JButton Dividir = vista.Division;
        JButton Igual = vista.Igual;
        JButton Borrar = vista.Borrar;
        JTextField Texto = vista.Texto;

        if (boto==Cero) {
            calc.pitjarNumero(Integer.parseInt(Cero.getText()));
            Texto.setText(String.valueOf(calc.getDisplay()));
        } else if (boto==Uno) {
            calc.pitjarNumero(Integer.parseInt(Uno.getText()));
            Texto.setText(String.valueOf(calc.getDisplay()));
        } else if (boto==Dos) {
            calc.pitjarNumero(Integer.parseInt(Dos.getText()));
            Texto.setText(String.valueOf(calc.getDisplay()));
        } else if (boto==Tres) {
            calc.pitjarNumero(Integer.parseInt(Tres.getText()));
            Texto.setText(String.valueOf(calc.getDisplay()));
        } else if (boto==Cuatro) {
            calc.pitjarNumero(Integer.parseInt(Cuatro.getText()));
            Texto.setText(String.valueOf(calc.getDisplay()));
        } else if (boto==Cinco) {
            calc.pitjarNumero(Integer.parseInt(Cinco.getText()));
            Texto.setText(String.valueOf(calc.getDisplay()));
        } else if (boto==Seis) {
            calc.pitjarNumero(Integer.parseInt(Seis.getText()));
            Texto.setText(String.valueOf(calc.getDisplay()));
        } else if (boto==Siete) {
            calc.pitjarNumero(Integer.parseInt(Siete.getText()));
            Texto.setText(String.valueOf(calc.getDisplay()));
        } else if (boto==Ocho) {
            calc.pitjarNumero(Integer.parseInt(Ocho.getText()));
            Texto.setText(String.valueOf(calc.getDisplay()));
        } else if (boto==Nueve) {
            calc.pitjarNumero(Integer.parseInt(Nueve.getText()));
            Texto.setText(String.valueOf(calc.getDisplay()));
        } else if (boto==Suma) {
            calc.pitjarOperacio(Calculadora.SUMA);
            Texto.setText(String.valueOf(calc.getDisplay()));
        } else if (boto==Resta) {
            calc.pitjarOperacio(Calculadora.RESTA);
            Texto.setText(String.valueOf(calc.getDisplay()));
        } else if (boto==Multiplicar) {
            calc.pitjarOperacio(Calculadora.MULTIPLICA);
            Texto.setText(String.valueOf(calc.getDisplay()));
        } else if (boto==Dividir) {
            calc.pitjarOperacio(Calculadora.DIVIDEIX);
            Texto.setText(String.valueOf(calc.getDisplay()));
        } else if (boto==Igual) {
            calc.resultat();
            Texto.setText(String.valueOf(calc.getDisplay()));
        } else if (boto==Borrar) {
            calc.reset();
            Texto.setText(String.valueOf(calc.getDisplay()));
        } 
    }
}
