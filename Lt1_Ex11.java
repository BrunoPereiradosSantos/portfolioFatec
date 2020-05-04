/* Objetivo: 11.	Receba o raio de uma circunferência. Calcule e mostre o comprimento da circunferência.
 * Programador: Bruno Pereira dos Santos. 
 * Data: 07/03/2019
 */

import javax.swing.JOptionPane;
public class Lt1_Ex11 {
    public static void main (String args []){
        double Raio, Comp;
        Raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor do Raio"));
        Comp = 6.28 * Raio;
        System.out.println("O Comprimento da Circunferência é: " + Comp);
    }
}

