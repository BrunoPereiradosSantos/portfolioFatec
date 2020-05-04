/* Objetivo: Criar e carregar uma matriz [4][4] com valores aleatórios, sendo que a diagonal principal terá seus dados carregados no programa segundo:
 * Programador: Bruno Pereira dos Santos
 * Data: 09/04/2019 
 */



public class Mat9_Ex9{
    public static void main(String[] args) {
        int mat [][] = new int [4][4];
        int i, j = 0;
        for (i = 0; i < mat.length; i ++){
            for (j = 0; j < mat.length; j++){
                if(i == j){
                 mat[i][j] = (int)Math.pow(4,i);   
                }
                else {
                    mat[i][j] = (int)(Math.random()*1000);
                }
                
            }
        }
        for (i = 0; i < 4; i++){
           for (j = 0; j < 4; j++){
               System.out.print(" " +mat[i][j]);
           }
           System.out.print("\n");
        
        }
    }
}
  


