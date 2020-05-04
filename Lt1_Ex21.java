/* Objetivo: 21.	Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética. Mostre a mensagem de acordo com a média:
a.	Se a média for >= 6,0 exibir “APROVADO”;
b.	Se a média for >= 3,0 ou < 6,0 exibir “EXAME”;
c.	Se a média for < 3,0 exibir “RETIDO”.

 * Programador: Bruno Pereira dos Santos 
 * Data: 13/03/2019
 */


import javax.swing.JOptionPane;
public class Lt1_Ex21{
    public static void main(String[] args) {
        double nota1, nota2, nota3, nota4, média;
        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Primeiro Valor: "));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Segundo Valor: "));
        nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Terceiro Valor: "));
        nota4 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Quarto Valor: "));
        média = (nota1 + nota2+ nota3 + nota4) / 4;
        if (média >= 6){
            System.out.println("APROVADO");
        }
        else if (média >=3 || média <6){
            System.out.println("EXAME");
        }
        else{
            System.out.println("RETIDO");
        }
    }
}