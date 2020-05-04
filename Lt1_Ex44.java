/* Objetivo: 44.	Receba o número da base e do expoente. Calcule e mostre o valor da potência.
 * Prograador: Bruno Pereira dos Santos.
 * Data: 18/03/2019
 */

import javax.swing.JOptionPane;
public class Lt1_Ex44{
    public static void main(String[] args) {
        double Base, Expoente, Resposta=1, i = 0;
        Base = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor de Base"));
        Expoente = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor de Expoente"));
        while ( i < Expoente ){
            Resposta = Resposta * Base;
           i = i+1;
        }
        System.out.println("O Resultado é: " + Resposta);
        
    }
}
