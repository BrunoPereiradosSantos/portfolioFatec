/* Objetivo: 42.	Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99
 * Programador: Bruno Pereira dos Santos
 * Data: 18/03/2019
 */


import javax.swing.JOptionPane;
public class Lt1_Ex42{
    public static void main(String[] args) {
        double I, N1=0, N2=0;
        for (I = 1; I <=49; I++){
          N1 = N1 +1;
          N2 = N2 + 2;
        }
        System.out.println(" O Resultado da Série é: " + N1 + " e " +N2);
    }
}