/* Objetivo: 5.	Receba os coeficientes A, B e C de uma equação do 2º grau (AX²+BX+C=0). Calcule e mostre as raízes reais (considerar que a equação possue2 raízes).
 * Programador: Bruno Pereira dos Santos
 * Data: 07/03/2019
 */

import javax.swing.JOptionPane;
public class Lt1_Ex5 {
    public static void main (String args []){
        double A, B, C, Delta, X1, X2;
        A = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de A"));
        B = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de B"));
        C = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de C"));
        Delta = (B*B)- (4*A*C);
        X1 = (-B + Math.sqrt(Delta))/(2 * A); 
        X2 = (-B - Math.sqrt(Delta))/(2 * A);
        System.out.println("o valor de x1 é: "+X1);
        System.out.println("o valor de x2 é: "+X2);
        
    }
}