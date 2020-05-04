/* Objetivo: 9.	Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados.
 * Programador: Bruno Pereira dos Santos.
 * Data: 07/03/2018
 */

import javax.swing.JOptionPane;
public class Lt1_Ex9 {
    public static void main (String args []){
        double A, B, Quadrados;
        A = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor de A: "));
        B = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor de B: "));
        A = A*A;
        B = B*B;
        Quadrados = A + B;
        System.out.println("A Soma dos Quadrados é: " + Quadrados);
    }
}