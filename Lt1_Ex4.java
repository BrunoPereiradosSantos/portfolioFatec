/* Objetivo: 4.	Receba a temperatura em graus Celsius. Calcule e mostre a sua temperatura convertida em fahrenheit F = (9*C+160) /5.
 * Programador: Bruno Pereira dos Santos
 * Data:  07/03/2019
 */

import javax.swing.JOptionPane;
    public class Lt1_Ex4 {
        public static void main (String args []){
            double Celsius, Fahrenheit;
            Celsius = Double.parseDouble(JOptionPane.showInputDialog("Digite a Temperatura"));
            Fahrenheit =  (9 * Celsius +160) /5;
            System.out.println("O Valor Convertido de Celsius Para Fahrenheit é: " + Fahrenheit);
                    
        }
    }