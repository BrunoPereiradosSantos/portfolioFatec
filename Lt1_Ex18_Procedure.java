/* Objetivo: 18.	Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do maior pelo menos valor.
 * Programador: Bruno Pereira dos Santos
 * Data: 11/03/2013
 */

import javax.swing.JOptionPane;
public class Lt1_Ex18_Procedure{
    static double Val1, Val2, Resultado;
    public static void main(String[] args) {
       Val1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor"));
       Val2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo Valor"));
       ProcedureResultado();
       JOptionPane.showMessageDialog(null,"A diferença dos valores é: " + Resultado);
    }
  static void  ProcedureResultado (){
      if (Val1 > Val2){
          Resultado = Val1 - Val2;
      }
      else {
          Resultado = Val2 - Val1;
      }
  }
}