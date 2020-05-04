/* Objetivo: 16.	Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto e o número de descendentes. Calcule o salário que serão as horas trabalhadas x o valor por hora. Calcule o salário líquido (= Salário Bruto – desconto). A cada dependente será acrescido R$ 100 no Salário Líquido. Exiba o salário a receber.
 * Programador: Bruno Pereira dos Santos.
 * Data: 07/03/2019
 */

import javax.swing.JOptionPane;
public class Lt1_Ex16 {
    public static void main (String args []){
        double horasTrab, valorHora, percDesc, numDep, salLiq, salBruto;
        horasTrab = Double.parseDouble(JOptionPane.showInputDialog("Digite a Quantidade de Horas Trabalhada"));
        valorHora = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor Recebido Por hora"));
        percDesc = Double.parseDouble(JOptionPane.showInputDialog("Digite o Percentual de Desconto"));
        numDep = Double.parseDouble(JOptionPane.showInputDialog("Digite a Quantidade de Dependentes"));
        salBruto = valorHora * horasTrab;
        salLiq =  ((salBruto * percDesc) + (100 * numDep)) - salBruto;
        System.out.println("O Salario Liquido é: " + salLiq + " reais ");
    }
}
