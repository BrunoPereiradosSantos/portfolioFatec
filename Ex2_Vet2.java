/* Objetivo: Criar e coletar um vetor [100] inteiro e exibir:
a. O maior e o menor valor;
b. A média dos valores.
 * Programador: Bruno Pereira dos Santos
 * Data: 28/03/2019
 */


import javax.swing.JOptionPane;
    public class Ex2_Vet2 {
        public static void main (String args []){
            int vetor[] = new int[100];
		int maior = 0;
		int menor = 0;
		double soma_media = 0;
		double qnt_media = 0;
		double media = 0;
		
		for(int x = 0; x < 100; x++){
			vetor[x] = x+10;
			if (x == 0){
				maior = vetor[x];
				menor = vetor[x];
			}else{
				if(vetor[x] > maior){
					maior = vetor[x];
				}
				if(vetor[x] < menor){
					menor = vetor[x];
				}
			}
			soma_media = soma_media + vetor[x];
			qnt_media++;
		}
		media = soma_media/qnt_media;
		System.out.println("Média dos valores: "+media);
		System.out.println("Maior: "+maior);
		System.out.println("Menor: "+menor);
        }}