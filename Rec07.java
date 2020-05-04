/** Objetivo     :  Criar Um Algoritmo Recursivo
                    Coletar um n Positivo. Calcule e mostre o resultado  da série N!+(n-1)!+(n-2)!...+1!
Programador:        Bruno Pereira dos Santos   
Data       :        30/08/2018
*/

/** Objetivo     :  Rec03
                    Calcule e mostre a soma dos 100 numeros (1+2+3+...+100)
Programador:        Bruno Pereira dos Santos   
Data       :        30/08/2018
*/

import javax.swing.JOptionPane;

    public class Rec07 {
        static int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o Valor de N: "));
        public static void main (String args []) {
             System.out.println("Mostre fatorial : "+fat(n));
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
                x = fat(n)+RecursivaSerie(n-1);
               // System.out.println("Mostre n: "+n+"fat"+fat(n));
                return x;
            }
            
        }
       static int fat(int i) {
           int x=0;
            if (i==1)
            {
                return 1;
            }
            else 
            {
               
                x= i*fat(i-1);
              System.out.println("Mostre x: "+x);
                return x;
           
       } 
       }
    }
    