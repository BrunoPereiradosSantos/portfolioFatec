/* Objetivo: 44.	Receba o número da base e do expoente. Calcule e mostre o valor da potência.
 * Prograador: Bruno Pereira dos Santos.
 * Data: 18/03/2019
 */
import javax.swing.JOptionPane;
public class Lt1_Ex44_Function{
    public static void main(String[] args) {
        double base, expoente, resposta;
        base = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de Base: "));
        expoente = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Expoente"));
        resposta = Função(base, expoente);
        System.out.println(resposta);
        
    }
    static double Função(double base, double expoente){
        double i = 0;
        
        double resposta = 1;
        while (i > expoente){
          resposta = resposta * base; 
          i = i+1;
        }
        
        return resposta;
        
    }
}