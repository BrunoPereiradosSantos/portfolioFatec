/* Objetivo: 17.	Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média.
 * Programador: Bruno Pereira dos Santos.
 * Data: 07/03/2019.
 */

import javax.swing.JOptionPane;
public class Lt1_Ex17 {
    public static void main (String args []){
        double tempoPercurso, velocidadeMédia, litrosGastos;
        tempoPercurso = Double.parseDouble(JOptionPane.showInputDialog("Digite o Tempo do Percurso"));
        velocidadeMédia = Double.parseDouble(JOptionPane.showInputDialog("Digite a Velocidade Média"));
        litrosGastos = (tempoPercurso * velocidadeMédia) /12;
        System.out.println("A Quantidade de Litros Gastos é: " + litrosGastos + " litros ");
    }
}