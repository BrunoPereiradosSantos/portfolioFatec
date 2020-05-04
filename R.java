/** Objetivo     :  Criar Um Algoritmo Recursivo
                    
Programador:        Bruno Pereira dos Santos   
Data       :        30/08/2018
*/
 
import javax.swing.JOptionPane; 
    public class R {
        static int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o Valor Recursivo"));
        public static void main (String args []){
            System.out.println("O Valor Recursivo Ã©: "+Funcao(num));
        }
        
        
            static int Funcao(int n){
                    int x,cta;
                    x=1;
                    for (cta=n; cta>=1; cta--)
                    {
                        x=x*cta;
            
                    }
                    return x;
            }
    }
