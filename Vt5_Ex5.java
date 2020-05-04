/* Objetivo: Criar e coletar em um vetor [20] inteiro. Calcule e exiba, segundo: 10 Σ (A[1] – A[21–1]) i = 1
 * Programador: Bruno Pereira dos Santos.
 * Data: 04/04/2019
 */

public class Vt5_Ex5{
    public static void main(String[] args) {
        int vetor [] = new int [20];
        int i, soma=0;
        for (i = 0; i < vetor.length; i++){
            vetor[i] = (int)(Math.random() * 100);   
            System.out.println(vetor[i]);
    }
        
        for (i = 0; i < 10; i++){
         soma = soma + (vetor[i] - vetor[19-i]);
        }
        System.out.println("o resulado é: " +soma);
    }
}


