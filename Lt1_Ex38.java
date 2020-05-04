/* Objetivo: 38.	Receba 100 números inteiros reais. Verifique e mostre o maior e o menor valor. Obs.: somente valores positivos.
 * Programador: Bruno Pereira dos Santos
 * Data: 18/03/2019
 */

import javax.swing.JOptionPane;
public class Lt1_Ex38{
    public static void main(String[] args) {
        double I, N, Maior, Menor;
        N = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor de N: "));
        Maior = Double.parseDouble(JOptionPane.showInputDialog("Digite o Maior Valor"));
        Menor = Double.parseDouble(JOptionPane.showInputDialog("Digite o Menor Valor"));
        for ( I = N; I<=100; I++){
            if (I == 0){
                Maior = N;
                Menor = N;
            }
            else if (N > Maior){
                Maior = N;
               
                
            }
            else if (N > Menor ){
                Menor = N;
            }
            I = I+1;
        
            
        }
        JOptionPane.showMessageDialog(null, " O Resultado é:  " + Maior + " , " +Menor);
    }
}
