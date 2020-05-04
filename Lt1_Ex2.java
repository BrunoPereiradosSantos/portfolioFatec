/* Objetivo: 2.	Receba o salário de um funcionário e mostre o novo salário com reajuste de 15%.
 * Programador: Bruno Pereira dos Santos
 * Data:  07/03/2019
 */


import javax.swing.JOptionPane;
    public class Lt1_Ex2 {
        public static void main (String args []){
            double Salario, Reajuste;
            Salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor do Salário"));
            Reajuste = Salario * 1.15;
            System.out.println("O Salário do Reajuste é: " + Reajuste);
        }
    }