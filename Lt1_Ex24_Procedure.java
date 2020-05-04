/* Objetivo: 24.	Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3
 * Programador: Bruno Pereira dos Santos.
 * Data: 07/03/2019
 */

import javax.swing.JOptionPane;
public class Lt1_Ex24_Procedure{
    static double valor;
    public static void main(String[] args) {
        valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor"));
        ProcedureValor();
        
    }
    static void ProcedureValor(){
        if (valor %2 == 0){
          JOptionPane.showMessageDialog(null, "É divisivel por 2");  
        }
        else {
            JOptionPane.showMessageDialog(null, "É divisivel por 3");
        }
    }
}