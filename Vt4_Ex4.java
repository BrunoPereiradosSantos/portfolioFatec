/* Objetivo: Criar e coletar em um vetor [30] real e calcular e exibir:
a. A média do grupo;
b. A quantidade de notas acima do grupo;
c. As posições dos valores abaixo da média do grupo.
 *  Programador: Bruno Pereira dos Santos
 * Data: 04/04/2019
 */


public class Vt4_Ex4{
    public static void main(String[] args) {
        int vetor [] = new int [30],i;
        double carregar = 0;
        double media, acimaDoGrupo=0, abaixoDaMedia=0;
        for (i = 0; i < vetor.length; i ++){
            vetor[i] = (int)(Math.random() * 100);
            carregar+= vetor[i];
            System.out.println("Os valores carregados  no vetor " +i+ " são: "+carregar);
        }
        media = carregar/30;
        System.out.println( " A Media é: " +media);
        
        for (i = 0; i < vetor.length; i ++){
             if (vetor[i] > acimaDoGrupo){
                 acimaDoGrupo++;
                }
            if (vetor[i] < media){
               abaixoDaMedia++;   
        }
    }
        System.out.println("Acima do Grupo é: "+acimaDoGrupo);
         System.out.println("abaixo da media é: "+abaixoDaMedia);
    }
}
