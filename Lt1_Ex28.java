/*Objetivo: 28.	Receba o preço atual e a média mensal de um produto. Calcule e mostre o novo preço sabendo que:
Venda Mensal        Preço Atual	Preço Novo
    < 500           < 30            +10%
>= 500 e < 1000     >= 30 e < 80    +15%
>= 1000             >= 80           - 5%
Obs.: para outras condições, preço novo será igual ao preço atual.
 * Programador: Bruno Pereira dos Santos
 * Data: 07/03/2019
*/


import javax.swing.JOptionPane;
public class Lt1_Ex28{
    public static void main(String[] args) {
        double vendaMensal, preçoAtual, preçoNovo;
        preçoAtual = Double.parseDouble(JOptionPane.showInputDialog("Digite O Preço Atual"));
        vendaMensal = Double.parseDouble(JOptionPane.showInputDialog("Digite A Venda Mensal"));
        if (preçoAtual<30 && vendaMensal <500){
          preçoNovo = preçoAtual*1.10;
          System.out.println("O Preço Novo é: " + preçoNovo);
    }
        else if(preçoAtual >=30 || preçoAtual <80 && vendaMensal >=500 || vendaMensal <1000){
            preçoNovo = preçoAtual*1.15;
            System.out.println("O Preço Novo é: "+ preçoNovo);
        }
        else if (preçoAtual >=80 && vendaMensal >=1000){
            preçoNovo = preçoAtual -(preçoAtual*0.05);
            System.out.println("O Preço Novo é: " + preçoNovo);
        }
        else {
            preçoNovo = preçoAtual;
            System.out.println("O Preço Novo é: " + preçoNovo);
        }
    }    
}