/*Objetivo: 28.	Receba o preço atual e a média mensal de um produto. Calcule e mostre o novo preço sabendo que:
Venda Mensal        Preço Atual	    Preço Novo
    < 500           < 30            +10%
>= 500 e < 1000     >= 30 e < 80    +15%
>= 1000             >= 80           - 5%
Obs.: para outras condições, preço novo será igual ao preço atual.
 * Programador: Bruno Pereira dos Santos
 * Data: 07/03/2019
*/

import javax.swing.JOptionPane;
public class Lt1_Ex28_Procedure{
    static double vendaMensal, preçoAtual, preçoNovo;
    public static void main(String[] args) {
        vendaMensal = Double.parseDouble(JOptionPane.showInputDialog("Digite a venda mensal"));
        preçoAtual = Double.parseDouble(JOptionPane.showInputDialog("Digite a venda atual"));
        preçoNovo = Double.parseDouble(JOptionPane.showInputDialog("Digite a preço novo"));
        ProcedureNovo();
        JOptionPane.showMessageDialog(null,"O preço novo é: "+preçoNovo);
    }
    static void ProcedureNovo(){
        if (vendaMensal < 500 && preçoAtual <30){
            preçoNovo = preçoAtual * 1.10;
        }
        else if (vendaMensal >=500 || vendaMensal <1000 && preçoAtual >=30 || preçoAtual <80){
            preçoNovo = preçoAtual * 1.15;
        }
        else if (vendaMensal >=100 && preçoAtual >=80){
            preçoNovo = preçoAtual - (preçoAtual * 0.05);
        }
        else {
            preçoNovo = preçoAtual;
        }
    }
}