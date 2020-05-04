/* Objetivo: 3.	Receba a base e a altura de um triângulo. Calcule e mostre a sua área.
 * Programador: Bruno Pereira dos Santos
 * Data: 07/03/2019
 */


import javax.swing.JOptionPane;
    public class Lt1_Ex3 {
        public static void main (String args []){
            double Base, Altura, Área;
            Base = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor de Base"));
            Altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor de Altura"));
            Área = (Base * Altura)/2;
            System.out.println("A àrea do Triãngulo é: " + Área);
        }
    }