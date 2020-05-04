/* Objetivo: 13.	Receba a quantidade de alimento em quilos. Calcule e mostre quantos dias durará esse alimento sabendo que a pessoa consome 50g ao dia.
 * Programador: Bruno Pereira dos Santos.
 * Data: 07/03/2019
 */

import javax.swing.JOptionPane;
    public class Lt1_Ex13 {
        public static void main (String args []){
            double aliQuilos,consumoDiario, qtdDias;
            aliQuilos = Double.parseDouble(JOptionPane.showInputDialog("Digite A Quantidade de Alimentos"));
            consumoDiario = 50;
            qtdDias = aliQuilos / 50;
            System.out.println("O Alimento será Consumido em: " + qtdDias + " dias " );
        }
    }
