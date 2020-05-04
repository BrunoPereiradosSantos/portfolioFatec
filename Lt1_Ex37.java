/* Objetivo: 37.	Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu N’nésimo termo.
 * Programador: Bruno Pereira dos Santos
 * Data: 18/03/2019
 */


import javax.swing.JOptionPane;
public class Lt1_Ex37{
    public static void main(String[] args) {
        double N, A=1, B=1, C=1, I;
        N = Double.parseDouble(JOptionPane.showInputDialog("Digite O Valor de N: "));
        for (I = 1; I <=N; I++){
            C = (A+B);
            A = B;
            B = A;
            B = C;
        }
        System.out.println("A Sequencia Fibonacci é: " + C );
    }
}