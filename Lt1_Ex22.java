/* Objetivo: 22.	Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.
 * Programador: Bruno Pereira dos Santos.
 * Data: 13/03/2019
 */


import javax.swing.JOptionPane;
public class Lt1_Ex22 {
    public static void main(String[] args) {
        double val1, val2;
        val1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Primeiro Valor"));
        val2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Segundo Valor"));
        if (val1 > val2){
            System.out.println("A Sequência Crescente é: " + val2 + " " +val1);
        }
        else {
            System.out.println("A Sequencia Crescente é: " + val1 + " " +val2);
             }
    }
     
}