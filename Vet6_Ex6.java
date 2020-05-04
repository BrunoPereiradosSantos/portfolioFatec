/* Objetivo: Criar e coletar em um vetor [20] com números aleatórios. Classificar este vetor em ordem crescente e mostre os dados.
 * Programador: Bruno Pereira dos Santos
 * Data: 04/04/2019
 */

public class Vet6_Ex6{
    public static void main(String[] args) {
        int vetor [] = new int [20];
        int i, j, aux;
        for (i = 0; i < vetor.length; i++){
            vetor[i] = (int)(Math.random () * 1000);
            System.out.println(vetor[i]);
            
        }
        for (i = 0; i < 19; i++){
            for (j = i+1; j < 20; j++){
                if (vetor[i] > vetor[j]){
                    aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
                
            }
        }
        for (i = 0; i < vetor.length; i++){
            System.out.print(" "+vetor[i]);
        }
    }
     static int buscabinaria( int x, int n, int vetor[]){
         int e = -1, d = n;
         while (e < d-1){
             int m = (e+d)/2;
             if (vetor[m] < x){
                 e = m;
             }
             else d = m;
         }
        return d;
    }
}

    
