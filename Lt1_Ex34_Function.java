/* Objetivo: 34.	Receba um número. Calcule e mostre os resultados da tabuada desse número.
 * Programador: Bruno Pereira dos Santos
 * Data: 15/03/2019
 */

import javax.swing.JOptionPane;
public class Lt1_Ex34_Function{
    public static void main(String[] args) {
        double N, Tab;
        N = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor de N: "));
        Tab = função(N);
    }
    static double função(double N){
        double i, Tab=0;
        for (i = 0; i <= 10; i ++){
            Tab = N*i;
            System.out.println("A Tabuada de: " +N+  " é = " + Tab);
        }
        return i;
    }
}


