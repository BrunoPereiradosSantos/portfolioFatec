/* Objetivo: 27.	Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos). Calcule e mostre a velocidade média em km/h.
 * Programador: Bruno Pereira dos Santos
 * Data: 07/03/2019
 */

import javax.swing.JOptionPane;
public class Lt1_Ex27{
    public static void main(String[] args) {
        
        double numVoltas, extCircuito, temDuração, veloMédia;
        numVoltas = Double.parseDouble(JOptionPane.showInputDialog("Digite O Numero de Voltas"));
        extCircuito = Double.parseDouble(JOptionPane.showInputDialog("Digite A Extemção do Circuito"));
        temDuração = Double.parseDouble(JOptionPane.showInputDialog("Digite O Tempo de Duração"));
        if (numVoltas <= 0){
            veloMédia = (extCircuito/temDuração)*0.06; 
            System.out.println("A Velocidade Média é: " + veloMédia+ "km/h");
        }
        else{
            veloMédia = ((numVoltas*extCircuito)/temDuração)*0.06;
            System.out.println("A Velocidade Média é: " +veloMédia + "km/h");
        }
        
    }
}