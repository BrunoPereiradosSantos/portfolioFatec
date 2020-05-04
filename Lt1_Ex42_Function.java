/* Objetivo: 42.	Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99
 * Programador: Bruno Pereira dos Santos
 * Data: 18/03/2019
 */

import javax.swing.JOptionPane;
public class Lt1_Ex42_Function{
    public static void main(String[] args) {
        double N1=0, N2=0;
       
        System.out.println(Função(N1, N2));
        
        
    }
    static double Função(double N1, double N2){
        double I;
        for (I = 1; I <= 49; I++){
            N1 = N1 + 1;
            N2 = N2 + 2;
           
        
        }
        
        
        return I;
       
    
}}