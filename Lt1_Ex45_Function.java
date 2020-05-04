/* Objetivo: 45.	Calcule e mostre a série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225
 * Programador: Bruno Pereira dos Santos
 * Data: 18/03/2019
 */

import javax.swing.JOptionPane;
public class Lt1_Ex45_Function{
    public static void main(String[] args) {
        int x1 = 1, x2=1;
        System.out.println(Função(x2, +x1));
    }
    static int Função(int x1, int x2){
        int i;
        for(i = 1; i < 15; i++ ){
            x1 = x1 + 1;
            x2 = x1 * x1; 
        }
        return i;
    }
}