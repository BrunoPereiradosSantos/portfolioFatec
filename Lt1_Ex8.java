/* Objetivo: 8.	Receba o valor de um depósito em poupança. Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m.
 * Programador: Bruno Pereira dos Santos    
 * Data: 07/03/2019
 */

import javax.swing.JOptionPane;
public class Lt1_Ex8{
    public static void main (String args []){
        double Dep, Mês;
        Dep = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor do Deposito"));
        Mês = Dep * 1.013;
        System.out.println("O Valor de Aplicação é: " +Mês);
    }
}

