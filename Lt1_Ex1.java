/*Objetivo: 1.	Coletar o valor do lado de um quadrado, calcular sua área e apresentar o resultado.
 *Programador: Bruno Pereira dos Santos
 *Data: 07/03/2019 
 */

import javax.swing.JOptionPane;
    public class Lt1_Ex1 {
        public static void main (String args []){
            int Lado, Quadrado;
            Lado = Integer.parseInt(JOptionPane.showInputDialog("Digite o Valor de Lado"));
            Quadrado = Lado * Lado;
            System.out.println("O Valor do Quadrado é: "+ Quadrado);
        }
    }