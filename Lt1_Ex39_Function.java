/* Objetivo: 39.	Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde:
Casa: 	1	2	3	4	...	64
Qdte:	1	2	4	8	...	N
 * Programador: Bruno Pereira dos Santos
 * Data: 18/03/2019
 */

import javax.swing.JOptionPane;
public class Lt1_Ex39_Function{
    public static void main(String[] args) {
        double Q=1;
        System.out.println( +função(Q));
    }
    static double função( double Q){
        double I;
        for (I = 1; I < 64; I++){
            Q = Q*2;
        }
        return Q;
    }
}

