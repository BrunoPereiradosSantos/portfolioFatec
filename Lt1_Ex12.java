/* Objetivo: 12.	Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade e quantos anos terá daqui a 17 anos.
 * Programador: Bruno Pereira dos Santos
 * Data: 07/03/2019
 */

import javax.swing.JOptionPane;
    public class Lt1_Ex12 {
        public static void main (String args []){
           double anoNasc, Idade, anoAtual,ano17;
           anoNasc = Double.parseDouble(JOptionPane.showInputDialog("Digite o Ano de Nascimento"));
           anoAtual = Double.parseDouble(JOptionPane.showInputDialog("Digite o Ano Atual"));
           Idade = anoAtual - anoNasc;
           ano17 = Idade + 17;
           System.out.println("A Sua Idade é: " + Idade + " anos "  + " Daqui 17 anos Você Terá: " + ano17 + " anos");
        }
    }