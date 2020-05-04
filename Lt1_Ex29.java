/* Objetivo: 29.	Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do investimento. Calcule e mostre o valor corrigido em 30 dias sabendo que a poupança = 3% e a renda fixa = 5%. Demais tipos não serão considerados.
 * Programador: Bruno Pereira dos Santos
 * Data: 07/03/2019
*/

import javax.swing.JOptionPane;
public class Lt1_Ex29{
    public static void main(String[] args) {
        double rendaFixa, poupança, valor, seleção;
        seleção = Double.parseDouble(JOptionPane.showInputDialog("Digite: \n 1 - Renda Fixa \n 2 - Poupança"));
        valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor da Aplicação"));
        rendaFixa = 1.05;
        poupança =  1.03;
        if (seleção == 1){
            valor = valor*rendaFixa;
            JOptionPane.showMessageDialog(null,"o Valor Corrigido em 30 dias é: " +valor);
        }
        else{
            valor = valor*poupança;
            JOptionPane.showMessageDialog(null,"O Valor Corrigido em 30 dias é: "+valor);
        }
    }
}