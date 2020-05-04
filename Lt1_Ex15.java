/* Objetivo: 15.	Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre a hipotenusa.
 * Programador: Bruno Pereira dos Santos
 * Data: 07/03/2019
 */

import javax.swing.JOptionPane;
public class Lt1_Ex15 {
    public static void main (String args []){
        double Cateto1, Cateto2, Hipotenusa;
        Cateto1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor do Primeiro Cateto"));
        Cateto2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor do Segundo Cateto"));
        Hipotenusa = Math.sqrt((Cateto1*Cateto1) + (Cateto2*Cateto2));
        System.out.println("A Hipotenusa é: " + Hipotenusa);
    }
}