/* Objetivo: 29.	Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do investimento. Calcule e mostre o valor corrigido em 30 dias sabendo que a poupança = 3% e a renda fixa = 5%. Demais tipos não serão considerados.
 * Programador: Bruno Pereira dos Santos
 * Data: 07/03/2019
*/

import javax.swing.JOptionPane;
public class Lt1_Ex29_Procedure{
    static double valor, poupança, rendaFixa, seleção;
    public static void main(String[] args) {
        seleção = Double.parseDouble(JOptionPane.showInputDialog("Digite: \n 1 - poupança \n 2 - renda fixa"));
        valor = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor"));
        rendaFixa = 1.05;
        poupança = 1.03;
        ProcedureOpção();
        JOptionPane.showMessageDialog(null, " O Valor Corrigido é:  " + seleção);
    }
    static void ProcedureOpção(){
        if (seleção == 1){
            seleção = valor * poupança;
        }
        else {
            
            seleção = valor * rendaFixa;
        }
        
        
    }
}