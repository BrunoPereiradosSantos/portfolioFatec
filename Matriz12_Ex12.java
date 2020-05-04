/* Objetivo: Carregar códigos das peças em um tabuleiro de xadrez, onde:
 * Programador: Bruno Pereira dos Santos
 * Data: 10/04/2019
 */

public class Matriz12_Ex12{
    public static void main(String[] args) {
        int Matriz[][] = new int [8][8];
        int vet[] = new int [7];
        int i, j;
        
        for (i = 0; i < Matriz.length; i ++){
            for (j = 0; j < Matriz.length; j++){
              Matriz[i][j]=(int)((Math.random()*7)+1);
             vet[(Matriz[i][j])-1]++;
             System.out.print(""+Matriz[i][j]);
                   
            }
            System.out.print("\n");
        }
    }
}
