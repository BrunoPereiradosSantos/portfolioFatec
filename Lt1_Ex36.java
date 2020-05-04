/* Objetivo: 36.	Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!
 * Programador: Bruno Pereira dos Santos
 * Data: 18/03/2019
 */

import javax.swing.JOptionPane;
public class Lt1_Ex36{
    public static void main(String[] args) {
        double N, Soma=0, I, Fat=1;
        N = Double.parseDouble(JOptionPane.showInputDialog("Digite O Valor de N: "));
        for (I = N; I >=1; I++){
            Soma = Soma + (1/I);
        }
        System.out.println("A Série é: "+Soma);
    }
}