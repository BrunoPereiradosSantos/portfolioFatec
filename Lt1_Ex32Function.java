/* Objetivo: 32.	Receba um número inteiro. Calcule e mostre o seu fatorial.
 * Programador: Bruno Pereira dos Santos
 * Data: 15/03/2019
 */

import javax.swing.JOptionPane;
public class Lt1_Ex32Function{
    
    public static void main(String[] args) {
        int N, fat;
         N = Integer.parseInt(JOptionPane.showInputDialog("Digite o Valor de N:"));
        fat = função(N);
        System.out.println("O Fatorial é: " +fat);
    }
    
    static int função(int num){
        int fat = 1;
        for (int i = num; i > 0; i--){
            fat = fat * i;
            
        }
        return fat;
    }
}

