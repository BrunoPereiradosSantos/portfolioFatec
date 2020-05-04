/* Objetivo: 19.	Receba 2 valores reais. Calcule e mostre o maior deles.
 * Programador: Bruno Pereira dos Santos
 * Data: 11/03/2019
 */

import javax.swing.JOptionPane;
public class Lt1_Ex19_Procedure{
    static double Val1, Val2,Maior;
    public static void main(String[] args) {
        Val1 = Double.parseDouble(JOptionPane.showInputDialog("Digite O Primeiro Valor"));
        Val2 = Double.parseDouble(JOptionPane.showInputDialog("Digite O Segundo Valor"));
        ProcedureMaior();
        JOptionPane.showMessageDialog(null, "O Maior deles é: " + Maior);
    }
    static void ProcedureMaior(){
        if (Val1 > Val2){
            Maior = Val1;
        }
        else{
            Maior = Val2;
        }
    }
}
