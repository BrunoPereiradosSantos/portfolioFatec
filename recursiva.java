/** Objetivo     :  Criar Um Algoritmo Recursivo
                    
Programador:        Bruno Pereira dos Santos   
Data       :        30/08/2018
*/

import javax.swing.JOptionPane;
    public class recursiva {
        static int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o Valor de N:"));
        public static void main (String args []){
            System.out.println("Mostre o Valor de N: "+Recursiva01(n));
        }
        static int Recursiva01 (int num){
            int x;
            if (num==1)
            {
                return 1;
            }
            else 
            {
                x= num*Recursiva01(num-1);
                return x;
            }
           
                
    }
    }