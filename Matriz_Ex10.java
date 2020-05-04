/* Objetivo: Criar uma matriz [8][8] onde o programa irá carregar segundo
 * Programador: Bruno Pereira dos Santos
 * Data: 09/04/2019
 */

public class Matriz_Ex10{
    public static void main(String[] args) {
        int Matriz[][] = new int [8][8];
        int i, j, soma = 0, aux = 1;
        
        for (i = 0; i < Matriz.length; i++){
            for(j = 0; j < Matriz.length; j++){
                Matriz[i][j] = aux;
                soma +=Matriz[i][j];
                aux+=aux;
                }
                      
            }
        for (i = 0; i<Matriz.length; i++){
            for (j = 0; j<Matriz.length; j ++){
                System.out.print(" " +Matriz[i][j]);
            }
            System.out.print("\n");
        }
        System.out.print(" o valor da soma é: " +soma);
        }
    }
        
             
  