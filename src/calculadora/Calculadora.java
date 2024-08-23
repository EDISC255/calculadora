/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author eduardo
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new VistaCalculadora().setVisible(true);
    }

    public void prepararBotones(ActionListener al, JButton... btns) {
        for (int i = 0; i < btns.length; i++) {
            btns[i].addActionListener(al);
        }
    }

    public void detectarFuente(ActionEvent ae, JTextField txt, JButton... btns) {
        for (int i = 0; i < 10; i++) {
            if (!txt.getText().equals("0") && ae.getSource() == btns[i]) {
                txt.setText(txt.getText() + btns[i].getText());
                System.out.println(i);
            } else if (ae.getSource() == btns[i]) {
                txt.setText(btns[i].getText());
                System.out.println(i);
            }
        }
        //System.out.println(ae.getSource());
        if (ae.getSource() == btns[10]) {
            txt.setText(txt.getText() + btns[10].getText());
            btns[10].setEnabled(false);
        }
    }
}
