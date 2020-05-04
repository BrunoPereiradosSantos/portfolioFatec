/* Objetivo: 41.	Mostre todas as possibilidades de 2 dados de forma que a soma tenha como resultado 7.
 * Programador: Bruno Pereira dos Santos
 * Data: 18/03/2019
 */

import javax.swing.JOptionPane;
public class Lt1_Ex41_Function{
    public static void main(String[] args) {
      int D1=1,D2=1, dado;
      dado = Função(D1,D2);
      
    }
    static int Função(int D1, int D2){
        int dado=0;
     while (D1 <=6){
         D2 = 1;
         while (D2 <=6){
             if (D1 + D2 == 7){
                System.out.println(+Função(D1,D2));
             }
             D2 = D2 + 1;
         }
         D1 = D1 + 1;
         dado = D1 + D2;
     }   
     return dado;   
    }
    
    
}


