/* Objetivo: 22.	Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.
 * Programador: Bruno Pereira dos Santos.
 * Data: 13/03/2019
 */

import javax.swing.JOptionPane;
public class Lt1_Ex22_Procedure{
    static double val1, val2;
    public static void main(String[] args) {
        val1= Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        val2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor"));
        ProcedureCrescente();
        
    }
    static void ProcedureCrescente(){
        if (val1 < val2){
            JOptionPane.showMessageDialog(null,"A Ordem dos Valores Crescentes é: \n" +val1 + " e "+val2);
        }
        else{
            JOptionPane.showMessageDialog(null, " A Ordem dos Valores Crescente é: \n" +val2+ " e "+val1 );
        
        }
    }
}