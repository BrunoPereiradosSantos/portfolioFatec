/* Objetivo: 23.	Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não necessariamente em ordem. Mostre os 4 números em ordem crescente.
 * Programador: Bruno Pereira dos Santos.
 * Data: 07/03/2019
 */

import javax.swing.JOptionPane;
public class Lt1_Ex23_Procedure{
    static double val1, val2, val3, val4;
    public static void main(String[] args) {
        val1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor"));
        val2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor"));
        val3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro valor"));
        val4 = Double.parseDouble(JOptionPane.showInputDialog("Digite o quarto valor"));
        ProcedureCrescente();
        
    }
    static void ProcedureCrescente(){
        if (val1 > val4){
            JOptionPane.showMessageDialog(null,+val4+ " "+val1+ " "+val2+ " "+val3);
        }
        else if (val4 < val2){
            JOptionPane.showMessageDialog(null, +val1+" "+val4+" "+val2+" "+val3);
        }
        else if(val4 < val3){
            JOptionPane.showMessageDialog(null, +val1+ " "+val2+" "+val4+" "+val3);
        }
        else{
            JOptionPane.showMessageDialog(null, +val1+ " "+val2+" "+val3+" "+val4);
        }
    }
}