/* Objetivo: 23.	Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não necessariamente em ordem. Mostre os 4 números em ordem crescente.
 * Programador: Bruno Pereira dos Santos.
 * Data: 07/03/2019
 */


import javax.swing.JOptionPane;
public class Lt1_Ex23 {
    public static void main(String[] args) {
        double valor1, valor2, valor3, valor4;
        valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Primeiro Valor: "));
        valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Segundo Valor: "));
        valor3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Terceiro Valor: "));       
        valor4 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Quarto Valor: "));
        if (valor1 > valor4){
            System.out.println(" A sequência é: " +valor4 + " " +valor1+ " "+valor2+ " "+valor3);
        }
        else if (valor4 < valor2){
            System.out.println("A Sequência é: " +valor1 +" "+valor4+" "+valor2+" "+valor3);
        }
        else if (valor4<valor3){
            System.out.println("A Sequência é: "+valor1+ " "+valor2+" "+valor4+" "+valor3);
        }
        else{
            System.out.println("A Sequência é: "+valor1+" "+valor2+" "+valor3+" "+valor4);
        }
    }
}