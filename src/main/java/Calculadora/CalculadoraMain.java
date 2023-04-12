/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;

import java.awt.Color;

/**
 *
 * @author venganzaalchocolate
 */
public class CalculadoraMain {
     public static void main(String args[]) {

         // He copiado el main del componente con pequeños cambios
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               Marco calculadora= new Marco();
               calculadora.setVisible(true);
               calculadora.setResizable(false);
               calculadora.setLocationRelativeTo(null);
            }
        });
    }   
}
