/* Objetivo: 24.	Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3
 * Programador: Bruno Pereira dos Santos.
 * Data: 07/03/2019
 */

import javax.swing.JOptionPane;
public class Lt1_Ex24{
    public static void main(String[] args) {
        double a, div;
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor de A: "));
        if (a %2 == 0){
            
            System.out.println("O Valor é Divisivel por 2 ");
        }
        else {
            
            System.out.println("O Valor é Divisivel por 3");
        }
    }
}