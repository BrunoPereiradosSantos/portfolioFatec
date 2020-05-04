/* Objetivo: Criar e carregar uma matriz [4][3] inteiro com quantidade de produtos
vendidos em 4 semanas. Calcular e exibir:
a. A quantidade de cada produto vendido no mês;
b. A quantidade de produtos vendidos por semana;
c. O total de produtos vendidos no mês.
 * Programador: Bruno Pereira dos Santos
 * Data: 28/03/2019
 */

public class Mat_Ex8 {
    public static void main(String[] args) {
        int Mat[][]=new int[4][3];
        int x,y,Total=0;
        int VetProd[]=new int[3];
        int VetSemana[]=new int[4];
        
        for(x=0;x<4;x++){
            for(y=0;y<3;y++){
                Mat[x][y]=(int)(Math.random()*100);
                Total+=Mat[x][y];               
                VetSemana[x]+=Mat[x][y];
                VetProd[y]+=Mat[x][y];
            }
                       
        }  
        for(x=0;x<4;x++){
            for(y=0;y<3;y++){
                System.out.print(" "+Mat[x][y]);
            }
            System.out.print("\n");   
        }
         System.out.println("O total de produtos vendidos no mês é: "+Total); 
            for(x=0;x<4;x++){
                System.out.println("A quantidade de produtos " +x+ " vendidos na semana é "+VetSemana[x]);
                }
            for(y=0;y<3;y++){
                System.out.println("A quantidade de cada produto " +y+ " vendido no mes é "+VetProd[y]);
            }
    }
    
}