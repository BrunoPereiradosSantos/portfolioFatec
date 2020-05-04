/* Objetivo: 43.	Calcule e mostre quantos anos serão necessários para que Ana seja maior que Maria sabendo que Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m e cresce 2 cm ao ano.
 * Programador: Bruno Pereira dos Santos.
 * Data: 18/03/2019
 */

public class Lt1_Ex43_Function{
    public static void main(String[] args) {
        double Anos = 0, Ana=1.10, Maria=1.50;
        
         System.out.println(Função(Ana, Maria, Anos));
        
}
    static double Função( double Ana, double Maria, double Anos){
        Anos = 0;
        Ana = 1.10;
        Maria = 1.50;
        while (Ana < Maria){
         Ana = Ana + 0.03;
         Maria = Maria + 0.02;
         Anos = Anos + 1;
        }
     
        return Anos;
    }}