/** Objetivo     :  Criar Um Algoritmo Recursivo
                    Coletar um n Positivo. Calcule e mostre o resultado  da série 1 = n+(n-1)+(n-2)+...1
Programador:        Bruno Pereira dos Santos   
Data       :        30/08/2018
*/

import javax.swing.JOptionPane;
    public class Rec04 {
        static int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o Valor de N: "));
        public static void main (String args []) {
            System.out.println("O Valor da série é: "+Recursiva (n)); 
        }
        static int Recursiva (int num){
            
           int x;
                if (num==1)
                {
            return 1;
                }
                    else 
                {
                    x=num+Recursiva(num-1);
                    return x;
                }
        
            
        
        }
                
    }