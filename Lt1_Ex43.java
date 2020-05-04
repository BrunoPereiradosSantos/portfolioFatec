/* Objetivo: 43.	Calcule e mostre quantos anos serão necessários para que Ana seja maior que Maria sabendo que Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m e cresce 2 cm ao ano.
 * Programador: Bruno Pereira dos Santos.
 * Data: 18/03/2019
 */


import javax.swing.JOptionPane;
public class Lt1_Ex43{
    public static void main(String[] args) {
        double Anos = 0, Ana = 1.10, Maria = 1.50;
        while (Ana < Maria){
            Ana = Ana + 0.03;
            Maria = Maria + 0.02;
            Anos = Anos +1;
        }
        System.out.println(" A Quantidade de Anos Necessária é: "+ Anos);
    }
}