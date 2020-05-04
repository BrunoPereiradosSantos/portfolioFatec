/* Objetivo: 31.	Calcule e mostre o quadrado dos números entre 10 e 150.
 * Programador: Bruno Pereira dos Santos
 * Data: 15/03/2019
 */

import javax.swing.JOptionPane;
public class Lt1_Ex31Function{
    public static void main(String[] args) {
        int I=1, retorno, A=0;
        retorno = função(A);
        
        
    }
    static int função( int A){
      int I = 0;
        for (I = 10; I <=150; I++){
          
        A = I*I;
        System.out.println(+ A);
      }
     
      return A;
    }
    
}


