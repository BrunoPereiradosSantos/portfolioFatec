/* Objetivo: Criar e coletar valores inteiros nos vetores VT1[3] e VT2[3]. Concatenar
esses valores em um 3º vetor (VT3[6]) e mostrar os seus dados. P. ex:
VT1| 1| 2| 3| |VT2| 4| 5| 6| |VT3| 1| 2| 3| 4| 5| 6
 * Programador: Bruno Pereira dos Santos
 * Data: 02/04/2019 
 */


public class Vt3_Ex3{
    public static void main(String[] args) {
        int vet1 [] = new int [3];
        int vet2 [] = new int [3];
        int vet3 [] = new int [6];
        for (int i = 0; i < vet1.length ; i++){
            vet1[i] = (int)(Math.random()*100);
        }
        for (int i = 0; i < vet2.length; i++ ){
            vet2[i] = (int)(Math.random() *300);
        }
        for (int i = 0; i < 6; i++){
            if(i < 3){
            vet3[i] = vet1[i]; 
            System.out.println(vet3[i]);
            }else{
             vet3[i] = vet2[i-3]; 
             System.out.println(vet3[i]);
            }
            
        }
       
    }
}