/* Objetivo: 19.	Receba 2 valores reais. Calcule e mostre o maior deles.
 * Programador: Bruno Pereira dos Santos
 * Data: 11/03/2019
 */

import javax.swing.JOptionPane;
public class Lt1_Ex19 {
    public static void main(String[] args) {
        double Val1, Val2, Maior;
        Val1 = Double.parseDouble(JOptionPane.showInputDialog("Digite O Primeiro Valor"));
        Val2 = Double.parseDouble(JOptionPane.showInputDialog("Digite O Primeiro Valor"));
        if (Val1 > Val2){
            Maior = Val1;
            System.out.println("O Maior valor é: " + Maior);
        }
        else{
            Maior = Val2;
            System.out.println("O maior valor é: "+ Maior);
        }
        
    }
}