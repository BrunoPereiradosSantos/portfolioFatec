/* Objetivo: 10.	Receba 2 números reais. Calcule e mostre a diferença desses valores.
 * Programador: Bruno Pereira dos Santos
 * Data: 07/03/2019
 */

import javax.swing.JOptionPane;
public class Lt1_Ex10 {
    public static void main (String args []){
        double A, B, Dif;
        A = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor de A: "));
        B = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor de B: "));
        Dif = A - B;
        System.out.println("A Diferença é: " + Dif);
    }
}
