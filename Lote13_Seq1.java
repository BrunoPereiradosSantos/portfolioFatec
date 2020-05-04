import javax.swing.JOptionPane;

/*Criar e coletar um vetor [50] inteiro.Calcular e exibir:
a. A média dos valores entre 10 e 200;
b. A soma dos números ímpares.*/
public class Lote13_Seq1 {
    public static void main(String args[]){
        int opc = 0;
        int[] vetor = new int[1];
        while (opc != 9){
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Carrega vetor\n2 - Mostra vetor\n3 - Media dos valores entre x e y\n4 - Soma dos números ímpares\n9 - Finaliza programa"));
            switch (opc){
                case 1: vetor = ColetarVetor();
                    break;
                case 2: MostraVetor(vetor);
                    break;
                case 3: System.out.println("Media entre os valores = " + MediaEntreValores(Integer.parseInt(JOptionPane.showInputDialog("Insira o valor inicial")),Integer.parseInt(JOptionPane.showInputDialog("Insira o valor final")),vetor));break;
                case 4: System.out.println("Soma dos ímpares = "+SomaImpares(vetor));break;
                case 9:
                    JOptionPane.showMessageDialog(null, "Fim");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
            }
        }

    }
    static int[] ColetarVetor(){
        int[]v = new int[50];
        for (int i = 0; i < v.length; i++){
            v[i] = (int)(Math.random()*300);
        }
        return v;
    }
    static void MostraVetor(int[] v){
        for (int i = 0; i < v.length; i++){
            System.out.println("v["+i+"] = "+v[i]);
        }
    }
    static double MediaEntreValores(int inicio, int fim, int[] v){
        double soma = 0;
        int elementos = 0;
        for (int i = 0; i < v.length; i++){
            if (v[i] >= inicio && v[i] <= fim){
                soma += v[i];
                elementos++;
            }
        }
        return soma/(double)elementos;
    }
    static int SomaImpares(int[] v){
        int soma = 0;
        for (int i = 0; i < v.length; i++){
            if (v[i]%2 != 0){
                soma+=v[i];
            }
        }
        return soma;
    }
}