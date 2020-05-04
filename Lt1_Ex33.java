/* Objetivo: 33.	Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.
 * Programador: Bruno Pereira dos Santos 
 * Data: 15/03/2019
 */

import javax.swing.JOptionPane; 
public class Lt1_Ex33{
    public static void main(String[] args) {
        double n, i, série, soma=0;
        n = Double.parseDouble(JOptionPane.showInputDialog("Digite O Valor de N: "));
        for (i = n; i >=1; i--)
        {
            série = 1/i;
        soma = soma + série;
        System.out.println("A série é: " +soma);
        }
    }      
}
