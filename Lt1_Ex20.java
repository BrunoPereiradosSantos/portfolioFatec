/* Objetivo: 20.	Receba 3 coeficientes A, B, e C de uma equação do 2º grau da fórmula AX²+BX+C=0. Verifique e mostre a existência de raízes reais e se caso exista, calcule e mostre.
 * Programador: Bruno Pereira dos Santos
 * Data: 11/03/2019
 */

import javax.swing.JOptionPane;
public class Lt1_Ex20{
    public static void main(String[] args) {
        double A, B, C, Delta,X1, X2;
        A = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor de A: "));
        B = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor de B: "));
        C = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor de C: "));
        Delta = (B * B)-(4 * A * C);
            if (Delta > 0)
                {
                Delta = Math.sqrt(Delta);
                X1 = (-B + Delta)/(2 * A); 
                X2 = (-B - Delta)/(2 * A);
                JOptionPane.showMessageDialog(null,"Valor de X1 é Igual: "+X1+" Valor de X2 é Igual: "+X2);
                }
                else if (Delta == 0)
                    {
                    X1 = (-B / (2 * A));
                    JOptionPane.showMessageDialog(null,"O Valor de X1 é: " +X1);
                    }
                    else 
                    {
                    
                    JOptionPane.showMessageDialog(null,"Não Há Raízes");
                    }
        }
    }

