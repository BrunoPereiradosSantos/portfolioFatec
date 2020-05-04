/* Objetivo: 45.	Calcule e mostre a série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225
 * Programador: Bruno Pereira dos Santos
 * Data: 18/03/2019
 */


import javax.swing.JOptionPane;
public class Lt1_Ex45{
    public static void main(String[] args) {
        int X1=1, X2=1;
        while (X1 < 15){
            X1 = X1 + 1;
            X2 = X1 * X1; 
        }
        System.out.println( " O Resultado da série é: " + X1+ " e " + X2);
    }
}
