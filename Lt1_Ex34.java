/* Objetivo: 34.	Receba um número. Calcule e mostre os resultados da tabuada desse número.
 * Programador: Bruno Pereira dos Santos
 * Data: 15/03/2019
 */

import javax.swing.JOptionPane;
    public class Lt1_Ex34{
        public static void main(String[] args) {
            double n, tab=0, i;
            n= Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor de N"));
            for (i=0; i<=10; i++){
                tab = n * i;
            System.out.println("A Tabuada é: "+tab);
        }
    }
}
