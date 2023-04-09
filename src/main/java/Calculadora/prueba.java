/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;

import javax.swing.JFrame;

/**
 *
 * @author venganzaalchocolate
 */
public class prueba {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora");
        frame.setBounds(250, 250, 0, 0);
        frame.setResizable(false);
        frame.add(new Marco());
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();

    }
}
