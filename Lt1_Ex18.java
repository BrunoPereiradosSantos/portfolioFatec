/* Objetivo: 18.	Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do maior pelo menos valor.
 * Programador: Bruno Pereira dos Santos
 * Data: 11/03/2013
 */


import javax.swing.JOptionPane;
public class Lt1_Ex18{
    public static void main(String[] args) {
        double Val1, Val2, Resultado;
        Val1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Primeiro valor"));
        Val2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Segundo valor"));
       
        if (Val1 > Val2){
           Resultado = Val1 - Val2; 
        }
        else{
            Resultado = Val2 - Val1;
        }
        System.out.println("A Diferença do Maior Pelo Menor é: " + Resultado);
    }
}