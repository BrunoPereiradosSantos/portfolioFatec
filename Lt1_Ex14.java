/* Objetivo: 14.	Receba 2 ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo.
 * Programador: Bruno Pereira dos Santos
 * Data: 07/03/2019
 */

import javax.swing.JOptionPane;
 public class Lt1_Ex14 {
     public static void main (String args []){
         double Ang1, Ang2, Ang3;
         Ang1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor do Primeiro Angulo"));
         Ang2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor do Segundo Angulo"));
         Ang3 = 180 - (Ang1 + Ang2);
         System.out.println(" O Terceiro Ângulo tem: " + Ang3 + " graus " );
     }
 }