/* Objetivo: 26.	Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor.
 * Programador: Bruno Pereira dos Santos.
 * Data: 11/03/2019
 */

import javax.swing.JOptionPane;
public class Lt1_Ex26_Procedure{
    static double val1, val2;
    public static void main(String[] args) {
        
   
    val1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
    val2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
    ProcedureMultiplo();
}
    static void ProcedureMultiplo(){
        if (val1 == val2){
            JOptionPane.showMessageDialog(null,"São valores iguais, portanto, múltiplos");
        }
        else if (val1 > val2 && val1%val2== 0){
            JOptionPane.showMessageDialog(null, "O Primeiro valor é maior e múltiplo do segundo ");
        }
        else if (val2 > val1 && val2%val1 == 0) {
            JOptionPane.showMessageDialog(null, "O Segundo valor é maior e múltiplo do primeiro ");
        }
        else {
            JOptionPane.showMessageDialog(null, "Não há múltiplos");
        }
    }
}