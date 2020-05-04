/** Objetivo     :  Criar Um Algoritmo Recursivo
                    Coletar um n Positivo. Calcule e mostre o resultado  da série 1/(n)+1/(n-1)+1/(n-2)...+n/1
Programador:        Bruno Pereira dos Santos   
Data       :        30/08/2018
*/

import javax.swing.JOptionPane;
    public class Rec05 {
        static int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o Valor de N: "));
        public static void main (String args []){
            System.out.println("Mostre o Valor da Série: "+Recursiva(n));   
        }
        static double Recursiva (double num){
            double x;
            if (num==1)
            {
                return 1;
            }
            else 
            {
                x=(1/num)+(Recursiva(num-1));
                return  x;
            }
        }
    }
