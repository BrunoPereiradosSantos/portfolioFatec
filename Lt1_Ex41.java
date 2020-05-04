/* Objetivo: 41.	Mostre todas as possibilidades de 2 dados de forma que a soma tenha como resultado 7.
 * Programador: Bruno Pereira dos Santos
 * Data: 18/03/2019
 */
import javax.swing.JOptionPane;
public class Lt1_Ex41{
    public static void main(String[] args) {
        int D1=1, D2=1;
        while (D1 <=6){
            D2 = 1;
        
        while (D2 <=6){
            if (D1 + D2 == 7){
                System.out.println("A Soma dos Dados é: " + D1 + " e "+D2 );
            }
            D2 = D2 +1;
            
           
        }
        D1 = D1 +1;
    }
}}
