/* Objetivo: 26.	Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor.
 * Programador: Bruno Pereira dos Santos.
 * Data: 11/03/2019
 */


import javax.swing.JOptionPane;
public class Lt1_Ex26{
    public static void main(String[] args) {
        double A, B;
        A = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor de A"));
        B = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor de B"));
        if (A == B){
            System.out.println("São Iguais, portanto, múltiplos");
        }
        else if(A > B && A%B==0){
           System.out.println("A é Maior e Múltiplo de B"); 
            
        }
        else if (B > A && B%A==0){
            System.out.println("B é maior e múltiplo de A");
            
        }
        else {
            System.out.println("Não há múltiplos");
        }
    }
}