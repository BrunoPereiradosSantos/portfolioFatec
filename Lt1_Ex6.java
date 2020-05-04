/* Objetivo: 6.	Receba os valores em x e y. Efetua a troca de seus valores e mostre seus conteúdos.
 * Programador: Bruno Pereira dos Santos
 * Data: 07/03/2019
 */

import javax.swing.JOptionPane;
    public class Lt1_Ex6 {
        public static void main (String args []){
            int A, B, C;
            A = Integer.parseInt(JOptionPane.showInputDialog("Digite o Valor de A"));
            B = Integer.parseInt(JOptionPane.showInputDialog("Digite o Valor de B"));
            C = A;
            A = B;
            B = C;
            System.out.println("A Troca dos Conteúdos é; " +A);
            System.out.println("A Troca dos Conteúdos é: " +B);
        }
    }
