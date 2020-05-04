/* Objetivo: 7.	Receba os valores do comprimento, largura e altura de um paralelepípedo. Calcule e mostre seu volume.
 * Programador: Bruno Pereira dos Santos.
 * Data: 07/03/2019
 */

import javax.swing.JOptionPane;
public class Lt1_Ex7 {
    public static void main (String args []){
        double Larg, Alt, Comp, Vol;
        Larg = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor de Largura"));
        Alt =  Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor de Altura"));
        Comp = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor de Comprimento"));
        Vol = Larg * Alt * Comp;
        System.out.println("O Volume do Paralelepípedo é: "+ Vol);
    }
}