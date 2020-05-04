/* Objetivo: 32.	Receba um número inteiro. Calcule e mostre o seu fatorial.
 * Programador: Bruno Pereira dos Santos
 * Data: 15/03/2019
 */

import javax.swing.JOptionPane;
public class Lt1_Ex32{
    public static void main(String[] args) {
        int n, i, fat=1;
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite O Valor de N: "));
        for (i = n; i>0; i--){
          fat = fat*i;
        }
        System.out.println("O fatorial é: "+fat);
    }
}

