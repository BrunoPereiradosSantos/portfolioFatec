/** Objetivo     :  Criar Um Algoritmo Recursivo
                    Coletar um n Positivo. Calcule e mostre o resultado  da série 1/(n)+2/(n-1)+3/(n-2)...+n/1
Programador:        Bruno Pereira dos Santos   
Data       :        30/08/2018
*/

import javax.swing.JOptionPane;
    public class Rec06 {
        static int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o Valor de N: "));
        public static void main (String args []){
            System.out.println("Mostre o Valor da Série: "+Recursiva(n,1));   
        }
        static double Recursiva (double num,double i){
            double x;
            if (num==1)
            {
                return i;
            }
            else 
            {
                x=(i/num)+(Recursiva(num-1,i+1));
                return  x;
            }
        }
    }