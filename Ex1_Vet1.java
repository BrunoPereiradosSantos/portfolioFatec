/* Objetivo: 1. Criar e coletar um vetor [50] inteiro. Calcular e exibir:
a. A média dos valores entre 10 e 200;
b. A soma dos números ímpares.
 * Programador: Bruno Pereira dos Santos
 * Data: 28/03/2019
 */


import javax.swing.JOptionPane;
public class Ex1_Vet1{
    public static void main(String[] args) {
        int vet [] = new int [50];
        int i, soma=0, média=0, média2=0, ímpar=0;
        for (i = 1; i <= 50; i++){
         vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite Um Valor"));
         if (vet[i] > 10 && vet[i] <= 200 ){
             soma = soma + vet[i];
             
         }
         if (vet[i] % 2 == 1){
             média = média + 1;
             ímpar = ímpar + vet[i];
             média2 = ímpar/média;
             
         }
        }
        System.out.println(" A Soma dos números entre 10 e 200 é: " + vet[média]); 
        System.out.println(vet[média2]);
        System.out.println(vet[ímpar]);
    }
}