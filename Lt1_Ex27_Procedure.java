/* Objetivo: 27.	Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos). Calcule e mostre a velocidade média em km/h.
 * Programador: Bruno Pereira dos Santos
 * Data: 07/03/2019
 */

import javax.swing.JOptionPane;
public class Lt1_Ex27_Procedure{
    static double numVoltas,extCircuito, tempoDuração, velocidadeMédia;
    public static void main(String[] args) {
        numVoltas = Double.parseDouble(JOptionPane.showInputDialog("Digite O numero de voltas: "));
        extCircuito = Double.parseDouble(JOptionPane.showInputDialog("Digite a extenção do circuito: "));
        tempoDuração = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo de duração"));
        ProcedureMédia();
        JOptionPane.showMessageDialog(null," A velocidade média é: " + velocidadeMédia+ "km/h ");
    }
    static void ProcedureMédia(){
        if (numVoltas <= 0){
            velocidadeMédia = (extCircuito/tempoDuração)*0.06;
    }
        else{
            velocidadeMédia = ((numVoltas*extCircuito)/tempoDuração)*0.06;
        }
    }
}