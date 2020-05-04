/* Objetivo: 35.	Receba 2 números inteiros, verifique qual o maior entre eles. Calcule e mostre o resultado da somatória dos números ímpares entre esses valores.
 * Programador: Bruno Pereira dos Santos
 * Data: 15/03/2019
 */

import javax.swing.JOptionPane;
public class Lt1_Ex35_Function{
    public static void main(String[] args) {
        double A, B;
        A = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor de A: "));
        B = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor de B"));
      
        System.out.println(" A soma dos ìmpares é: "+ função(A, B));
    }
    static double função(double A, double B){
       double I, C = 0; 
       if (A > B){
           for (I = B; I < A; I++){
              if (I % 2 == 1){ 
                  C = C + I;
              }
              
           }
       }
       else {
           for (I = A; I < B; I++){
               if (I % 2 == 1){
                   C = C + I;
               }
           }
       }
       return C;
    }
}
