/** Objetivo     :  Rec03
                    Calcule e mostre a soma dos 100 numeros (1+2+3+...+100)
Programador:        Bruno Pereira dos Santos   
Data       :        30/08/2018
*/

import javax.swing.JOptionPane;
    public class Rec03 {
        static int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o Valor de N: "));
        public static void main (String args []) {
            System.out.println("Mostre o Valor da Série: "+RecursivaSerie(n));
        }
        static int RecursivaSerie (int n){
            int x;
            if (n==1)
            {
                return 1;
            }
            else 
            {
                x=n+RecursivaSerie(n-1);
                return x;
            }
        }
        
    }