/* Objetivo: 33.	Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.
 * Programador: Bruno Pereira dos Santos 
 * Data: 15/03/2019
 */

import javax.swing.JOptionPane;
public class Lt1_Ex33Function{
    public static void main(String[] args) {
    double N, A = 0, Série;
   double Soma = 0;
    N = Integer.parseInt(JOptionPane.showInputDialog("Digite o Valor de N: "));
    Soma = função(N);
    
    
    }
    static double função(double N){
        double Série;
        double Soma = 0, i;
        for (i = N; i >= 1; i --){
            Série = 1/i;
            Soma = Soma + Série;
            System.out.println("A série é: " +Soma);
            
           
        }
        
       return Soma;
        
    }
}
